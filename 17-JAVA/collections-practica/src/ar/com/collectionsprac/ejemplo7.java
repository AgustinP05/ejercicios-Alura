package ar.com.collectionsprac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ar.com.collectionsprac.model.Cursada;

public class ejemplo7 {
	public static void main(String[] args) {
		
		String alumno1 = "Agustin Perea";
		String alumno2 = "Joel Miller";
		String alumno3 = "Leon Kennedy";
		String alumno4 = "Lara Croft";
		String alumno5 = "Peter Parker";
		String alumno6 = "Peter Parker";
		String alumno7 = "John Marston";
		String alumno8 = "John Marston";
		
		//Collection tiene varias ramificaciones, entre ellas List, Set Queue, Deque
		//Vamos a ver Set
		
		Set<String> listaAlumnos = new HashSet<>() ;//HashSet es un equivalente de ArrayList.
		
		//Consejo:
		//Si nosotros no sabemos que tipo de lista usar para una situacion inespecifica, podriamos empezar con crear una lista cualquiera del tipo Collection
		//Y por herencia podemos hacer cualquier tipo de clase
		/*
		Collection<String> listaAlumnos = new ArrayList<>();
									   LinkedList<>();
									   HashSet<>();
		No habria error, no tengo por que crearla especificamente con Set si lo puedo hacer con el padre
		*/
		
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
		
		for(String alumno : listaAlumnos) {
			System.out.println(alumno);
		}
		
		//Si contiene ese elemento, retorna booleano
		boolean contiene = listaAlumnos.contains("John Marston");
		System.out.println(contiene);
		
		//Ver cual tiene mas caracteres
		String maximo = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
					//  lista       .stream.ver maximo (comparando ints (del largo de los String)) y obtener el valor.
		System.out.println(maximo.length());
		
		//Ignorar el elemento
		listaAlumnos.removeIf(alumno ->"Leon Kennedy".equalsIgnoreCase(alumno));
		//Por cada alumno, compara si el String del nombre coincide con "Leon Kennedy". Si coincide da true
		//El removeIf remueve al elemento que retorne true en la condicion de su parametro
		for(String alumno : listaAlumnos) {
			System.out.println(alumno);
		}
		
		
		/*Cosas a destacar: 
		 * Set no tiene un orden. 
		 * La forma de obtener un elemento es un poco mas dificil. Seria por ejemplo con un ciclo for hasta encontrar el elemento.
		 * No hay una posicion especifica. 
		   Entonces no existe el metodo .get(0) para obtener un elementos.
		   Es como que encierra los elementos dentro de un circulo y no en una fila como sucede en interface List
		 * Evita elementos repetidos. Es efectivo si queremos hacer un programa que tenga numeros de tarjetas de credito, identificadores unicos, etc.
		
		*/
	}
}
