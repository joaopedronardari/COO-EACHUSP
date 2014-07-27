package main;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
		weatherData.setMeasurements(32, 90);
		weatherData.setMeasurements(33, 70);
		weatherData.setMeasurements(31, 86);
		weatherData.setMeasurements(30, 91);
	}

}
