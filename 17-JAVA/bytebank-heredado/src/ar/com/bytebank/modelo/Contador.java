package ar.com.bytebank.modelo;

public class Contador extends Funcionario {
	
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde Contador");
		return 120.5 + (this.getSalario()); //Variacion de ejemplo para poder apreciar que la funcion actúa de acuerdo a la clase
	}
}
