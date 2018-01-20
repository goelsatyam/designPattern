package com.company;

public class Main {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80.0F, 64.0F, 0.4F);
        weatherData.setMeasurements(60.0F, 89.0F, 0.4F);
        weatherData.setMeasurements(90.0F, 44.0F, 0.2F);

    }
}
