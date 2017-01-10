package com.vedannt.designPatterns.observerPattern;

/**
 * Created by veanchondo on 1/9/17.
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
