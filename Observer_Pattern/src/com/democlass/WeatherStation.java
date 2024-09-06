package com.democlass;

public class WeatherStation {
    public static void main(String[] args) {
       WeatherData weatherData = new WeatherData();

       CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
       StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

       weatherData.setMeasurements(80, 65, 30.4f);
       weatherData.setMeasurements(82, 70, 29.5f);
       weatherData.setMeasurements(78, 66, 31.4f);
    }
}
