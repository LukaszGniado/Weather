package com.sda.weather.application;

import java.time.Instant;

public class Weather {
    String name;
    double latitude;
    double longitude;
    String region;
    String country;
    Instant createDate;

    public Weather(String name, double latitude, double longitude, String region, String country, Instant createDate) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.region = region;
        this.country = country;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "{" +
                "'name':'" + name + '\'' +
                ", 'latitude':'" + latitude + '\'' +
                ", 'longitude':'" + longitude + '\'' +
                ", 'region':'" + region + '\'' +
                ", 'country':'" + country + '\'' +
                ", 'createDate':"+ createDate.toString()+ '\''+
                '}';
    }
}
