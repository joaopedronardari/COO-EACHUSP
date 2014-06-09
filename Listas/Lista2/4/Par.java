public class Par<X,Y> {
	private X objeto1;
	private Y objeto2;

	public void adiciona(X objeto1, Y objeto2) {
		this.objeto1 = objeto1;
		this.objeto2 = objeto2;
	}

	public X primeiro() {
		return objeto1;
	} 

	public Y segundo() {
		return objeto2;
	}

	// TODO tornar generico
	public Object maior() {
		int hash1 = objeto1.hashCode();
		int hash2 = objeto2.hashCode();
		
		if (hash1 > hash2)
			return objeto1;

		return objeto2;
	}
}