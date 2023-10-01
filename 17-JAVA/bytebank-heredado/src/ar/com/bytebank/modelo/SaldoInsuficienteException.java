package ar.com.bytebank.modelo;

public class SaldoInsuficienteException extends RuntimeException {
	public SaldoInsuficienteException(String mensaje) {
		super(mensaje); //La funcion del parametro de RuntimeException va a mostrar el mensaje
	}
}
