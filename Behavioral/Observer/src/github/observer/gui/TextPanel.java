package github.observer.gui;

import github.observer.TextObserver;
import github.observer.WeatherForecast;

import javax.swing.*;

public class TextPanel extends JPanel {

    public TextPanel() {
        JTextField txtTemperature = new JTextField(20);
        txtTemperature.setEnabled(false);
        add(txtTemperature);

        TextObserver observer = new TextObserver(txtTemperature);
        WeatherForecast.getInstance().registerObserver(observer);
    }
}
