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

weatherServiceClient.getWeather();

        Instant createdDate = Instant.now();
        Weather weather = new Weather(name, latitude, longitude, region, country, createdDate);
        Weather savedWeather = weatherRepository.saveNewWeather(weather);

        return savedWeather;
    }

    public List<Weather> showAddLocation() {
        return weatherRepository.showAddLocation();

    }
}


