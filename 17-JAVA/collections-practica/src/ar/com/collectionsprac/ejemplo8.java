package ar.com.collectionsprac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ar.com.collectionsprac.model.Alumno;
import ar.com.collectionsprac.model.Cursada;

public class ejemplo8 {
	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Agustin Perea", "001");
		Alumno alumno2 = new Alumno("Joel Miller", "002");
		Alumno alumno3 = new Alumno("Leon Kennedy", "003");
		Alumno alumno4 = new Alumno("Lara Croft", "004");
		Alumno alumno5 = new Alumno("Rick Sanchez", "005");
		Alumno alumno6 = new Alumno("Peter Parker", "006");
		Alumno alumno7 = new Alumno("Eric Cartman", "007");
		Alumno alumno8 = new Alumno("John Marston", "008");
		
		
		
		Collection<Alumno> listaAlumnos = new HashSet<>() ;//HashSet es un equivalente de ArrayList.
	
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
	/*	
		for(Alumno alumno : listaAlumnos) {
			System.out.println(alumno);
		}
	*/
		
		//Si nosotros creamos un nuevo alumno con los mismos datos que alguno ya creado, queremos que el programa reconozca que es la misma persona
		//Pero java ve que pertenecen a dos referencias de memoria diferentes.
		Alumno alumnoNuevo = new Alumno("John Marston", "008");
		System.out.println(listaAlumnos.contains(alumnoNuevo));//Retorna false aunque la lista tenga un alumno con los mismos datos
		//Si cambio la lista de HashSet a ArrayList, el contains dará true, ya que ArrayList funciona diferente. HashSet no tiene indices para organizar elementos, sino que utiliza identificadores hash diferentes para cada uno
		//Para que esto de los Hash sea mas efectivo y que guarde el nombre y codigo en un hash, podemos sobreescribir hashCode
		//Luego de sobreescribir hashCode para que haga el hash por nombre de Alumno y no por instancia de nuevo Alumno, dará true.
		
		System.out.println(alumno8.equals(alumnoNuevo));//Tambien retorna false porque son diferentes. Despues de sobreescribir el metodo equals para comparar por nombre, dará true 
		
		//Consejo: Si usamos el HashSet, es recomendable que si vamos a sobreescribir equals(), tambien sobreescribamos hashCode() para evitar errores conceptuales
		//Porque al usar el método contains usa el hashCode y el equals es usado para comparar valores, es una necesidad primordial sobrescribir estos métodos, para buscar los resultados esperados en nuestras comparaciones
		//es bueno hacer esa sobrescritura de métodos, para luego tener la capacidad de migrar para alguna otra interfaz sin la mayor preocupación de obtener resultados no esperados.
	
		/*
		 HashSet no tiene un orden predecible. Imagina una bolsa de bingo. En su interior añadimos varias bolas numeradas que no se repiten, se utiliza cuando no es importante el orden sino un gran rendimiento y velocidad;

		LinkedHashSet es una versión ordenada de HashSet que mantiene una lista doblemente enlazada en todos los elementos. Use esta clase en lugar de HashSet cuando le importe el orden de iteración.

		ArrayList es una implementación de la interfaz List, en este caso a diferencia de las implementaciones de la interfaz Set, la ArrayList permite repeticiones. En él se respeta el orden de las inserciones porque es secuencial.
		 */
	}
}
