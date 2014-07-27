package main;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer {
	private Observable o;
	private float temperature;
	private float humidity;
	
	public GeneralDisplay(Observable o) {
		this.o = o;
		this.o.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity    = weatherData.getHumidity();
			display();
		}
	}
	
	public void display() {
		System.out.println("Current temperature = " + temperature + "F and humidity " + humidity + "%");
	}
}
