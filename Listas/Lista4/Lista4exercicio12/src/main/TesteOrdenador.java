package main;

public class TesteOrdenador {

	public static void print(int [] array){

		System.out.print("vetor:");

		for(int i = 0; i < array.length; i++){

			System.out.print(" " + array[i]);		
		}

		System.out.println();
	}

	public static void main(String [] args){

		int [] array = { 6, 4, 5, 1, 3, 7, 2 };
		Ordenador o = new OrdenadorCrescente();

		print(array);
		o.ordena(array);
		print(array);
		
		o = new OrdenadorDecrescente();
		o.ordena(array);
		print(array);
	}
}

