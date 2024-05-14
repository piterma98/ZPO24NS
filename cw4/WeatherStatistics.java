import java.util.ArrayList;
import java.util.Collections;

public class WeatherStatistics implements Observer, DisplayElement {
    ArrayList<Double> temperature_history = new ArrayList<>();
    private Subject weatherData;

    public WeatherStatistics(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public double average() {
        return temperature_history.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }

    public double max_value() {
        return Collections.max(temperature_history);
    }

    public double min_value() {
        return Collections.min(temperature_history);
    }

    @Override
    public void display() {
        System.out.println("Max temperature: " + this.max_value());
        System.out.println("Min temperature: " + this.min_value());
        System.out.println("Average temperature: " + this.average());
    }

    @Override
    public void update(double temperature, double pressure, double humidity) {
        temperature_history.add(temperature);
        display();
    }
}
