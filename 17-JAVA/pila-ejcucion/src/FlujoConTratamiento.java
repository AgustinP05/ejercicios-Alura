

public class FlujoConTratamiento {
	
		   public static void main(String[] args) { 
		        System.out.println("MAIN BEGIN");
		        try {
		        	m1();
		        }catch(ArithmeticException | NullPointerException | MiExcepcion ex) {//Si yo quiero atrapar todo tipo de excepcion tanto unchecked como checked, simplemente pongo Exception ya que todas las excepciones heredan de esta
		        	String mensaje = ex.getMessage();
		        	
		        	System.out.println("Excpetion "+mensaje);
		        	ex.printStackTrace();
		        }
		        
		        System.out.println("MAIN END");
		    }

		    public static void m1() throws MiExcepcion { 
		        System.out.println("B BEGIN"); 
		        m2();
		        System.out.println("B END");
		    }

		    public static void m2() throws MiExcepcion {
		        System.out.println("A BEGIN");
		        
		       // ArithmeticException nuevaExcepcion = new ArithmeticException();
		       //throw nuevaExcepcion; //Creamos una nueva excepcion en una variable y la lanzamos. Pero no es necesario crearla así. En la practica se lanza directamente.
		        throw new MiExcepcion("Ocurrio un error.");//El throw solo sirve para lanzar SOLO objetos que son excepciones (SOLO objetos que implementen Throwable). Y cuando llega a esto, termina el ciclo de ejecucion. Podemos mandar un mensaje por el parametro.
		        //MiExcepcion() es una excepcion creada por mi en otra clase, aprovechando las herencias de RuntimeException.
		        
		        //System.out.println("A END");//Lo que esté por abajo de excepcion lanzada, no se ejecutará.
		    }
	

}
