package com.example.demo.controller;

import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
    private ApiService apiService;

    @GetMapping("/weather")
    public String getWeather(@RequestParam String city) {
        return apiService.getWeather(city);
    }
}
