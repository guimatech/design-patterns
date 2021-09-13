package github.adapter;

import static github.adapter.MathUtil.celsiusToFahrenheit;
import static github.adapter.MathUtil.fahrenheitToCelsius;

public class TemperatureObjectAdapter {

    private Temperature temperature;

    public TemperatureObjectAdapter(Temperature temperature) {
        this.temperature = temperature;
    }

    public double getValueInFahrenheit() {
        return temperature.getValue();
    }

    public void setValue(double value) {
        temperature.setValue(celsiusToFahrenheit(value));
    }

    public double getValue() {
        return fahrenheitToCelsius(temperature.getValue());
    }
}
