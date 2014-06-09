import java.util.*;

public class Ex4 {
	public static void metodo() {
		try {
			int a,b,c;
			Scanner scanner = new Scanner(System.in);
			System.out.print("Entre com dois numeros: ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			if (a - b < 0) return;
			c = a / (a-b);
			System.out.println("Resultado = " + c);
		} catch (ArithmeticException e) {
		System.out.println("Divisao por zero!");
		}
		finally {
			System.out.println("Finally.");
		}

		System.out.println("teste");
	}

	public static void main(String[] args) {
	System.out.println("Ex4: inicio.");
	metodo();
	System.out.println("Ex4: fim.");
	}
}