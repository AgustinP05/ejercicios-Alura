package ar.com.collectionsprac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.collectionsprac.model.Clase;
import ar.com.collectionsprac.model.Cursada;

public class ejemplo4 {
	
	//Probamos la diferencia de velocidad entre LinkedList y ArrayList
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
        add(new LinkedList<>());
        add(new ArrayList<>());
        }
    };
	
	
	public static void main(String[] args) {
		for(List<Integer> lista : listas) {
            final String nombreImplementacion = lista.getClass().getSimpleName();
            //add
            long inicio = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                lista.add(i);
            }
            long fin = System.currentTimeMillis();
            long duracion = fin - inicio;
            System.out.println(nombreImplementacion + " add: " + duracion);

            //get
            inicio = System.currentTimeMillis();
            for(int i = 0; i < 100000; i++) {
                lista.get(i);
            }
            fin = System.currentTimeMillis();
            duracion = fin - inicio;
            System.out.println(nombreImplementacion + " get: " + duracion);

            //remove
            inicio = System.currentTimeMillis();
            for(int i = 99999; i >= 100000; i++) {
                lista.remove(i);
            }
            fin = System.currentTimeMillis();
            duracion = fin - inicio;
            System.out.println(nombreImplementacion + " remove: " + duracion);
            
        }
		
	}
}

//El método get es más rápido usando ArrayList que LinkedList. Al usar ArrayList, al guardar la posición termina siendo más rápido que un LinkedList.
