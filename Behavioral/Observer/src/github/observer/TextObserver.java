package github.observer;

import javax.swing.*;

public class TextObserver implements Observer {

    private JTextField txtTemperature;

    public TextObserver(JTextField txtTemperature) {
        this.txtTemperature = txtTemperature;
    }

    @Override
    public void update(Subject subject) {
        WeatherForecast weatherForecast = (WeatherForecast) subject;
        txtTemperature.setText(String.valueOf(weatherForecast.getTemperature()));
    }
}
