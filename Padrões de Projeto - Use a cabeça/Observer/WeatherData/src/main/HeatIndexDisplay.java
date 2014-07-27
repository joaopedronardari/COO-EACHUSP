package main;

public class HeatIndexDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private Subject weatherData;

	public HeatIndexDisplay(Subject subject) {
		this.weatherData = subject;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		double heatIndex = calculateHeatIndex(temp, humidity);
		System.out.println("Heat Index is " + heatIndex);
	}

	public static double calculateHeatIndex(float temperature, float humidity) {

		// variables used for the second method
		double current_temp;
		double current_humidity;
		double current_HeatIndex;
		
		// swap the variables following the UML
		current_temp = temperature;
		current_humidity = humidity;

		// The heat index forumla
		current_HeatIndex = -42.379 + 2.04901523 * current_temp + 10.14333127
				* current_humidity - 0.22475541 * current_temp
				* current_humidity - 6.83783 * Math.pow(10, -4)
				* Math.pow(current_humidity, 2) - 5.481717 * Math.pow(10, -2)
				* Math.pow(current_humidity, 2) + 1.22874 * Math.pow(10, -3)
				* Math.pow(current_temp, 2) * current_humidity + 8.5282
				* Math.pow(10, -4) * current_temp
				* Math.pow(current_humidity, 2) - 1.99 * Math.pow(10, -6)
				* Math.pow(10, -6) * Math.pow(current_temp, 2)
				* Math.pow(current_humidity, 2);

		// returns the value
		return current_HeatIndex;

	}

	@Override
	public void update(float temp, float humidity, float preasure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

}
