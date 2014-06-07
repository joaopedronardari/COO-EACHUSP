public class ParNaoGenerica {
	private Object primeiro;
	private Object segundo;

	public void adiciona(Object primeiro, Object segundo) {
		this.primeiro = (Object) primeiro;
		this.segundo  = (Object) segundo;
	}

	public Object primeiro() {
		return primeiro;
	}

	public Object segundo() {
		return segundo;
	}

	public Object maior() {
		if (primeiro.hashCode() > segundo.hashCode())
			return primeiro;
		return segundo;
	}
}