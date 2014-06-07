package math.geometry;

public class Rectangle implements Shape {
	private double largura;
	private double altura;

	public Rectangle(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public double calcArea() {
		return largura * altura;
	}
}