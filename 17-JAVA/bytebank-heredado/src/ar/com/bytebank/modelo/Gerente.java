package ar.com.bytebank.modelo;
//Hacemos que Gerente sea heredero de Funcionario con extends
//Ademas, implementa de la interfaz Autenticable
public class Gerente extends Funcionario implements Autenticable{

	private AutenticacionUtil util;
	
	public Gerente() {
		this.util = new AutenticacionUtil();//Conectamos a esa clase sin extender ni implementar
	}
		
	
	
	//Usamos el mismo nombre de la funcion para obtener la bonificacion pero le sumamos la cantidad de salario dentro
	@Override
	public double getBonificacion() {//Esto es sobreescritura de metodo, ya que usamos el mismo metodo de la clase padre pero la sobreescribimos para darle alguna diferencia de comportamiento. (La sobreescritura siempre implica herencia)
		System.out.println("Ejecutando desde Gerente");
		return super.getSalario() + this.getSalario(); //Lo llamamos con super porque es una funcion extraida del padre  //Dentro de la sobreescritura, tambien estamos llamando la getBonificacion() del padre, es decir que si queremos cambiar la bonificacion para esta clase, solo tenemos que cambiar el valor desde la declaracion de la funcion en Funcionario
	}
	//Recordar, tomar una funcion de padre y modificarla, es sobreescritura

	//Funciones implementadas de Autenticable
	
	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);//Utilizamos funcion de AuenticacionUtil
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave); //Utilizamos funcion de AuenticacionUtil
	}
}
