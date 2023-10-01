package ar.com.bytebank.test;

//Podemos importar los elementos individuales de un paquete del paquete
//import ar.com.bytebank.modelo.ControlBonificacion; //Asi no tengo que copiar y pegar en cada ControlBonificacion
//Una forma para importar todo lo que hay dentro de un paqute:
import ar.com.bytebank.modelo.*; //Se recomienda cuando vamos a trabajar en un archivo varias clases de un paquete


public class PruebaControlBonificacion {
	public static void main(String[] args) {
		
	//pais.tipoOrganizacion.nombreEmpresa.nombrePaquete.nombreClase	
	//ar.com.bytebank.modelo.ControlBonificacion controlBonificacion = new ar.com.bytebank.modelo.ControlBonificacion();
	//Pero como lo importamos lo podemos dejar como estaba normal:
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		//Funcionario diego = new Funcionario();//No puede hacerse instancias de Funcionario ya que esta es abstracta.
		Funcionario diego = new Contador();//Podes dar a una variable el tipo Funcionario, pero esta al ser abstracta no puede ser instanciada ya que representa un concepto y no es fisico (no se puede hacer new Funcionario()).Para crear una instancia, es necesario crear primero una clase hija no abstracta. En este caso la representacion fisica se le hace con polimorfismo con Contador() que es su hija.  
		diego.setSalario(1500);
		controlBonificacion.registrarSalario(diego);//Dentro de registrarSalario(), se utiliza getBonificacion() de Funcionario.  
		
		Gerente jimena = new Gerente();				// +
		jimena.setSalario(2000);
		controlBonificacion.registrarSalario(jimena);//Si dentro de Gerente existe un getBonificacion() especifico, utiliza ese, sino utiliza el getBonificacion del padre
		
		Contador alex = new Contador();				// +
		alex.setSalario(1000);
		controlBonificacion.registrarSalario(alex); //Si dentro de Contador existe un getBonificacion() especifico, utiliza ese, sino utiliza el getBonificacion del padre
	
		controlBonificacion.getSuma();
	}
}
