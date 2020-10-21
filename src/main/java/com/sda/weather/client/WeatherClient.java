package com.sda.weather.client;

import com.sda.weather.application.WeatherController;

import java.util.Scanner;

public class WeatherClient {

    private final WeatherController weatherController = new WeatherController();

    public void runClientInterface() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The application is running !");

        while (true) {
            System.out.println("Choose an option:  ");
            System.out.println("1. Add a location");
            System.out.println("2. Show added locations");
            System.out.println("3. Show weather information ");
            System.out.println("0. Close application");


            int response = scanner.nextInt();

            switch (response) {
                case 1:
                    addNewEntry();
                    break;
                case 2:
                    showAddLocation();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;

            }
        }
    }

    private void showAddLocation() {
        String response = weatherController.showAddLocation();
        System.out.println("All entered locations: "+ response);
    }

    private void addNewEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required details ! ");
        System.out.println("Enter a city name: ");
        String name = scanner.nextLine();
        System.out.println("Enter latitude: ");
        double latitude = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter longitude: ");
        double longitude = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter region: ");
        String region = scanner.nextLine();
        System.out.println("Enter country name: ");
        String country = scanner.nextLine();

        String response = weatherController.addNewEntry(name, latitude, longitude, region, country);
        System.out.println("Entered data: " + response + "\n");
    }
}

