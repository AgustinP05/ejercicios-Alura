//Excepciones
//Estas son objetos que se muestran cuando ocurre un error determinado, dando una explicacion concreta de la excepcion

//EXCEPCION 1: 
	//Aquí un numero se divide por 0. Es una excepcion de Java, no se puede. 
  	//Entonces en la consola nos muestra primero el nombre de la excepcion. 
	//Segundo nos muestra un mensaje '/by zero' en este caso. 
   	//Tercero. Nos muestra el rastro del error en la pila. El error empieza en la linea 20 del m2 que el mismo no supo como solucionarlo, y se arrastra hacia atras hacia el m1 que tampoco sabe como resolver el problema. Entonces termina en main que tampoco supo como resolverlo. Impidiendo que se termine de ejecutar lo demas del codgio. 
////////////
//EXCEPCION 2: Forzamos otro error pero ahora con String.

//Cuando creo que en algun lugar del codigo pueda dar algun error, puedo avisarle a Java con try para que lo intente, y catch para que atrape al error y poder mandar un mensaje por ejemplo (elcatch es como un else).
//Con el try/catch el codigo no se interrumpe y podemos programar nosotros mismos que queremos que haga el codigo si sucede el error que pensabamos
//En el parametro del catch, como pasa con una variable, podemos indicar que tipo de error va a atrapar y le damos un nombre.
//A ese error que atrapamos con el catch, podemos asignarle metodos del tipo de excepcion como cuando llamamos funciones de una clase.
//Si en el try no ocurre ningun error, no entrará al catch y seguirá con lo demas del codigo.
public class Flujo {
	   public static void main(String[] args) { 
	        System.out.println("MAIN BEGIN"); 
	        m1();
	        System.out.println("MAIN END");
	    }

	    public static void m1() { 
	        System.out.println("B BEGIN"); 
	        m2();
	        System.out.println("B END");
	    }

	    public static void m2() {
	        System.out.println("A BEGIN");
	        for(int i = 1; i <= 5; i++) {
                System.out.println(i);
                
                try {//Intenta esto
                	if(i == 3) {
                		int num = 0;
                        int resultado = i/num;//EXCEPCION 1 
                        System.out.println(resultado);
                	}
                	String test = null; //EXCEPCION 2
                    System.out.println(test.toString());
                }	
//                catch(ArithmeticException excepcionPrueba){//Si ocurre un error, agarra la excepcion de tipo del parametro, lo agarramos y ejecutamos lo siguiente
                		/*Tipo de error    nombre*/
//                	System.out.println("Atrapo Arithmetic");
//                	System.out.println(excepcionPrueba.getMessage()); //Funcion que muestra el mensaje de la excepcion '/ by zero' //Como hace por defecto cuando ocurre un error
//                	excepcionPrueba.printStackTrace();//Funcion que imprime el rastro por donde pasa la excepcion //Como hace por defecto cuando ocurre un error
//                }
                //Podemos hacer todos los catch que queramos mientras no se repitan el tipo de excepcion en los parametros
//                catch(NullPointerException excepcionPrueba2){
//                	System.out.println("Atrapo NullPointer");
//                	System.out.println(excepcionPrueba2.getMessage()); 
//                	excepcionPrueba2.printStackTrace();
//                }
                //Tambien podria meter los dos tipos de excepciones en un solo catch si es que quiero que se haga la misma funcion con todos los tipos seleccionados.
                catch(ArithmeticException | NullPointerException  excepcion){ //Si ocurre cualquiera de las dos excepciones, ejecutará el siguiente codigo.
                	System.out.println("Atrapo excepcion");
                	System.out.println(excepcion.getMessage()); 
                	excepcion.printStackTrace();
                }
            }//La diferencia es que si no utilizamos el try/catch, el codigo deja de ejecutarse porque NO sabe que hacer con el error. En cambio con estos,SI sabe que hacer y atrapa la excepcion para trabajarla. Por lo tanto el codigo sigue ejecutando.
	        
	        	System.out.println("A END");
	    }
}
