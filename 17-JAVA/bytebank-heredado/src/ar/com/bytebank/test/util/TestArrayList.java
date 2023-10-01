package ar.com.bytebank.test.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import ar.com.bytebank.modelo.*;

public class TestArrayList {
	public static void main(String[] args) {

        //List<Cuenta> lista = new ArrayList<Cuenta>(); //usa array por debajo
        //List<Cuenta> lista = new LinkedList<Cuenta>(); //lista linkada
        //List<Cuenta> lista = new Vector<Cuenta>(); //usa array por debajo, pero también es threadsafe
        Collection<Cuenta> lista = new Vector<Cuenta>();//Con collection no se puede usar metodos como get, Ya que estos pertenecen a su hija List.
        
        Cuenta cc1 = new CuentaCorriente(22, 22);
	    Cuenta cc2 = new CuentaCorriente(22, 22);

	    lista.add(cc1);
	    
	    //Cuenta ref = lista.get(0);

	    System.out.println("Ya existe? " + lista.contains(cc2));//contains es metodo que verifica si el arrayList contiene tal elemento
	    //Pero cc1 y cc2 son lo mismo. Entonces vamos a utilizar la funcion equals sobreescrita en Cuenta
	    System.out.println(cc1.equals(cc2));
	    //En otro momento podriamos comparar con equals y lanzar un error en el caso de que asi sea
	    
	    
	    for(Cuenta cuenta : lista){
	        System.out.println(cuenta);
	    }
	    
    }
}
