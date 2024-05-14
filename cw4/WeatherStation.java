public class WeatherStation {
    public static void main(String[] args){
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay cod = new CurrentConditionsDisplay(wd);
        WeatherForecast forecast = new WeatherForecast(wd);
        WeatherStatistics statistics = new WeatherStatistics(wd);
        wd.setMeasurements(21, 52, 1007);
        wd.setMeasurements(5, 80, 1000);
        wd.setMeasurements(0, 90, 985);
        wd.setMeasurements(-1, 22, 1021);
    }
}
