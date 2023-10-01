package ar.com.collectionsprac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ejemplo1 {
	public static void main(String[] args) {
	
		String curso1 = "geometria";
		String curso2 = "Fisica";
		String curso3 = "Quimica";
		String curso4 = "Historia";
	

		ArrayList<String> cursos = new ArrayList<>();	
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		//Ordenar con Collections
		System.out.println("Orden original"+cursos);
		
		Collections.sort(cursos);//Ordenar por defecto (menor a mayor)
		System.out.println("Orden natural con Collections"+cursos);
		
		Collections.sort(cursos, Collections.reverseOrder());//Orden invertido (mayor a menor)
		System.out.println("Orden invertido con Collections"+cursos);
		
		//Utilizando la misma lista con Comparator
		cursos.sort(Comparator.naturalOrder());
		System.out.println("Orden natural con Comparator"+cursos);
		
		cursos.sort(Comparator.reverseOrder());
		System.out.println("Orden invertido con Comparator"+cursos);
		
		//Otra forma de ordenar listas
		//Aquí utilizamos .stream() que nos devolverá una lista nueva basandose en la otra lista 'cursos'
		List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());
		System.out.println(cursosList);//Orden natural
		
		List<String> cursosListInv = cursos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(cursosListInv);//Orden invertido
	
		
		
	}
}
