package ar.com.bytebank.modelo;
//Clase utilzada para verificar el inicio de sesion
public class SistemaInterno {
	String clave = "12345";//Clave de ejemplo
	public boolean autentica(Autenticable personaAutenticable) {
		boolean puedeIniciarSesion = personaAutenticable.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Error login");
			return false;
		}

	}
}
