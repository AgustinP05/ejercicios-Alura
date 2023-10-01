package ar.com.bytebank.test.util;

import java.util.ArrayList;
import ar.com.bytebank.modelo.*;


public class TestArrayListEquals {
	public static void main(String[] args){

	    ArrayList<Cuenta> lista = new ArrayList<Cuenta>();

	    Cuenta cc1 = new CuentaCorriente(22, 22);
	    Cuenta cc2 = new CuentaCorriente(22, 22);

	    lista.add(cc1);

	    System.out.println("Ya existe? " + lista.contains(cc2));//contains es metodo que verifica si el arrayList contiene tal elemento
	    //Pero cc1 y cc2 son lo mismo. Entonces vamos a utilizar la funcion equals sobreescrita en Cuenta
	    System.out.println(cc1.equals(cc2));
	    //En otro momento podriamos comparar con equals y lanzar un error en el caso de que asi sea
	    
	    
	    for(Cuenta cuenta : lista){
	        System.out.println(cuenta);
	    }
	}
}
