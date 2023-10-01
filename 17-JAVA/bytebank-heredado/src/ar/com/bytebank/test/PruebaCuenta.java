package ar.com.bytebank.test;
import ar.com.bytebank.modelo.*;

public class PruebaCuenta {
	public static void main(String[] args) {
		CuentaCorriente corriente1 = new CuentaCorriente(123, 1);
		CuentaAhorros ahorros1 = new CuentaAhorros(234, 2);
		
		//(4*)Queremos que ahora cuando se transfiere entre cuentas, se cobre una comision de 20 centimos. Para eso debemos modificar la funcion retirar() y la modificamos en cada tipo de Cuenta.
		corriente1.depositar(2000);//Funcion heredada del padre
		corriente1.transferir(1000, ahorros1);//Funcion heredada pero le hicimos polimorfismo de sobreescritura . Para que tenga una comision en esa clase.
		
		System.out.println(corriente1.getSaldo());
		System.out.println(ahorros1.getSaldo());
	}
}
