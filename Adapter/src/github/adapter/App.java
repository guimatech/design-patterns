package github.adapter;

public class App {

    public static void main(String[] args) {

//        Forma 1: Usando adapter de classe
//        TemperatureClassAdapter adapter = new TemperatureClassAdapter();
//        adapter.setValue(30);
//
//        System.out.println(adapter.getValue());
//        System.out.println(adapter.getValueInFahrenheit());

//        Forma 2: Usando adapter de objeto
        TemperatureObjectAdapter adapter = new TemperatureObjectAdapter(new Temperature());
        adapter.setValue(30);

        System.out.println(adapter.getValue());
        System.out.println(adapter.getValueInFahrenheit());
    }
}
