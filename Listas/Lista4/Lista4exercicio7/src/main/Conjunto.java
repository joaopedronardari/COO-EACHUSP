package main;

public class Conjunto {

	double[] valores;
	int index;

	public Conjunto(int max) {

		valores = new double[max];
		index = 0;
	}

	public void add(double d) {

		if (index == valores.length) {
			throw new IllegalStateException("Conjunto est� cheio!");
		}

		valores[index] = d;
		index++;
	}

	public double get(int pos) {

		if (pos < 0 || pos >= index) {

			throw new IllegalStateException("Posi��o Inv�lida!");
		}

		return valores[pos];
	}

	public Iterator createIterator() {
		return new ConjuntoIterator(this);
	}
}
