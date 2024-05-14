public class WeatherForecast implements Observer, DisplayElement{
    private double previous_pressure = 0.00;
    private double new_pressure = 0.00;

    private Subject weatherData;

    public WeatherForecast(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.previous_pressure = this.new_pressure;
        this.new_pressure = pressure;
        display();
    }

    @Override
    public void display() {
        if(this.previous_pressure == 0.00){
            System.out.println("First pressure measurement, skipping weather forecast");
        }
        else{
            if(this.new_pressure > this.previous_pressure) {
                System.out.println("Pressure is getting higher, weather is getting better! :)");
            } else if (this.new_pressure < this.previous_pressure) {
                System.out.println("Pressure is getting lower, weather is getting worse :(");
            }
        }
    }
}
