//Lo mismo que hicimos con las cuentas, vamos a hacer con los empleados. Esta será la clase abstracta base, que se extenderá a lo largo de sus hijas.

export class Empleado{
    #nombre;
    #dni;
    #salario;
    #clave; //hacemos polimorfismo con Empleado. El atributo #clave es la interfaz, y SistemaAutenticacion accede a el.

    constructor(nombre, dni, salario){
        this.#nombre=nombre;
        this.#dni=dni;
        this.#salario=salario;
        this.#clave=''; //Por defecto no tiene clave. Se creará con una funcion
    }

    //hacemos polimorfismo con Empleado
    asignarClave(clave){
        return this.#clave = clave;
    }


    // //hacemos polimorfismo con Empleado
    // get clave(){ //Con este getter podemos obtener/acceder la clave (que es una propiedad privada) y utilizarla
    //     return this.#clave;
    // }

    //En lugar del getter, vamos a crear una funcion nueva
    //hacemos polimorfismo con Empleado
    autenticable(clave){ //Con esta funcion no accedemos al atributo '#clave' directamente como un getter, sino que lo estamos encapsulando en un método.
        return clave == this.#clave;
    }//Ahora esta funcion es la interfaz en lugar de la variable 

    //Funcion abstracta. Si se intenta llamar a esta funcion, nos dará el siguiente error.
    verBonificacion(){
        return this.#salario; //Basicamente, que no haga ninguna cuenta. Solo nos devuelve el salario.
    }

    //Funcion privada. Funcion base de la abstracta. Es la funcion que se exportará a las hijas. La privamos con guion bajo para que no se llame esta clase. 
    _verBonificacion(bono){ //Funcion para dar bonificacion dependiendo del tipo de empleado (gerente, director, etc.).
        return this.#salario + this.#salario*bono/100;
    }
}