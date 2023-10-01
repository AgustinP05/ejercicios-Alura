//En esta clase creamos una excepcion personalizada.
public class MiExcepcion extends Exception{//Checked
	public MiExcepcion() {
		super();
	}
	
	public MiExcepcion(String message) {
		super(message);
	}
}

/*
Excepciones son los errores que podemos controlar. Estan por encima de la JVM. Por ejemplo podemos controlarlas con try/catch.
Error es el tipo de error lanzado por la JVM. Estan dentro de la JVM. Por ejemplo, si se llena la memoria de la JVM por un ciclo infinito, nos dará un Error. 

La excepcion que queramos crear no puede implemetar Throwable ya que esta divide todo en Exception y error.

Si estamos seguros de que alguna funcion creada va a lanzar nuestra excepcion creada, ahí podriamos hacer que ella extienda de Exception. Y no se hace try/catch en ella.
Como estamos seguros de que la funcion va a lanzar ese tipo de excepcion si ocurre. En la firma de la funcion tenemos que indicar que la lanzará. Como por ejemplo:
public static void miFuncion() throws MiExcepcion{...}.

La diferencia con try/catch es que:
- La excepcion tiene que extender de RuntimeException
- En el try intenta ejecutar lo que podria provocar una excepcion. 
- Y con el catch atrapamos la excepcion por si acaso llega a cometerse ese tipo de excepcion en el try. (No hay 100% de seguridad de que cometa ese tipo de excepcion)

Mientras que con el throws en la firma:
- La excepcion tiene que extender de Exception (es decir, del tipo checked si o si).
- Estamos 100% seguros de que se puede lanzar esa excepcion en la funcion.


En Java hay dos grupos de excepciones: Checked y Unchecked
Checked: Objetos de Exception o cualquier clase que extiendan de este menos de RuntimeException.
El compilador nos obligará a tratar la excepcion si es lanzada en alguna parte del codigo.
Y requerirá la palabra throws en la firma de la funcion para avisar. Y podemos utilizar el try/catch para tratarla. Sino podemos avisarle a las demas funciones del flujo que les va a llegar esta excepcion con throws. Así hasta llegar al main o hasta algun bloque que se haga cargo de la excepcion.
Unchecked: Objetos de RuntimeException o cualquier clase que extienda de esta.
Al compilador no le importará si voy a tratar o no esta exception.
*/


/*
 Esta excepcion creada por mi (MiExcepcion), extiende de RuntimeException. ArithmeticException y NullPointerException tambien extienden de esa.
 RuntimeException extiende de Exception, la cual tiene las funciones mas generales.
 Exception implementa una interface llamada Throwable. Error tambien la implementa
 */

/*													(Interface Throwable)
 		
 						[Exception]															[Error]
 		
 					[RuntimeException]												[StackOverflowError]
 		
 		[ArithmeticException] [NullPointerException] [{MiExcepcion}]
 
 
 */




