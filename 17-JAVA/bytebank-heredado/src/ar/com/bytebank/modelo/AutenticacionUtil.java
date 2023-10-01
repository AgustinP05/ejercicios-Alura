package ar.com.bytebank.modelo;
//Clase creada como caja de herramentas.
//Clase creada para ahorrar codigo. Estos metodos aquí dentro, son metodos que venian originalmente de la interfaz Auteticable.
//Autenticable, al ser abstracta nos obliga a implementar los metodos en cada uno de las clases que implementan de la interfaz.
//Eso provocaba mucho copia y pega. Entonces cree esta clase para que en Cliente, Administrador y Gerente tengan estas funciones en una linea
public class AutenticacionUtil {
	private String clave;//Para la autenticacion de usuario
	
	
	//Metodos que originalmente eran de Autenticacion
	public void setClave(String clave) {
		this.clave = clave;	
	}

	
	public boolean iniciarSesion(String clave) {
		/*if(this.clave == clave) {
			return true;
		}
		return false;*/
		//Como es boolean, es lo mismo que
		return this.clave == clave; //Va a ser o true o false
	}
	///////////////////////////////////////////////////
}
