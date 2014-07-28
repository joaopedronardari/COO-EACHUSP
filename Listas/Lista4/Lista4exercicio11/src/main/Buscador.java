package main;

public class Buscador {
	int[] valores;
	BuscaBehavior buscaBehavior;
	
	public Buscador(int[] valores, BuscaBehavior buscaBehavior) {
		this.valores = new int[valores.length];
		this.buscaBehavior = buscaBehavior;
		
		for (int i = 0; i < valores.length;i++)
			this.valores[i] = valores[i];
	}
	
	public boolean busca(int valor) {
		return buscaBehavior.busca(valor, valores);
	}
}
