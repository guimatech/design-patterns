package github.observer.gui;

import github.observer.WeatherForecast;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeTemperaturePanel extends JPanel implements ActionListener {

    private JComboBox<Integer> temperatureCbo;

    public ChangeTemperaturePanel() {

        Integer[] values = { 0, 5, 10, 15, 20, 25, 30 };
        temperatureCbo = new JComboBox<>(values);
        temperatureCbo.addActionListener(this);

        add(new JLabel("Temperatura:"));
        add(temperatureCbo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Integer temperature = (Integer) temperatureCbo.getSelectedItem();
        WeatherForecast.getInstance().setTemperature(temperature);
    }
}
