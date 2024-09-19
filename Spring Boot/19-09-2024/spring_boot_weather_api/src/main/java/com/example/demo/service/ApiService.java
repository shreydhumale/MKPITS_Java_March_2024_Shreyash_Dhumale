package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ApiService {
    private String apiKey="c0fed232ce2379f568d965d1007d70d3";
    
    private String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

    public String getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String url = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .queryParam("q", city)
                .queryParam("appid", apiKey)
                .queryParam("units", "metric")
                .toUriString();

        try {
            return restTemplate.getForObject(url, String.class);
        } catch (Exception e) {
            return "Weather data could not be fetched. Please check the city name.";
        }
    }
}
