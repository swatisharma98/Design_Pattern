package observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);
		StatisticDisplay sd = new StatisticDisplay(weatherData);
		weatherData.setMeasurement(80, 65, 7);
		
	}

}
