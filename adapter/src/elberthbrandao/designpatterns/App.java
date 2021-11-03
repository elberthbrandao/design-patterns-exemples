package elberthbrandao.designpatterns;

public class App {

    public static void main(String[] args) {
        TemperatureClassAdapter classAdapter = new TemperatureClassAdapter();
        classAdapter.setValue(30);

        System.out.println(classAdapter.getValue());
        System.out.println(classAdapter.getValueInFahrenheit());

        Temperature temperature = new Temperature();
        TemperatureObjectAdapter objectAdapter = new TemperatureObjectAdapter(temperature);
        objectAdapter.setValue(30);

        System.out.println(objectAdapter.getValue());
        System.out.println(temperature.getValue());
    }
}
