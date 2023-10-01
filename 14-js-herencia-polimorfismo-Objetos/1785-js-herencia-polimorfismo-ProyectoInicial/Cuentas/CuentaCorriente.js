
import { Cuenta } from "./Cuenta.js";  //vino por el extend hacia aquí.



/*Aquí vamos a hacer la extencion para heredar datos de la class Cuenta a la class CuentaCorriente. Se hace con la palabra reservada 'extends' y el nombre de la class padre de la que se quieren traer los datos. Se creará de forma automatica el import de la class padre arriba, en este caso de Cuenta.*/
export class CuentaCorriente extends Cuenta{
    static cantidadCuentas = 0;

   

    constructor(cliente, numero, agencia) {

        /*Con la palabra reservada 'Super', accedemos a cosas de la class padre */
        super(cliente, numero, agencia, 0); //Notece que el saldo lo puse aquí con 0 para inicializarlo con ese valor. Entonces no hace falta inicializarlo con 0 en el index.js. 
        CuentaCorriente.cantidadCuentas++;
    }



    /*
    prueba(){   //Funcion de class hijo
        super.prueba();  //Accedimos la funcion prueba() de class padre con super.
        console.log('Método hijo');
    } // Si Esta funcion solo estuviese en Cuenta (Padre) y no en CuentaCorriente (Hija) y llamamos a la funcion prueba() como hicimos en el index, Ejecutaría la funcion del padre, ya que esta se hereda a la hija CuentaCorriente.  
    //Si en esta funcion solo se llama a lo hecho por Padre 'super.prueba();', simplemente hace la funcion Padre. En cambio si llamamos esta funcion llamando al mismo tiempo a la funcion padre y agregandole el console.log del hijo, es como si estuviesemos sobreescribiendo/modificando/agregandole a la funcion original.
    */


    //Asignarle la comision correspondiente a CuentaCorriente, heredando la funcion del Padre Cuenta.
    retirarDeCuenta(valor) {
        //valor = valor * 1.05; //Al valor ingresado por parametro, se le multiplica por 1.05.
        //Esta formula de aquí arriba la modificamos en cuenta. Y así poder hacer mas manual la eleccion de la comision en el parametro.

        super._retirarDeCuenta(valor, 5); //Luego de la multiplicacion, se ejecutará la funcion de Padre Cuenta con el resultado. 
    }                                   //Como modificamos la formula, podemos poner el porcenaje de comision manualmente en este parametro. En este caso es 5%.

}