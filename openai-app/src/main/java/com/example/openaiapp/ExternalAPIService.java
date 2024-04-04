package com.example.openaiapp;
import org.springframework.http.ResponseEntity;
public interface ExternalAPIService {
    String fetchDataFromExternalAPI();

    ResponseEntity<String> postDataFromExternalAPI(String requestBody);
}
