public class FilaGenerica {
	int totalElementos = 0;
	Object[] objetosFila;

	/**
	* Construtor padrao com tamanho 10
	*/
	public FilaGenerica() {
		this.objetosFila = new Object[10];
	}

	public FilaGenerica(int tamanho) {
		this.objetosFila = new Object[tamanho];
	}

	public void adiciona(Object object) {
		totalElementos++;
		objetosFila[totalElementos-1] = object;
	}

	public Object remove() {
		Object retorno = objetosFila[0];

		for (int i = 0; i<totalElementos; i++) {
			objetosFila[i] = objetosFila[i+1];
		}

		totalElementos--;
		return retorno;
	}

	public int tamanho() {
		return totalElementos;
	}
}