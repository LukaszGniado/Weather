package com.sda.weather.application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    double latitude;
    double longitude;
    String region;
    String country;
    Instant createDate;

    public Weather() {
    }

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
                ", 'createDate':" + createDate.toString() + '\'' +
                '}';
    }
}
