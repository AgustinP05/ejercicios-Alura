
public class TestConexion {
	public static void main(String[] args) throws Exception { //Este throws Exception proviene del close() autogenerado para que lo tratemos en el try resource
		
//En las nuevas versiones de JAVA, podemos hacer lo mismo que abajo pero mas resumido
//try with resource	(seria try con recursos)
		//Para hacer esto, inicializa un objeto (aquí es el recurso) que se encuentra dentro, y debe implementar la interface AutoCloseable (recordar implementar los metodos de la interface dentro del recurso)
		try(Conexion con1 = new Conexion()){ //Intenta inicializar el objeto //Se ejecuta el constructor de Conexion por crearse una nueva conexion
			con1.leerDatos();//Si aca hubiese un error y no en el recurso, SI se ejecutaría el close(). Y luego el catch
		}//Al final se ejecuta el close() si no hay error en el recurso (en este caso el new Conexion). Si hay error en el o en cualquier otra cosa, no se ejecuta close(), y podemos usar catch
		catch(IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		
//try catch finally		
/*		Conexion con1 = null;//Inicializamos la variable con null	
	
		try {
			//Con el error lanzado al crear la conexion se saltearía el leer datos porque va al catch y cierra la sesion antes de leer los datos. Tremendo error de logica. Para eso vamos a hacer condicional dentro del finally para cerrarlo cuando se lea
			con1 = new Conexion();//Creamos una nueva Conexion, por defecto del constructor, el mensaje de abriendo conexion. Y para el ejemplo le lanzamos una excepcion. Si la creamos afuera del try, no reconoceria el IllegalStateException.
			//Si hay error en la creacion de la conexion, no se termina de crear y por lo tanto quedaría con el valor por defecto que tiene arriba fuera del try.
			con1.leerDatos();//Se lanza el error y va al catch
			//con1.cerrar();//La funcion es salteada sin querer cuando se detecta el error de leerDatos(), y entonces podriamos poner la misma funcion dentro del catch 
		
		}catch(IllegalStateException ex) {
			System.out.println("Recibiendo exception");
			ex.printStackTrace();
			//con1.cerrar();//Pero esto sería repetir codigo.
		}finally {//Esto permite que si se lanza el error o no, se ejecuta lo de aquí dentro
			System.out.println("Ejecutando finally");
		
			//con1.cerrar();//No importa si se lanza el error o no, se cierra la sesion igual.
			//Vemos que toma el con1 de afuera del try porque el new Conexion no se termina de concretar, entonces queda con null.
			if(con1 != null) { //Encapsulamos el null para que no salte ningun error si sucede
				con1.cerrar();
			}
		}//El finally siempre va despues del try/catch. El catch puede omitirse, quedando try/finally. Pero el try nunca puede quedar solo.
		
		//con1.cerrar()//ESTA MAL //No estaría bien conceptualmente cerrar una conexion por fuera, por lo general se usaria el finally.
*/
	
	}
}
