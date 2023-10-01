//Clase de ejemplo que simula la conexion con un servidor. La utilizaremos para practicar el try/catch y finally.
public class Conexion implements AutoCloseable {
	
	public Conexion() {//Constructor
		System.out.println("Abriendo conexion");
		//throw new IllegalStateException(); //Hacemos para el ejemplo que el error es lanzado al crear la conexion para ver que pasa
	}
	
	public void leerDatos() {
		System.out.println("Recibiendo datos");
		throw new IllegalStateException(); //Exception para el ejemplo, extiende de runtimeException. Excepcion comun cuando se trabaja con comunicacion con bases de datos.
	}
	
	public void cerrar() {
		System.out.println("Cerrando conexion");
	}

	//Metodo implementado por AutoCloseable. Es el unico metodo que tiene y sirve para ejecutarse al final del try si no ocurre error
	//Notar que esta por defecto lanza Exception, entonces tenemos que tratarla en el try resource
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		cerrar();
	}//Se ejecuta este codigo al final del try resource si NO ocurre el error
	//Si ocurre el error, tendremos que tratarlo con un catch
	
}
