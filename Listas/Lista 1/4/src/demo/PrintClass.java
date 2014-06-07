package demo;

import math.geometry.Circle;
import math.geometry.Rectangle;
import math.geometry.Triangle;
import math.geometry.exceptions.GeometryNumberNullParamException;
import java.util.Scanner;
import java.util.Locale;

public class PrintClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); // para aceitar pontos dos doubles
		System.out.println ("Digite sua opcao->\ncirculo <raio>\nretangulo <largura> <altura>\ntriangulo <lado1> <lado2> <lado3>\nsair\n\n");

		String entrada = sc.next();
		while (!entrada.equals("sair")) {
			try {
				switch (entrada) {
					case "circulo": {
						Circle circle = new Circle(sc.nextDouble());
						imprimirResultado(circle.calcArea());
						break;
					}
					case "retangulo": {
						Rectangle rectangle = new Rectangle(sc.nextDouble(),sc.nextDouble());
						imprimirResultado(rectangle.calcArea());
						break;
					}
					case "triangulo": {
						Triangle triangle = new Triangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
						imprimirResultado(triangle.calcArea());
						break;
					}
					default: {
						System.out.println("Opcao invalida");
						System.out.println ("Digite sua opcao->\ncirculo <raio>\nretangulo <largura> <altura>\ntriangulo <lado1> <lado2> <lado3>\nsair\n\n");
					}
				}
			} catch (java.util.InputMismatchException e) {
				System.out.println("Erro de Entrada. Digite sua opcao + os parametros numericos!");
			} catch (GeometryNumberNullParamException e) {
				System.out.println("Algum parametro esta negativo!");
			}	

			entrada = sc.next();
		}
	}

	public static void imprimir() {
		System.out.println("Hello");
	}

	public static void imprimirResultado(double resultado) {
		System.out.println("Area = " + resultado);
	}
}