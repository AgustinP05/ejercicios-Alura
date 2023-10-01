package ar.com.bytebank.modelo; //Declaramos a que paquete pertenece

//modificadores de acceso //Para definir quien puede ver y utilizar las propiedades y funciones de una clase
// private      //Solo la misma clase
// default      //Solo visible para el mismo paquete
// protected    //default + fuera del paquete cualquier clase que herede de la clase principal donde esta lo protected
// public 		// visible para todos


//Aquí se puede ver que extiende de una clase, y ademas implementa de una interfaz.
public class Administrator extends Funcionario implements Autenticable {
	
	private AutenticacionUtil util;
	
	public Administrator() {
		this.util = new AutenticacionUtil();//Conectamos a esa clase sin extender ni implementar
	}
		
	
	//Funcion abstracta heredada. La tengo que sobreescribir si o si
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}
	
	
	 //Metodos abstractos que vienen de la interfaz Autenticable. Tenemos que sobreescribirlas si o si.
	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);//Utilizamos funcion de AuenticacionUtil
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave); //Utilizamos funcion de AuenticacionUtil
	}

}
