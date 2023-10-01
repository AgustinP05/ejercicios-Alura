/*Creamos este archivo para que tenga las funciones generales, asi no tener que volverlas a escribir en cada archivo de CuentaCorriente o CuentaAhorro, etc.
El problema al llamar las funciones de este archivo Cuenta, es que nosotros no vamos a saber si es una cuenta corriente o de ahorro. Es mas, si queremos que tengan funciones diferentes respecto a la otra, sería un problema ya que se modificarían las dos sin querer.
Para evitar esto vamos a hacer Especializacion de las clases creando una variable para definir el tipo de cuenta. 
La primera opcion que utilizamos para esto, es que si el parametro corresponde al string 'Corriente' o 'Ahorro', dará una comision, pero si un programador se equivoca en la ortografía, causaria bastante daño al trabajo.

La segunda alternativa sería usar las Herencias y la palabra reservada 'super'.
La herencia se refiere a que una class hija tome todas las funcionalidades de otra class padre. Esto sería el dicho "Extender la clase".
*/

export class Cuenta{
    #cliente; 
    #saldo;


    constructor(/*tipo,*/ cliente, numero, agencia, saldo){
        //this.tipo = tipo;

        if(this.constructor == Cuenta){ //Si nuestro constructor es igual a un objeto del tipo Cuenta, mostrará el error. Es decir, si un programador quiere crear una 'new Cuenta', se mostrará el error y parará la ejecucion del código.
            throw new Error("No se debe instanciar objetos de la clase Cuenta");
        }

        this.numero = numero; 
        this.agencia = agencia;
        this.#cliente = cliente;
        this.#saldo = saldo;
        
    }

    set cliente(valor) {
        if (valor instanceof Cliente)
            this.#cliente = valor;
    }

    get cliente() {
        return this.#cliente;
    }

    depositoEnCuenta(valor) {
        if (valor > 0)
            this.#saldo += valor;
        return this.#saldo;
    }

    //Metodo abstracto
    //Esta es una funcion abstracta de proteccion, para que no se pueda ejecutar la funcion con mismo nombre en otra cuenta.
    retirarDeCuenta(valor){
        //this._retirarDeCuenta(valor, 0); Como queremos que sea un metodo abstracto, es decir que no ejecute la funcion, con el objetivo de que no haya errores entre las comisiones de los distintos tipos de cuentas. Lo haremos abstracto y que de el mensaje de error para informar al programador.   
        throw new Error("Debe implementar el método retirarDeCuenta en su clase.");
    }//Este metodo es abstracto. Cuando se llama a la funcion retirarDeCuenta de la clase padre y no de alguna hija, nos da el error. Ya que no queremos que se utilice la funcion original. Cada hija debe tener su respectiva comision de la funcion heredada por el padre. Solo con las hijas va a funcionar la retirarDeCuenta.
    //////////////////


    //Esta funcion es la que en verdad se ejecutará en las otros tipos de cuenta. Es decir, 'CuentaCorriente', 'CuentaAhorro', 'CuentaNomina', etc. llamaran a esta funcion '_retirarDeCuenta'. Mientras que la original funcion 'retirarDeCuenta' proveniente de base, solo dará el error. Es como una trampa para que no se ejecute la formula de retirar.
    _retirarDeCuenta(valor, comision) {
        // if(this.tipo == 'Corriente')   //Aquí estamos identifcando el tipo a traves de una cadena de caracteres. Como desventaja tiene que es muy facil que sucedan errores en su desarrollo si se comete alguna falta de ortografía
        //     valor = valor * 1.05;   //Se retira con comision por ser cuenta corriente
        // else if(this.tipo == "Ahorro")  //Si en el desarrollo un programador se equivoca y comete una falta de ortografia en el string, causará un gravisimo error, para eso hay otras alternativas con respecto a la Herencia y la palabra reservada super.
        //     valor = valor * 2.00;     
        //Mejor haremos lo siguiente, agregamos el parametro comision y abajo su formula, para que podamos elegir la comision al llamar la funcion.
        valor = valor * (1+comision/100);
        if (valor <= this.#saldo)
            this.#saldo -= valor;
        return this.#saldo;
    }

    verSaldo() {
        return this.#saldo;
    }

    transferirParaCuenta(valor,cuentaDestino) {
        this.retirarDeCuenta(valor);
        cuentaDestino.depositoEnCuenta(valor);
        valor = 200;
        valor = valor*1000;
    }


    prueba(){   //Funcion de class padre
        console.log('Método padre');
    }

}