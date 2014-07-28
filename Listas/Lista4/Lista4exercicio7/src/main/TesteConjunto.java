package main;

public class TesteConjunto {

	public static void main(String [] args){

		Conjunto c = new Conjunto(5);

		for(int i = 0; i < 5; i++) c.add(i + i/10.0);

		Iterator cit = c.createIterator();
		while(cit.hasNext()) {
			System.out.println(cit.next());
		}
	}
}

