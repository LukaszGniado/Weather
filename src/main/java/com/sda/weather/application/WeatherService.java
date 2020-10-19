package com.sda.weather.application;

import java.time.Instant;

public class WeatherService {

    private final WeatherRepository weatherRepository = new WeatherRepository();

    public Weather addNewEntry(String name, double latitude, double longitude, String region, String country) {

        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Content cannot be empty !");
        }
        if (latitude == 0) {
            throw new RuntimeException("Enter a numeric value !");
        }
        if (longitude == 0) {
            throw new RuntimeException("Enter a numeric value !");
        }
        if (region == null || region.isEmpty()) {
            throw new RuntimeException("Content cannot be empty !");
        }
        if (country == null || country.isEmpty()) {
            throw new RuntimeException("Content cannot be empty !");
        }

        Weather weather = weatherRepository.saveNewWeather(new Weather(name, latitude, longitude, region, country, Instant.now()));
        return weather;
    }
}


