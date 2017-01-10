package com.vedannt.designPatterns.observerPattern;

/**
 * Created by veanchondo on 1/9/17.
 */
public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4);
        weatherData.setMeasurements(82, 70, 29.2);
        weatherData.setMeasurements(78, 90, 29.2);

        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(77, 20, 30.2);
        weatherData.setMeasurements(83, 40, 28.2);

    }
}
