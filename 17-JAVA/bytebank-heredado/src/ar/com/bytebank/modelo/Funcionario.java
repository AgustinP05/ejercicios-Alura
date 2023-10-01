package ar.com.bytebank.modelo;
//Abstracta
//Queremos que esta clase sea general y conceptual, pero que no sea fisica. Es decir, que no se pueda crear una instancia de esta clase.
//Las cosas de esta clase van a hacer usadas por los hijos. Con polimorfismo si se quiere.



// 

public abstract class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
	private String clave;//Funcion para el inicio de sesion
	//public es para que la vean todas las otras clases, protected para que solo sea vista en el mismo package, private para que solo lo vea la misma clase.
	
	
	//Constructor
	public Funcionario() {
		
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	////////////
	
	/*public double getBonificacion() {
		return this.salario * 0.1;
	}
	En lugar de que por defecto de el 10% del salario, voy a hacer que por defecto no haga nada. 
	Así cada clase va a dar el valor que se desee*/
	
	public abstract double getBonificacion();//Ahora es abstracta y no tiene ejecucion. 
	//Los metodos abstractos nunca pueden tener cuerpo (implementacion), solo definen la firma (visibilidad nombre parametros). 
	//Tan pronto como ponemos un método abstracto, la clase también debe ser abstracta. 
	//Se le obliga a todas las clases hijas a que sobreescriban este metodo.
	/*
	 Al ser abstracta, no puede tener implementacion dentro de ella, 
	 Aquí solo tiene que ser la firma (visibilidad variable nombre parametros). 
	 Usamos métodos abstractos cuando queremos "forzar" a un hijo concreto (clase concreta) a implementar un método.  Garantizan que el hijo implemente un comportamiento.
	 Recordar que para que una clase tenga metodos abstractos, obligatoriamente debe ser una clase abstracta, sino dará error.
   	 Recordar que todos los hijos de una clase abstracta estan obligados a tener en su codigo los metodos abstractos y sobreescribirlos.	
	
	 */
	
	
	
	/*//Funciones para iniciar sesion. Pero recordemos que NO queremos que Contador la tenga.
	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean iniciarSesion(String clave) {
		return clave == this.clave;
	}*/
}
