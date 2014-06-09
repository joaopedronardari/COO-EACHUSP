public class FilaGenerica<T> {
	int totalElementos = 0;
	T[] objetosFila;

	public FilaGenerica(T[] objetosFila) {
		this.objetosFila = objetosFila;
	}

	public void adiciona(T object) {
		if (totalElementos+1 <= objetosFila.length) {
			totalElementos++;
			objetosFila[totalElementos-1] = object;
		}
	}

	public T[] getArrayFila() {
		return objetosFila;
	}

	public T remove() {
		if (totalElementos > 0) {
			T retorno = objetosFila[0];

			for (int i = 0; i<totalElementos-1; i++) {
				objetosFila[i] = objetosFila[i+1];
			}

			totalElementos--;
			return retorno;
		} else
			return null;
	}

	public int tamanho() {
		return totalElementos;
	}

	public static FilaGenerica criaFila(Object[] vetor) {
		FilaGenerica filaVetor = new FilaGenerica<Object>(vetor);
		for (Object object : vetor) {
			filaVetor.adiciona(object);
		}

		return filaVetor;
	}

	public static void imprimeFila(FilaGenerica fila) {
		Object[] objectArray = fila.getArrayFila();

		System.out.print("\nImprindo Fila-> |");
		for (int i = 0; i<fila.tamanho();i++)
			System.out.print(objectArray[i] + "|");

		System.out.print("\n");
	}
}