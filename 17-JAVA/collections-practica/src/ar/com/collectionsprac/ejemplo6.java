package ar.com.collectionsprac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ar.com.collectionsprac.model.Cursada;

public class ejemplo6 {
	public static void main(String[] args) {
		//////////Suponiendo que repetimos algunos
		
		Cursada curso1 = new Cursada("Geometria", 30);
		Cursada curso2 = new Cursada("Fisica", 10);
		Cursada curso3 = new Cursada("Quimica", 40);
		Cursada curso4 = new Cursada("Historia", 25);
		Cursada curso5 = new Cursada("Literatura", 35);
		Cursada curso6 = new Cursada("Literatura", 50);
		Cursada curso7 = new Cursada("Matematica", 60);
		Cursada curso8 = new Cursada("Matematica", 45);
		
		
		ArrayList<Cursada> cursos = new ArrayList<Cursada>();	
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		cursos.add(curso6);
		cursos.add(curso7);
		cursos.add(curso8);
		
		System.out.println(cursos);
		
		
		List<Cursada> cursoEj2 = cursos.stream().filter(elemento -> !elemento.getNombre().equalsIgnoreCase("Historia")) .sorted(Comparator.comparingInt(Cursada::getTiempo)).collect(Collectors.toList());
		System.out.println(cursoEj2);
	
	
		Map<String, List<Cursada>> groupCursada = cursos.stream().collect(Collectors.groupingBy(Cursada::getNombre));
		//Hace una lista y agrupa por los nombres como key y como value. Si hay repetidos los agrega dentro de value 
	
		groupCursada.forEach((key,value)->System.out.println(key+" - "+value.size()));
		//Con .size() vemos la cantidad de repeticiones de cada uno. Ya que eso cuenta la cantidad de elementos en el array. Recordemos que cada materia tiene un array con la cantidad de veces que se repite 
	
		
		//ParallelStream. Hace Stream en hilos (threads). Sirve mucho para buscar elementos. 
		//La intención de Parallel stream es permitir que el procesamiento se divida entre los procesadores de su máquina.
		System.out.println(cursos.parallelStream().mapToInt(Cursada::getTiempo).max());
	}
}
