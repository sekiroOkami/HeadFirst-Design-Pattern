package com.democlass;

import com.demointerface.DisplayElement;
import com.demointerface.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    // instance object of weatherData object
    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // display weatherData
    @Override
    public void display() {
        System.out.println("Current conditions: "
        +temperature +"F degrees and " + humidity + "% humidity " + " pressure " + pressure);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity =humidity;
        this.pressure = pressure;
        display();
    }
}
