import { Empleado } from "./Empleado.js";


export class Gerente extends Empleado{
    constructor(nombre, dni, salario){
        super(nombre, dni, salario);
    }

    verBonificacion(){//Funcion 
       const bono = 5;
       return super._verBonificacion(bono);// llama/hereda funcion del padre
    }
}