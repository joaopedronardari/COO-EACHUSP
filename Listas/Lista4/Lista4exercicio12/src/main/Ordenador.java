package main;

abstract class Ordenador {

	protected Comparador comparador = null;
	
	public void ordena(int [] array){

		if(comparador == null) throw new IllegalStateException("Comparador nulo!");

		for(int i = 0; i < array.length; i++){

			int index = i;
		
			for(int j = i + 1; j < array.length; j++){

				if(comparador.compara(array[j], array[index])) index = j;
			}
			
			/* trocando elementos das posições i e index */

			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
	}
}
