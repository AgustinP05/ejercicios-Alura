export class Cliente
{
    nombreCliente;
    dniCliente;
    rutCliente;
    #clave;  //hacemos polimorfismo con Empleado. El atributo #clave es la interfaz, y SistemaAutenticacion accede a el.

    constructor(nombreCliente, dniCliente, rutCliente) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.rutCliente = rutCliente;
        this.#clave = ''; //hacemos polimorfismo con Empleado 
    }

    //hacemos polimorfismo con Empleado
    asignarClave(clave){ 
        return this.#clave = clave;
    }

    // //hacemos polimorfismo con Empleado
    // get clave(){ //Con este getter podemos obtener/acceder la clave (que es una propiedad privada) y utilizarla
    //     return this.#clave;
    // }

    //En lugar del getter, vamos a crear una funcion nueva para cumplir el contrato de la interfaz
    //hacemos polimorfismo con Empleado
    autenticable(clave){ //Con esta funcion no accedemos al atributo '#clave' directamente como un getter, sino que lo estamos encapsulando en un método.
        return true;
    }//Ahora esta funcion es la interfaz en lugar de la variable 
}
