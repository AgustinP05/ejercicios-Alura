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

public class ejemplo9 {
	public static void main(String[] args) {
		
		//Hacemos como que los alumnos estan registrados a la clase
		
		//En Cursada.java creamos una propiedad nueva que es AlumnoLista, en donde deberian estar registrados los estudiantes segun la clase que eligieron
		//Esta AlumnoLista utilizara una lista HashSet, recordemos que esta identifica a cada elemento por hash. 
		//Gracias a lo sobreescrito en Alumno.java, se nos hace mas facil ya que ahora segun el String nombre va a ser un hash unico
		//Cada vez que se crea una Cursada, adentro se crea una AlumnosLista. Dentro de AlumnoLista vamos a guardar alumnos unicos
		
		Cursada curso1 = new Cursada("Geometria", 30);
		
		Alumno alumno1 = new Alumno("Agustin Perea", "001");
		Alumno alumno2 = new Alumno("Joel Miller", "002");
		Alumno alumno3 = new Alumno("Leon Kennedy", "003");
		Alumno alumno4 = new Alumno("Lara Croft", "004");
		Alumno alumno5 = new Alumno("Rick Sanchez", "005");
		Alumno alumno6 = new Alumno("Peter Parker", "006");
		Alumno alumno7 = new Alumno("Eric Cartman", "007");
		Alumno alumno8 = new Alumno("John Marston", "008");
		
		
		//Gracias al addAlumno creado en Cursada.java, podemos agregar un alumno al curso seleccionado	
		curso1.addAlumno(alumno1);
		curso1.addAlumno(alumno2);
		curso1.addAlumno(alumno3);
		curso1.addAlumno(alumno4);
		curso1.addAlumno(alumno5);
		curso1.addAlumno(alumno6);
		curso1.addAlumno(alumno7);
		curso1.addAlumno(alumno8);

		
		Alumno alumnoNuevo = new Alumno("John Marston", "008");
		
		//System.out.println(curso1.getAlumno().contains(alumnoNuevo));
		//Ahora podemos hacer:
		System.out.println(curso1.verificarAlumno(alumnoNuevo));
		
		System.out.println(alumno8.equals(alumnoNuevo));
		
		
	}
}
