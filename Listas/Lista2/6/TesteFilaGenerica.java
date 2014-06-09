public class TesteFilaGenerica {
	public static void main(String[] args) {
		System.out.println("Teste exercicio 6");
		
		String[] nomes = {"joao", "jose", "maria"};

		Integer[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

		Double[] numerosFlutuantes = {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8};

		FilaGenerica fila1 = FilaGenerica.criaFila(nomes);
		FilaGenerica fila2 = FilaGenerica.criaFila(numeros);
		FilaGenerica fila3 = FilaGenerica.criaFila(numerosFlutuantes);
		
		fila1.remove();

		FilaGenerica.imprimeFila(fila1);
		fila1.remove();
		fila1.remove();
		fila1.remove();
		FilaGenerica.imprimeFila(fila1);
		FilaGenerica.imprimeFila(fila2);
		FilaGenerica.imprimeFila(fila3);
	}
}