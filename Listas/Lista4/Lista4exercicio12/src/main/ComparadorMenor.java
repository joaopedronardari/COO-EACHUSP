package main;

public class ComparadorMenor implements Comparador {

	// devolve true se a menor que b.

	public boolean compara(int a, int b) {

		if (a < b)
			return true;

		return false;
	}
}
