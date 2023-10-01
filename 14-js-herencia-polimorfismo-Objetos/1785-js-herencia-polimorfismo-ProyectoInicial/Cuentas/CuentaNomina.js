import { Cuenta } from "./Cuenta.js";

export class CuentaNomina extends Cuenta{
    constructor(cliente, numero, agencia, saldo) {

        /*Con la palabra reservada 'Super', accedemos a cosas de la class padre */
        super(cliente, numero, agencia, saldo); 
    }


    //Asignarle la comision correspondiente a CuentaNomina, heredando la funcion del Padre Cuenta.
    retirarDeCuenta(valor) {
        //valor = valor * 1.01; //Al valor ingresado por parametro, se le multiplica por 1.01.
        //Esta formula de aquí arriba la modificamos en cuenta. Y así poder hacer mas manual la eleccion de la comision en el parametro.

        super._retirarDeCuenta(valor, 1); //Luego de la multiplicacion, se ejecutará la funcion de Padre Cuenta con el resultado. 
    }                                   //Como modificamos la formula, podemos poner el porcenaje de comision manualmente en este parametro. En este caso es 1%.

}