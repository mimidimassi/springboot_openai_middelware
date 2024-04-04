package com.example.openaiapp.service;

import com.example.openaiapp.ExternalAPIService;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class ExternalAPIServiceImp implements ExternalAPIService
{

    @Override
    public String fetchDataFromExternalAPI() {
        RestTemplate restTemplate = new RestTemplate();
        String EXTERNAL_API_URL = "http://localhost:5000";
        return restTemplate.getForObject(EXTERNAL_API_URL, String.class);
    }

    @Override
    public ResponseEntity<String> postDataFromExternalAPI(String requestBody) {
        RestTemplate restTemplate = new RestTemplate();
        String EXTERNAL_API_URL = "http://localhost:5000";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        return restTemplate.exchange(EXTERNAL_API_URL, HttpMethod.POST, requestEntity, String.class);
    }
}
