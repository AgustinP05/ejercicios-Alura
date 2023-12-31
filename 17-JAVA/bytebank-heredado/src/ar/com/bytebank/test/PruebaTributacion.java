package ar.com.bytebank.test;
import ar.com.bytebank.modelo.*;

public class PruebaTributacion {
	public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(222, 333);
        cc.depositar(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadoraDeImpuesto calc = new CalculadoraDeImpuesto();

        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImpuesto());
    }

}
