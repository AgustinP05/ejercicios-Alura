package ar.com.collectionsprac.model;

public class Clase{
	private String nombre;
	
	public Clase(String nombre){
		this.nombre = nombre;
	}
	
	
	//Setters y getters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	///////////
	
	
	//Metodo sobreescrito para que retorne el nombre y no el hash
		@Override
		public String toString() {
			return this.nombre;
		}

}
