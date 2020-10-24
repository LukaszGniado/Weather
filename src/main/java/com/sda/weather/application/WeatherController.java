package com.sda.weather.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class WeatherController {

    private final WeatherService weatherService = new WeatherService();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public String addNewEntry(String name, double latitude, double longitude, String region, String country) {
        Weather weather = weatherService.addNewEntry(name, latitude, longitude, region, country);

        try {
            return objectMapper.writeValueAsString(weather);
        }catch (JsonProcessingException e){
            throw new RuntimeException("...");
        }


    }

    public String showAddLocation() {
        List<Weather> weathers = weatherService.showAddLocation();
        return weathers.toString();
    }
}
