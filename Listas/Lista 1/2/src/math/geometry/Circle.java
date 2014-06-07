package src.math.geometry;

public class Circle implements Shape {
	private static final double pi = 3.14; // arredondado
	private double raio;

	public Circle(double raio) {
		this.raio = raio;
	}

	public double calcArea() {
		return pi * Math.pow(raio,2);
	}
}