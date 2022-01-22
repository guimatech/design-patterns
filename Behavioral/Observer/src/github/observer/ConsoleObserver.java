package github.observer;

public class ConsoleObserver implements Observer {

    @Override
    public void update(Subject subject) {
        WeatherForecast weatherForecast = (WeatherForecast) subject;

        System.out.println("Temperatura: " + weatherForecast.getTemperature());
    }
}
