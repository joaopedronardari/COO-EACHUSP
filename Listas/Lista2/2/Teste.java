
public class Teste {
	public static void main(String[] args) {
		// Primeiro teste
		System.out.println("exercicio2 - Teste1");
		ParNaoGenerica par = new ParNaoGenerica();

		System.out.println("exercicio2 - Teste2");
		par.adiciona("Joao Pedro", 1994);

		System.out.println("exercicio2 - Teste3");
		imprimeObjeto(par.primeiro());
		imprimeObjeto(par.segundo());

		Object maior = par.maior();
		imprimeObjeto(maior);

		// Segundo teste
		System.out.println("exercicio2 - Teste1");
		ParNaoGenerica par2 = new ParNaoGenerica();

		System.out.println("exercicio2 - Teste2");
		par2.adiciona(3.14, 314);

		System.out.println("exercicio2 - Teste3");
		imprimeObjeto(par2.primeiro());
		imprimeObjeto(par2.segundo());

		Object maiorTeste2 = par2.maior();
		imprimeObjeto(maiorTeste2);
	}

	private static void imprimeObjeto(Object objeto) {
		if (objeto instanceof String) {
			String maiorString = (String) objeto;
			System.out.println("String " + maiorString);
		}
		else if (objeto instanceof Integer) { 
			Integer maiorInt = (Integer) objeto;
			System.out.println("Integer " + maiorInt);
		}
		else if (objeto instanceof Double) {
			Double maiorDouble = (Double) objeto;
			System.out.println("Double " + maiorDouble);
		}
	}	
}