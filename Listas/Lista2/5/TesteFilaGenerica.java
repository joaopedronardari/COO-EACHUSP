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

		Object r1 = fila.remove();
		Object r2 = fila.remove();
		Object r3 = fila.remove();
		Object r4 = fila.remove();
		Object r5 = fila.remove();
		Object r6 = fila.remove();

		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + " " + r6);
	}
}