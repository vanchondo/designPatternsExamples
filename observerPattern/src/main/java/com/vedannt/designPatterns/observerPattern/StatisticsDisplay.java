package com.vedannt.designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by veanchondo on 1/9/17.
 */

public class StatisticsDisplay implements Observer, DisplayElement {

    private List<Double> tempratures = new ArrayList<>();
    private double avg;
    private double max;
    private double min;
    private Observable observer;

    public StatisticsDisplay(Observable observer){
        this.observer = observer;
        observer.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            tempratures.add(weatherData.getTemperature());
            max = Collections.max(tempratures);
            min = Collections.min(tempratures);
            avg = tempratures.stream().mapToDouble(a->a).average().getAsDouble();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avg + "/"+ max + "/"+ min );
    }
}
