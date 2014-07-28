package main;

public class TesteBuscador {

	public static void main(String [] args){

		int [] valores1 = { 1, 2, 8, 10, 13, 20, 45, 78, 92, 104, 200, 256 };
		int [] valores2 = { 200, 20, 2, 8, 10, 256, 45, 13, 104, 78, 92, 1 };

		Buscador b = new Buscador(valores1, new BuscaBinaria());
		//Buscador b = new Buscador(Buscador.BUSCA_BINARIA, valores2);
		//Buscador b = new Buscador(Buscador.BUSCA_SEQUENCIAL, valores1);
		//Buscador b = new Buscador(Buscador.BUSCA_SEQUENCIAL, valores2);

		for(int i = 0; i < valores1.length; i++){

			System.out.println("Buscando valor " + valores1[i] + ": " + b.busca(valores1[i]));
		}
	}
}
