package math.geometry.exceptions;

public class GeometryException extends Exception {
	private String mensagem;

	public GeometryException(String mensagem) {
		super(mensagem);
		this.mensagem = mensagem;
	}

	public String getMessage() {
		return mensagem;
	}
}