package com.apilayer.service.api.utils;

import com.apilayer.exceptions.Http5xxException;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.*;

@Component
public class APIHandler {
    private final RestTemplate restTemplate;
    public APIHandler(RestTemplateBuilder restTemplateBuilder) {
        // initializing a RestTemplate instance
        // to perform API calls
        this.restTemplate = restTemplateBuilder.build();
    }

    // defining a utility function
    // to perform API calls
    public <T, R> ResponseEntity<R> callAPIOnce(
            String apiEndpoint,
            HttpMethod httpMethod,
            HttpHeaders httpHeaders,
            T requestBody,
            Class<R> classToConvertBodyTo
    ) {
        // performing the request
        return callAPI(
                apiEndpoint,
                httpMethod,
                httpHeaders,
                requestBody,
                classToConvertBodyTo
        );
    }
    @Retryable(
            // attempting up to 10 times
            maxAttempts = 10,
            // with a delay of 2 seconds between attempts
            backoff = @Backoff(delay = 2000),
            // when the Http5xxException is raised by the method
            retryFor = Http5xxException.class
    )
    public <T, R> ResponseEntity<R> callAPIWithRetryLogic(
            String apiEndpoint,
            HttpMethod httpMethod,
            HttpHeaders httpHeaders,
            T requestBody,
            Class<R> classToConvertBodyTo
    ) {
        try {
            // trying to perform the request
            return callAPI(
                    apiEndpoint,
                    httpMethod,
                    httpHeaders,
                    requestBody,
                    classToConvertBodyTo
            );
        } catch (RestClientResponseException e) {
            // in case of a 5xx error, throwing a custom
            // exception that triggers the retry logic
            if (e.getStatusCode().is5xxServerError()) {
                throw new Http5xxException(e.getMessage());
            }

            // some default behavior...

            throw e;
        }
    }

    private <T, R> ResponseEntity<R> callAPI(
            String apiEndpoint,
            HttpMethod httpMethod,
            HttpHeaders httpHeaders,
            T requestBody,
            Class<R> classToConvertBodyTo
    ) {
        // setting the HTTP headers and HTTP body (if present)
        HttpEntity<T> requestEntity = new HttpEntity<>(requestBody, httpHeaders);

        try {
            // performing the HTTP request
            return restTemplate.exchange(
                    apiEndpoint,
                    httpMethod,
                    requestEntity,
                    classToConvertBodyTo
            );
        } catch (RestClientException e) {
            // logging errors when the HTTP request fails
            // or there is an error in decoding the response
            e.printStackTrace();

            // other default behavior...
            // (e.g. register the error in an APM service, ...)

            throw e;
        }
    }
}