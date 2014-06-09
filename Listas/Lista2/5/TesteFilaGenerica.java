public class TesteFilaGenerica {
	public static void main(String[] args) {
		System.out.println("Teste exercicio 5");
		FilaGenerica fila = new FilaGenerica();

		fila.adiciona("Teste");
		fila.adiciona(1.2);
		fila.adiciona(12323L);
		fila.adiciona(123);
		fila.adiciona('s');
		fila.adiciona("joao pedro");
		fila.adiciona("joao pedro");
		fila.adiciona("joao pedro");
		fila.adiciona("joao pedro");
		fila.adiciona("joao pedro");
		fila.adiciona("joao pedro");
		fila.adiciona("joao pedro");

		Object r1 = fila.remove();

		System.out.println(r1);
	}
}