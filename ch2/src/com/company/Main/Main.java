package com.company.Main;

import com.company.CurrentConditionDisplay;
import com.company.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay =
                new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 64, .4f);
        weatherData.setMeasurements(60, 89, .4f);
        weatherData.setMeasurements(90, 44, .2f);

    }
}
