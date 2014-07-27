package main;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(32, 40, 30);
		weatherData.setMeasurements(34, 32, 20);
		weatherData.setMeasurements(30, 50, 60);
		weatherData.setMeasurements(31, 50, 10);
		
	}

}
