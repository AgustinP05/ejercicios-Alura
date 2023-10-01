import { Cuenta } from "./Cuenta.js"; //Viene del extends

export class CuentaAhorro extends Cuenta{
    
    
    constructor(cliente, numero, agencia, saldo) {

        /*Con la palabra reservada 'Super', accedemos a cosas de la class padre */
        super(cliente, numero, agencia, saldo); 
    }
   

     //Asignarle la comision correspondiente a CuentaAhorro, heredando la funcion del Padre Cuenta.
     retirarDeCuenta(valor) {
        //valor = valor * 1.02; //Al valor ingresado por parametro, se le multiplica por 1.02.
        //Esta formula de aquí arriba la modificamos en cuenta. Y así poder hacer mas manual la eleccion de la comision en el parametro.

        super._retirarDeCuenta(valor, 2); //Luego de la multiplicacion, se ejecutará la funcion de Padre Cuenta con el resultado. 
    }                                   //Como modificamos la formula, podemos poner el porcenaje de comision manualmente en este parametro. En este caso es 2%.


}