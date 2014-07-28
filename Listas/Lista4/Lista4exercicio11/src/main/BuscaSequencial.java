package main;

public class BuscaSequencial implements BuscaBehavior {

	@Override
	public boolean busca(int valor, int[] valores) {
		for(int i = 0; i < valores.length; i++){
			if(valores[i] == valor) return true;
		}
		return false;
	}

}
