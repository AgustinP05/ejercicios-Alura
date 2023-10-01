package ar.com.collectionsprac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.collectionsprac.model.Cursada;

public class ejemplo2 {
	public static void main(String[] args) {
		
		Cursada curso1 = new Cursada("Geometria", 30);
		Cursada curso2 = new Cursada("Fisica", 10);
		Cursada curso3 = new Cursada("Quimica", 40);
		Cursada curso4 = new Cursada("Historia", 25);
		

		ArrayList<Cursada> cursos = new ArrayList<Cursada>();	
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);//Orden original|
		
		//Ordenar con Collections
		Collections.sort(cursos);//Como la lista contiene datos del tipo Cursada, da error ya que esa clase no implementa la interface Comparable como String en el ejemplo1.java
		//Luego de implementar la interfaz en cursada y sobreescribirla, no dará error.
		System.out.println(cursos);
		Collections.sort(cursos, Collections.reverseOrder());//Por si la quiero al reves
		//Tambien si no quiero implementar la interface pero quiero seguir usando Collections
		Collections.sort(cursos, Comparator.comparing(Cursada::getNombre).reversed());
		
		
		//Si no queremos implementar la interface ni usar Collections podemos hacer aquí
		cursos.sort(Comparator.comparing(Cursada::getNombre));
		System.out.println(cursos);
	
		
		//Ordenar enteros con stream
		//Recordar que stream funciona creando listas nuevas gracias al collect
		//Dentro de filter utilizamos lambda para que se ignore el elemento con el nombre Historia. Va con el signo de exclamacion porque sino ingnoraria todos menos Historia
		List<Cursada> cursoEj2 = cursos.stream().filter(elemento -> !elemento.getNombre().equalsIgnoreCase("Historia")) .sorted(Comparator.comparingInt(Cursada::getTiempo)).collect(Collectors.toList());
		System.out.println(cursoEj2);
	
	}
}
