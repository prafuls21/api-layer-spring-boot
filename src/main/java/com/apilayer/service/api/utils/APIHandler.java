package com.apilayer.service.api.utils;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class APIHandler {
    private final RestTemplate restTemplate;
    public APIHandler(RestTemplateBuilder restTemplateBuilder) {
        // initializing a RestTemplate instance
        // to perform API calls
        this.restTemplate = restTemplateBuilder
                .build();
    }

    // defining an utility function
    // to perform API calls
    public <T, R> ResponseEntity<R> callAPI(
            String apiEndpoint,
            HttpMethod httpMethod,
            HttpHeaders httpHeaders,
            T requestBody,
            Class<R> classToConvertBodyTo
    ) {
        // setting the HTTP headers and the HTTP body (if present)
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
            // logging error
            e.printStackTrace();

            // other default behavior...
            // (e.g. register the error in an APM service, ...)

            throw e;
        }
    }
}