package com.vedannt.designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by veanchondo on 1/9/17.
 */
public class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double temperature;
    private double humidity;
    private double pressure;

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
//        int i= observers.indexOf(o);
//        if (i>0) {
//            observers.remove(i);
//        }
        observers.remove(o);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
