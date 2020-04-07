package com.accenture.js.intellicats.shop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StatusController {

    @GetMapping("/status")
    public Map<String, String> status() {
        Map<String, String> result = new HashMap<>();
        result.put("status", "OK");
        return result;
    }

}
