package ar.com.bytebank.test;
import ar.com.bytebank.modelo.*;

//Practicaremos polimorfismo
public class PruebaReferencias { 
	public static void main(String[] args) {
		
		//La clase hija puede utilizar/heredar todo lo de la clase padre, pero el padre NO puede heredar de la hija.
		
		
	//En 'funcionario' solo se van a poder utilizar los metodos que tenga su clase de referencia (Funcionario)
	//	Referencia  nombre        valor
		Funcionario funcionario = new Gerente(); //Creamos un nuevo Gerente referenciado con Funcionario, que es la clase padre (Esto se puede). Podriamos decir que todo Gerente creado tambien es al mismo tiempo un Funcionario, ya que hereda de este. Pero no puede ser al reves.  
		funcionario.setNombre("Diego");
		//En cambio esto no se podría 'Gerente gerente = new Funcionario();' ya que el padre no puede ser referenciado por la hija.
		
		//Gerente hereda de Funcionario, entonces Gerente puede utilizar todo lo de Funcionario. Pero Funcionario NO puede usar lo de los hijos
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		
		//Como se puede ver el 'funcionario' no puede utilizar estas funciones a pesar que tenga como valor un nuevo Gerente. Esto es porque las funciones setClave() e iniciarSesion() no pertenecen a su clase de referencia Funcionario. 
	//	funcionario.setClave("Hola12345");	//No compila 
	//	funcionario.iniciarSesion("Hola12345");//No compila
	}
	
}
