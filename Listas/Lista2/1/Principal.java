
public class Principal {
	public static void main(String[] args) {
		System.out.println("exercicio1");
		ParNaoGenerica par = new ParNaoGenerica();
		par.adiciona("String",1234567);

		System.out.println(par.primeiro());
		System.out.println(par.segundo());
		System.out.println(par.maior());
	}
}