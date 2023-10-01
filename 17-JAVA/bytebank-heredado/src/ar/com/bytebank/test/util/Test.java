package ar.com.bytebank.test.util;

import java.util.ArrayList;

import ar.com.bytebank.modelo.*;

public class Test {
    public static void main(String[] args) {

        ArrayList<Cuenta> lista = new ArrayList<Cuenta>();//Decimos que cualquiera del tipo Cuenta puede entrar en el arrayList
        
        //Cliente cliente = new Cliente();
        //lista.add(cliente);

        Cuenta cc = new CuentaCorriente(22, 11);
        lista.add(cc);

        Cuenta cc2 = new CuentaCorriente(22, 22);
        lista.add(cc2);

        System.out.println("Tamano: " + lista.size());

        Cuenta ref = /*(Cuenta)*/lista.get(0);//No hace falta el Cast porque ya lo determinamos en el diamante del arrayList
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamano: " + lista.size());

        Cuenta cc3 = new CuentaCorriente(33, 311);
        lista.add(cc3);

        Cuenta cc4 = new CuentaCorriente(33, 322);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("----------");

      //Por cada objeto del tipo Object de la lista, lo referenciamos con el nombre oRef y hace lo siguiente 
        for(Object oRef : lista) {//Esto es un forEach
            System.out.println(oRef);
        }

        System.out.println("-----------");
        
        ArrayList<String> lista2 = new ArrayList<String>(26); //capacidad inicial
        lista2.add("RJ");
        lista2.add("SP");
        //otros estados
        ArrayList<String> nueva = new ArrayList<String>(lista2); //creando basada en la primera lista.Ahora su tamaño va a basarse siempre en el de la lista2
        
    }
}
