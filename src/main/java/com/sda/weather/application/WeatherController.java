package com.sda.weather.application;

public class WeatherController {

    private final WeatherService weatherService = new WeatherService();

    public String addNewEntry(String name, double latitude, double longitude, String region, String country) {
        Weather weather = weatherService.addNewEntry(name, latitude, longitude, region, country);
        return weather.toString();


    }
}
