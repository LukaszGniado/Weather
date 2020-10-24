package com.sda.weather.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class LocationServiceTest {

    private final LocationService locationService = new LocationService();

    @Test
    void test1() {
        // when
        Weather weather = locationService.addNewLocation("London", 50, 50, "region", "country"); // todo change returned value to Location and develop this test
    }

    @Test
    void addNewLocation_whenCityNameIsEmpty_shouldThrowAnException() {
        // when
        assertThrows(Exception.class, () -> locationService.addNewLocation(" ", 50, 50, "region", "country"));
    }
}
