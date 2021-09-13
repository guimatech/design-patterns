package github.adapter;

import static github.adapter.MathUtil.celsiusToFahrenheit;
import static github.adapter.MathUtil.fahrenheitToCelsius;

public class TemperatureClassAdapter extends Temperature {

    public double getValueInFahrenheit() {
        return super.getValue();
    }

    @Override
    public void setValue(double value) {
        super.setValue(celsiusToFahrenheit(value));
    }

    @Override
    public double getValue() {
        return fahrenheitToCelsius(super.getValue());
    }
}
