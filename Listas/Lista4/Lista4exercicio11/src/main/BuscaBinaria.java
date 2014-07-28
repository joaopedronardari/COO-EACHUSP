package main;

public class BuscaBinaria implements BuscaBehavior {

	@Override
	public boolean busca(int valor, int[] valores) {
		int min = 0;
		int max = valores.length;

		while (min <= max) {

			int med = (min + max) / 2;

			if (med >= 0 && med < valores.length) {

				if (valor == valores[med]) {

					return true;
				} else if (valor < valores[med]) {

					max = med - 1;
				} else { // x > valores[med]

					min = med + 1;
				}
			}
		}
		
		return false;
	}

}
