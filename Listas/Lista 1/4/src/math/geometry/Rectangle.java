package math.geometry;

public class Rectangle implements Shape {
	private double largura;
	private double altura;

	public Rectangle(double largura, double altura) {
		if (largura < 0 || altura < 0)
			throw new GeometryNegativeNumberParamException();

		this.largura = largura;
		this.altura = altura;
	}

	public double calcArea() {
		return largura * altura;
	}
}