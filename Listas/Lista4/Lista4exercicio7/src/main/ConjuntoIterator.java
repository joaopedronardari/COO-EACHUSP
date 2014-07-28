package main;

public class ConjuntoIterator implements Iterator {
	
	private Conjunto conjunto;
	private int position = 0;
	
	public ConjuntoIterator(Conjunto conjunto) {
		this.conjunto = conjunto;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= conjunto.index)
			return false;
		return true;
	}

	@Override
	public Object next() {
		double number = conjunto.get(position);
		position++;
		return number;
	}

}
