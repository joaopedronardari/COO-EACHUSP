public class Teste4 {
	public static void main(String[] args) {
		System.out.println("Lista2 - exercicio 4");

		Par<String, Integer> par = new Par<String, Integer>();
		par.adiciona("1", 1232);

		String  x  = par.primeiro();
		Integer y  = par.segundo();
		System.out.println("- " + x + " \n " + y);
		Integer maior = (Integer) par.maior();  
		System.out.println(maior);
	}	
}