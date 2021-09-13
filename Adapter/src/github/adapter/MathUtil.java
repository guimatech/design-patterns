package github.adapter;

public class MathUtil {

    private MathUtil() {}

    public static double celsiusToFahrenheit(double value) {
        return value * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double value) {
        return (value - 32) * 5 / 9;
    }
}
