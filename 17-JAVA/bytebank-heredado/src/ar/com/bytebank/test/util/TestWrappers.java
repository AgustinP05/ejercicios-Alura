package ar.com.bytebank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestWrappers {
	/*Wrappers
	 Son clases que contienen funcionalidades y encapsulan la variable de tipo primitivo.
	 Podemos crear objetos de esas clases para envolver o devolver un valor primitivo. 
	 Hay varias funcionalidades en estas clases que ayudan en el día a día 
	 
	 Representacion de cada tipo primitivo a objeto
	  
	 * double pertenece a java.lang.Double		(8 bytes)
	 * float              java.lang.Float		(4 bytes)
	 * long               java.lang.Long		(8 bytes)
	 * int                java.lang.Integer		(4 bytes)
	 * short			  java.lang.Short		(2 bytes)
	 * byte               java.lang.Byte		(1 bytes)
	 * char               java.lang.Character	(2 bytes)
	 * boolean            java.lang.Boolean
	 
	 Los objetos Wrapper extienden de la clase Number.
	 
	 Los wrappers los vamos a usar por ejemplo para declarar atributos
	 Los primitivos normales (Los que empiezan con minuscula), los vamos a usar para cosas mas basicas con poca complejidad.
	 
	 La creación del objeto Wrapper se llama autoboxing.
	 La extracción del valor primitivo del objeto Wrapper se llama unboxing.
	 Los dos sucedes automaticamente
	 */
	
	public static void main(String[] args) {
		
		Double numeroDouble = 33.0; //Compila ya que el valor es compatible para que se cometa autoboxing
		Boolean verd = true; //Idem
		
		Double numeroDouble2 = Double.valueOf(33);//Compila ya que aunque sea un objeto dentro de un primitivo, este objeto retorna un double, asi que cumple.
		System.out.println(numeroDouble2);//Muestra 33.0
		
		String numString = "45";//autoboxing porque al objeto String internamente es: new String("45"); 
		Double stringToDoub = Double.valueOf(numString);//Transformamos el String en Double
		Integer stringToInte = Integer.valueOf(numString);//Y ahora a integer
		
		//Como estas clases wrappers extienden de number, podria hacer
		Number numero = Integer.valueOf(5);//Funcionará ya que Integer es hijo de Number, entonces todo Integer es Number. Lo mismo con los demas wrappers
		//primitivo
		double numDouble =numero.doubleValue();//unboxing porque el objeto lo pasa a primitivo //Esta linea funciona porque Number conoce todos los metodos de wrappers. Y este metodo cambia el tipo de valor a double.
	
		
		
		/*Aclaracion
		 El metodo .valueOf(X) los usan los wrappers para retornar una referencia en la cual despues se hace un unboxing
		 El metodo .parseInt() y variantes, los utilizan para de un String retornar a un primitivo
		 */
		//Practica unboxing/autoboxing 
		Integer edadRef = 29; //autoboxinng, es creado un objeto de tipo Integer
        int primitivo = new Integer(21); //que locura!! unboxing

        //Para almacenar un primitivo en una colección, necesita crear un objeto que envuelva el valor. En este caso envolvimos numeros en Integer
        List<Integer> lista = new ArrayList<>();
        lista.add(edadRef); //ok
        lista.add(primitivo); //autoboxing porque el metodo nos pide un objeto y le queremos meter un primitivo. Entonces internamente al primitivo se lo transforma a objeto 

        int i1 = lista.get(0);  //unboxing porque el edadRef era un objeto Integer desde el principio. Y aquí queremos almacenar ese Integer dentro de un almacenador primitivo int i1. Entonces se hará unboxing
        Integer i2 = lista.get(1);  //ok porque en antes el primitivo se convirtió a objeto internamente. Entonces estamos queriendo almacenar un Integer dentro del Integer i2 

        System.out.println(i1);  //29
        System.out.println(i2); //21
         
        
        //Parsing
        Integer iParseado1 = Integer.valueOf("42"); //convertido y devolviendo referencia
        int iParseado2 = Integer.parseInt("44");  //parseando y devolviendo primitivo

        System.out.println(iParseado1); //42
        System.out.println(iParseado2); //44

	
	}
	
}
