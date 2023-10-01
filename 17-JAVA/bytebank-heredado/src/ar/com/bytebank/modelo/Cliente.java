package ar.com.bytebank.modelo;
//Esta clase quiero que pueda ingresar al sistemaInterno y para eso tiene que tener las propiedades de Autenticable.
//Pero no queremos que Cliente herede las funciones de Funcionario ya que sería un error conceptual

//Vamos a hacer que Autenticable sea una interface para que sea como otro "padre" para las clases Administrador, Gerente y Cliente. Y así hacemos que Cliente pueda tener esas funciones sin asociarse con Funcionario.
//Una clase no puede extender de algo que NO sea clase. Entonces Cliente NO puede extender de Autenticable. Pero la interfaz me permite implementarla.

public class Cliente implements Autenticable{ //Cliente implementa a Autenticable
	private String nombre;
	private String documento;
	private String telefono;
	private String profesion;
	
	private AutenticacionUtil util;
	
	public Cliente() {
		this.util = new AutenticacionUtil(); //Composicion de objetos. Todo esto es para que cuando se crea un Cliente, se pueda acceder a los metodos de AutenticacionUtil sin repetir tanto codigo. Las funciones se hacen en una linea. 
	}
	
	//(3*)Tambien queremos que nombre, documento, telefono sean privados
	//Los getter y setter los podemos hacer automaticamente desde la pestaña source
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	} 
	public String getProfesion () {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this. profesion = profesion;
    }
    
    
    //Metodos abstractos que vienen de la interfaz Autenticable. Tenemos que sobreescribirlas si o si.
	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
		
	}
	@Override
	public boolean iniciarSesion(String clave) {//Este metodo se utiliza luego en SistemaInterno
		return this.util.iniciarSesion(clave);
	}
    
    
	
	
	////////////////////////
	
	
	
	

}
