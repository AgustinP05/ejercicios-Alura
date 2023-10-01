export class cliente{//nombre del molde
    nombreCliente;//propiedades generales del molde
    dniCliente;
    rutCliente;

    constructor(valor1, valor2, valor3){
        this.nombreCliente=valor1;
        this.dniCliente=valor2;
        this.rutCliente=valor3;
    }
    //Ahora cuando creamos un nuevo cliente, JS espera que pongas el valor de los parametros, como por ejemplo
    // const cliente4= new cliente("Agus", "44168419", "12345");
    //Como se ve, creamos un nuevo cliente con los parametros, es otra forma de darle valores al crear una clase nueva. Ahora con esto, si creamos una nueva clase sin poner parametros estarán en undefined. 
}