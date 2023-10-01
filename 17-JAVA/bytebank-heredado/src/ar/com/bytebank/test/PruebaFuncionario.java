package ar.com.bytebank.test;
import ar.com.bytebank.modelo.*;

public class PruebaFuncionario {
	public static void main(String[] args) {
		//Funcionario funcionario1 = new Funcionario(); //No puede hacerse instancias de Funcionario ya que esta es abstracta.
		Funcionario funcionario1 = new Contador(); //Variable del tipo Funcionario, representada con la clase hija Contador. Sucede lo mismo que en PruebaControlBonificacion.
		funcionario1.setNombre("Agustin");
		funcionario1.setDocumento("44123456");
		funcionario1.setSalario(2000);
		//System.out.println(funcionario1.getSalario());
		
		//Ahora creamos un gerente. Recordar que en estos se pueden usar las funciones nuevas creadas en Gerente
		Gerente gerente1 = new Gerente();
		gerente1.setClave("Hola12345");
		System.out.println(gerente1.iniciarSesion("Hola12345"));
		gerente1.setSalario(5400);
		System.out.println(gerente1.getBonificacion());
	}
}
