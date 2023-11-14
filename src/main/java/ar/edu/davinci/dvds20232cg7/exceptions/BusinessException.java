package ar.edu.davinci.dvds20232cg7.exceptions;
public class BusinessException extends Exception {
	private static final long serialVersionUID = 7905754903888004478L;
	public BusinessException(String mensaje) {
		super(mensaje);
	}
}
