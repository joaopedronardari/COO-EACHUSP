
public class Principal {
	public static void main(String[] args) {
		System.out.println("exercicio1");
		Par<String,Integer> par = new Par<String,Integer>();
		par.adiciona("String",1234567);

		System.out.println(par.primeiro());
		System.out.println(par.segundo());
		System.out.println(par.maior());
	}
}