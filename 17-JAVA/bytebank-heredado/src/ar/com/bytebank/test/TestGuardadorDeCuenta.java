package ar.com.bytebank.test;

import ar.com.bytebank.modelo.Cuenta;
import ar.com.bytebank.modelo.CuentaCorriente;
import ar.com.bytebank.modelo.GuardadorDeReferencias;

public class TestGuardadorDeCuenta {
	public static void main(String[] args) {
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Cuenta cc1 = new CuentaCorriente(10, 15);
		guardador.adicionar(cc1);
		
		Cuenta cc2 = new CuentaCorriente(10, 20);
		guardador.adicionar(cc2);
		
		int largoDeLista = guardador.getLargoDeLista();
		System.out.println(largoDeLista);
		
		Cuenta ref =(Cuenta) guardador.getReferencia(0);//Con ref de tipo Cuenta, sale error porque algo de tipo Cuenta no puede contener dentro algo del tipo Padre. Entonces le hacemos Cast para que sea compatible
		System.out.println(ref.getNumero());
	}
}
