package com.sda.weather.application;

import java.time.Instant;
import java.util.List;

public class WeatherService {

    private final WeatherRepository weatherRepository = new WeatherRepository();
    private final WeatherServiceClient weatherServiceClient = new WeatherServiceClient();

    public Weather addNewEntry(String name, double latitude, double longitude, String region, String country) {

        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Content cannot be empty !");
        }
        if (latitude < -90 || latitude >90) {
            throw new RuntimeException("Enter a numeric value !");
        }
        if (longitude < -180 || longitude >180) {
            throw new RuntimeException("Enter a numeric value !");
        }
        if (region == null || region.isEmpty()) {
            throw new RuntimeException("Content cannot be empty !");
        }
        if (country == null || country.isEmpty()) {
            throw new RuntimeException("Content cannot be empty !");
        }



        Instant createdDate = Instant.now();
        Weather weather = new Weather(name, latitude, longitude, region, country, createdDate);
        Weather savedWeather = weatherRepository.saveNewWeather(weather);

        return savedWeather;
    }

    public List<Weather> showAddLocation() {
        return weatherRepository.showAddLocation();

    }
}


