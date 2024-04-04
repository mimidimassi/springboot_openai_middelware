package com.example.openaiapp.controller;

import com.example.openaiapp.ExternalAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/api")

public class ExternalAPIController {

    private final ExternalAPIService Service;

    @Autowired
    public ExternalAPIController(ExternalAPIService  Service) {
        this.Service = Service;
    }

    @GetMapping("/data")
    public String getExternalData() {
        return Service.fetchDataFromExternalAPI();
    }



    @PostMapping ("/create")
    public ResponseEntity<String> postExternalData(@RequestBody String requestBody) {
        return Service.postDataFromExternalAPI(requestBody);
    }





        @GetMapping("/hello") // Maps HTTP GET requests for the "/hello" path to this method
        public ResponseEntity<String> hello() {
            String jsonResponse = "{\"message\": \"Hello, Whhhhhhhhhhhorld!\"}";
            return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
        }
    }


