package com.vedannt.designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by veanchondo on 1/9/17.
 */

public class StatisticsDisplay implements Observer, DisplayElement {

    private List<Double> tempratures = new ArrayList<>();
    private double avg;
    private double max;
    private double min;
    private Subject weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        tempratures.add(temp);
        max = Collections.max(tempratures);
        min = Collections.min(tempratures);
        avg = tempratures.stream().mapToDouble(a->a).average().getAsDouble();
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avg + "/"+ max + "/"+ min );
    }
}
