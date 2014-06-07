package src.demo;

import src.math.geometry.Circle;
import src.math.geometry.Rectangle;
import src.math.geometry.Triangle;

public class PrintClass {
	public static void main(String[] args){
		Circle circle = new Circle(1);
		Rectangle rectangle = new Rectangle(2,3);
		Triangle triangle = new Triangle(3,4,5);
		System.out.println(circle.calcArea());
		System.out.println(triangle.calcArea());
		System.out.println(rectangle.calcArea());
	}

	public static void imprimir() {
		
		Circle circle = new Circle(1);
		circle.calcArea();
		System.out.println("Hello");

	}
}