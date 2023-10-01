package ar.com.bytebank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
	public static void main(String[] args) {
		//Arreglo
		int[] numeros = new int[10];//Todo arreglo nace con tamaño fijo
	
		//Lista -> Es padre de ArrayList, ListLinked, Vector
		List<Integer> lista = new ArrayList<Integer>();//Crea una misma estructura que un Array, pero que nos permite tratarla y modificarla mas facil a traves de metodos.
		// Integer es un wrapper para enteros
		
		int numero = 40;//int NO guarda la referencia, SOLO el valor, es decir 40. Un objeto si guarda la referencia
		
		//Integer numeroObjeto = new Integer(40);//Hoy en dia, puede ser esto:
		Integer numeroObjeto = Integer.valueOf(40);//Agarra el 40 y lo almacena dentro de un objeto Integro. Esto hace Java automaticamente por el autoboxing como vemos mas abajo. Aclaracion, esta linea permite a un primitivo ser utilizado dentro de metodos que solo permiten objetos, lo que pasa es que Java lo hace de manera automatica.
		
		
		lista.add(numero); //Si queremos agregar un elemento a la lista, el elemento tiene que ser objeto, NO primitivo.
		//Pero vemos que quisimos agregar 'numero' que es primitivo y compila. Por Que? Porque java internamente hace autoboxing, es decir al primitivo lo guarda dentro de un objeto WRAPPER automaticamente para que no haya problemas
		lista.add(new Integer(40));//Lo que hace java internamente con 'numero'. Es el codigo de esta linea. Instancia un nuevo objeto Integrador que almacena el valor primitivo. Y por eso el .add se ejecuta correctamente aunque adentro se ponga un primitivo.
		//Integer está tachado porque se va a dejar de usar en un futuro. 
		//Entonces una mejor forma de hacerlo es con
		lista.add(Integer.valueOf(40));// Es lo mismo que el add de arriba pero evitando dejar la instancia tachada que puede llegar a dejar de funcionar e futuras actualizaciones de Java.
		lista.add(numeroObjeto);//Lo mismo de la linea de arriba
		//Entonces para clarar. Autoboxing
		// es una función de almacenar/conversión automática de tipos de datos primitivos, por ejemplo int, char, float, double a un objeto.
		/*
		 Autoboxing es aplicada por el compilador de Java por dos condiciones:
			-Cuando un valor primitivo se pasa como un parámetro a un método que espera un objeto de clase Wrapper correspondiente;
			-Cuando se asigna un valor primitivo a una variable de la clase Wrapper correspondiente;
		Vale la pena recordar, cuando se utiliza la función Autoboxing, comparando objetos con operador de igualdad

		(el operador en igualdad de condiciones ) == puede confundir, ya que se puede aplicar a ambos tipos de datos primitivos y objetos.

		Cuando el operador se aplica a los objetos, realmente compara la referencia a uno de los objetos, no a los valores.
		*/
		
		//Los wrapper pueden ser Integer, Character, Float, Double.
		
		//Ahora al reves:
		//unboxing
		//Por ejemplo si queremos almacenar/covertir un objeto en un primitivo, Java automaticamente le aplica un metodo para convertirlo a ese tipo. Por ejemplo
		/*
		 El recurso Unboxing es aplicada por el compilador de Java cuando un objeto es pasado como un parámetro para un método que
		espera un valor primitivo correspondiente y cuando se asigna un objeto a una variable del tipo primitivo correspondiente.
		 */
	
	// almacena primitivos   objeto
		int valorPrimitivo = numeroObjeto;//Se puede ver que compila.
	//	int valorPrimitivo = numeroObjeto.intValue();//Internamente hace esto. Busca si tiene un valor numerico entero, y lo convierte a int para que se pueda almacenar en el almacenador primitivo.
		//Obviamente tambien puede ser con los otros primitivos:
		byte byteInteger = numeroObjeto.byteValue();
		double doubInteger = numeroObjeto.doubleValue();
		float floInteger =numeroObjeto.floatValue();
		//etc
		
		//Tamaño de los valores de un Integer
		System.out.println(Integer.MAX_VALUE);//Valor maximo de los Integer
		System.out.println(Integer.MIN_VALUE);//Valor minimo de los Integer
		
		System.out.println(Integer.SIZE);//Cuantos bits soporta el Integer
		System.out.println(Integer.BYTES);//El tamaño en bytes
	}
}
