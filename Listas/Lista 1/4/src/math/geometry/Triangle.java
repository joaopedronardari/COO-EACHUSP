package math.geometry;

public class Triangle implements Shape {
	private double lado1;
	private double lado2;
	private double lado3;

	public Triangle(double lado1, double lado2, double lado3) {
		if (lado1 < 0 || lado2 < 0 || lado3 < 0)
			throw new GeometryNegativeNumberParamException();

		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double calcArea() {
		double p = (lado1 + lado2 + lado3) / 2;
		return Math.sqrt(p * (p-lado1) * (p-lado2) * (p-lado3));
	}
}