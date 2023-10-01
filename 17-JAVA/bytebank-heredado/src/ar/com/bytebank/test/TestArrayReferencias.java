package ar.com.bytebank.test;


import ar.com.bytebank.modelo.CuentaCorriente;
import ar.com.bytebank.modelo.CuentaAhorros;
import ar.com.bytebank.modelo.Cuenta;

public class TestArrayReferencias {
	public static void main(String[] args) {
		
		//Primero pruebo con CuentaCorriente
		//CuentaCorriente[] listaCuentas = new CuentaCorriente[5];//Array tipo CuentaCorriente 5 espacios
		//Cambio el tipo de la lista así se permite ingresarle cualquier dato que sea o extienda de Cuenta.
		Cuenta[] listaCuentas = new Cuenta[5];
		
		CuentaCorriente cc1 = new CuentaCorriente(22, 11);
		listaCuentas[0] = cc1; //Metimos cc1 dentro de index 0 de listaCuentas. No hay problema porque son del mismo tipo
		
		CuentaCorriente cc2 = new CuentaCorriente(22, 22);
		listaCuentas[1] = cc2; //Metimos cc2 dentro de index 1 de listaCuentas. No hay problema porque son del mismo tipo
		
		System.out.println(listaCuentas[1].getNumero()); //Funciona. cc2 está dentro
		
		/*Aclaracion: Luego de cambiar el array de tipo CuentaCorriente a Cuenta. No funcionará
		 porque la listaCuentas al ser tipo Cuenta, no puede asignarse dentro de algo que sea del tipo del hijo.
		
		//CuentaCorriente ref = listaCuentas[0];//Basicamente metimos cc1 dentro de la variable ref que tambien es tipo CuentaCorriente
		
		Podemos solucionarlo cambiando a ref a tipo Cuenta para que coincida
		*/
		//Cuenta ref = listaCuentas[0];//Ahora si funcionará
		/*
		 Otra forma de solucionarlo podria hacer con un type cast para que la lista sea del tipo CuentaCorriente. 
		 Ya que para el ejemplo asumimos que listaCuentas[0] contiene un dato de tipo CuentaCorriente.
		 Podría ser una razon suficiente para utilizar type cast y asumir que hacemos pasar listaCuentas como CuentaCorriente en esta ocasion para ingresarlo dentro de ref.  
		 */
		CuentaCorriente ref = (CuentaCorriente) listaCuentas[0];//Hacemos pasar listaCuentas de tipo Cuenta a CuentaCorriente en esta ocasion //Como estamos seguros de que el elemento dentro de la posición listaCuentas[0] es una instancia de CuentaCorriente, podemos asumir la responsabilidad de la conversión a través de un type cast
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		
		//Ahora pruebo con CuentaAhorro
		CuentaAhorros ca1 = new CuentaAhorros(25,15);
		//En este punto, listaCuentas es del tipo CuentaCorriente. No se le puede ingresar otro tipo de dato.
		//En la creacion de la lista podemos cambiar su tipo a uno mas general como Cuenta. Asi se le puede ingresar datos de cualquier tipo que extienda de ella.
		//Ahora SI funcionará el ingreso de un dato tipo CuentaAhorro.
		listaCuentas[2] = ca1;
		System.out.println(ca1.getNumero());
		
		//Si hacemos lo mismo que ref pero ahora con el index 2
		//CuentaCorriente ref2 = (CuentaCorriente) listaCuentas[2];
		//Vemos que ocurre un error. Esto es porque dejamos un cast erroneo
		//Recordemos que en listaCuentas[2] hay dentro un dato de tipo CuentaAhorros, entonces habria una discordia si cambiamos la lista de tipo Cuenta a CuentaCorriente y que adentro haya algo de CuentaAhorro
		//Por eso hacemos lo siguiente
		CuentaAhorros ref2 = (CuentaAhorros) listaCuentas[2]; //Lo corregimos como en ref uno pero ahora con CuentaAhorros
		System.out.println(ref2.getNumero());
	}
}
