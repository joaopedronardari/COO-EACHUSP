package math.geometry;

import math.geometry.exceptions.GeometryNegativeNumberParamException;

public class Circle implements Shape {
	private static final double pi = 3.14; // arredondado
	private double raio;

	public Circle(double raio) throws GeometryNegativeNumberParamException {
		if (raio < 0)
			throw new GeometryNegativeNumberParamException();

		this.raio = raio;
	}

	public double calcArea() {
		return pi * Math.pow(raio,2);
	}
}