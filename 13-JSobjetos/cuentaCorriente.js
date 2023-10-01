import { cliente } from "./cliente.js";

export class cuentaCorriente{
    #cliente;
    #saldoCuenta; //Si a una propiedad le ponemos el #, será privado. Es decir que no podemos mostrarlo. tengo que ponerlo en todos los saldosCuenta dentro del molde. Afuera no.
    numeroCuenta;
    agencia;
    static cantidadCuentas = 0; //Con el static, es comun para todas las cuentaCorriente.

    set cliente(valor){ //dar cliente 
        if( valor instanceof cliente) //Protejo el atributo class cliente. Esta condicion pregunta si el nuevo valor ingresado contiene alguna propiedad de esa class
        this.#cliente = valor;
    };

    get cliente(){     //Traer cliente
        return this.#cliente;
    };


    //CONSTRUCTOR CON VALORES INICIALES
    // constructor(){//Este es un constructor y se ejecuta al crear un nuevo objeto. Y en este caso nos sirve para dar valores base.
    //     this.#cliente = null;
    //     this.#saldoCuenta = 0;//Para que por defecto, cada vez que creamos un nuevo cliente, este tenga el saldo 0.
    //     this.numeroCuenta="";
    //     this.agencia="";
    // }


    //CONSTRUCTOR CON PARAMETROS
    constructor(valor1, valor2, valor3){
        
        this.cliente=valor1;//Nos remerimos al setter cliente
        
        this.#saldoCuenta = 0;//Que por defecto sea 0
        this.numeroCuenta= valor2;
        this.agencia=valor3;

        cuentaCorriente.cantidadCuentas++; //cantidadCuentas del molde cuentaCorriente se le sumara 1 por cada instancia creada.
    }

    depositoEnCuenta(valor){//creamos un metodo/funcion. Estas las tenemos que invocar despues
        if(valor > 0)       //Para que no podamos sumar numeros negativos. Sino no hace nada
            this.#saldoCuenta += valor;
        return this.#saldoCuenta;
    }

    retiroDeCuenta(valor){
        if(valor <= this.#saldoCuenta)   //Si la cantidad que se quiere retirar es menor a la cantidad de saldo, hará la resta. Sino, no restará nada. Ya que no queremos que el cliente quede con saldo negativo.
            this.#saldoCuenta -= valor;
        return this.#saldoCuenta;
    }

    verSaldo(){
        return this.#saldoCuenta;
    }

    transferirParaCuenta(valor, cuentaDestino){
        this.retiroDeCuenta(valor);
        cuentaDestino.depositoEnCuenta(valor);
    }
}