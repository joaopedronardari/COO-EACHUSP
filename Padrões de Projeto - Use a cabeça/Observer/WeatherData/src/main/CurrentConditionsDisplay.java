package main;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "�F and " + humidity + "% humidity");
	}

	@Override
	public void update(float temp, float humidity, float preasure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}


}
