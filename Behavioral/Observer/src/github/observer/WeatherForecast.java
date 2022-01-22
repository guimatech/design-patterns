package github.observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class WeatherForecast implements Subject {

    private static WeatherForecast instance;

    private final Set<Observer> observers = new LinkedHashSet<>();

    private int temperature;

    private WeatherForecast() {}

    public static WeatherForecast getInstance() {
        if (instance == null)
            instance = new WeatherForecast();

        return instance;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(this));
    }
}
