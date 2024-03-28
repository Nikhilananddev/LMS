package com.lms.LMS.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/egg")
public class EasterEggController {

    private static final String NUMBERS_API_URL = "http://numbersapi.com";

    @GetMapping("/hidden-feature/{number}")
    public ResponseEntity<String> getNumberFact(@PathVariable("number") String number) {
        // Make a request to the Numbers API to get a fact about the number
        RestTemplate restTemplate = new RestTemplate();
        String url = NUMBERS_API_URL + "/" + number;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        
        // Return the fact as the response
        return ResponseEntity.ok(response.getBody());
    }
}
