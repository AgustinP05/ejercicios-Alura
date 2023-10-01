package ar.com.collectionsprac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.collectionsprac.model.Clase;
import ar.com.collectionsprac.model.Cursada;

public class ejemplo3 {
	public static void main(String[] args) {
		
		Cursada curso1 = new Cursada("Geometria", 30);
		curso1.addClase(new Clase("List"));
		curso1.addClase(new Clase("ArrayList"));
		curso1.addClase(new Clase("LinkedList"));
		
		//Ejemplo Encapsulamiento de addClase para que sea la unica que cumpla su funcion
		
		List<Clase> claseList = curso1.getClaseList();//Creamos una lista, le agregamos dentro la lista de curso1
		//claseList.add(new Clase("Inmutable"));	// Aqui hacemos trampa y le agregamos un elemento a la lista sin utilizar el metodo que deberiamos
		//Con estas dos lineas de arriba, hemos agregado una nueva materia de manera tramposa, cuando deberiamos usar el addClase para hacer eso.
		//Entonces vamos a hacer que el getClaseList sea inmutable cuando la llamemos, gracias al Collections.unmodifiableList. Y que solo podamos utilizar el addClase para agregar a la lista (es decir, encapsulamos addClase).
		curso1.addClase(new Clase("Inmutable"));
		
		
		ArrayList<Cursada> cursos = new ArrayList<Cursada>();	
		cursos.add(curso1);
			
		System.out.println(cursos.get(0).getClaseList());
		
	}
}
