package math.geometry;

import math.geometry.exceptions.GeometryNumberNullParamException;

public class Circle implements Shape {
	private static final double pi = 3.14; // arredondado
	private double raio;

	public Circle(double raio) throws GeometryNumberNullParamException {
		if (raio < 0)
			throw new GeometryNumberNullParamException();

		this.raio = raio;
	}

	public double calcArea() {
		return pi * Math.pow(raio,2);
	}
}