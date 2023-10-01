// //Definicion de clases

// class cliente{//nombre del molde
//     nombreCliente;//propiedades generales del molde
//     dniCliente;
//     rutCliente;
// } La pasamos al archivo cliente.js

// class cuentaCorriente{
//     numeroCuenta;
//     #saldoCuenta; //Si a una propiedad le ponemos el #, será privado. Es decir que no podemos mostrarlo. tengo que ponerlo en todos los saldosCuenta dentro del molde. Afuera no.
//     agencia;

//     constructor(){//Este es un constructor y se ejecuta al crear un nuevo objeto. Y en este caso nos sirve para dar valores base.
//         this.#saldoCuenta = 0;//Para que por defecto, cada vez que creamos un nuevo cliente, este tenga el saldo 0.
//         this.numeroCuenta="";
//         this.agencia="";
//     }

//     depositoEnCuenta(valor){//creamos un metodo/funcion. Estas las tenemos que invocar despues
//         if(valor > 0)       //Para que no podamos sumar numeros negativos. Sino no hace nada
//             this.#saldoCuenta += valor;
//         return this.#saldoCuenta;
//     }

//     retiroDeCuenta(valor){
//         if(valor <= this.#saldoCuenta)   //Si la cantidad que se quiere retirar es menor a la cantidad de saldo, hará la resta. Sino, no restará nada. Ya que no queremos que el cliente quede con saldo negativo.
//             this.#saldoCuenta -= valor;
//         return this.#saldoCuenta;
//     }

//     verSaldo(){
//         return this.#saldoCuenta;
//     }
// }
//Recordar que saldoCuenta no se va a mostrar ya que esta en privado por la '#'. Recordar que solo esto es para la visualizacion de node, actualmente JS no tiene ningun atributo o metodo realmente privado. 
//Lo mandamos al archivo cuentacorriente.js
//Lo importamos de la siguiente manera:
//      nombre class        localizacion archivo
import {cliente} from './cliente.js'
import {cuentaCorriente} from './cuentaCorriente.js'

const clienteNuevo = new cliente();
clienteNuevo.nombreCliente="Leonardo";
clienteNuevo.dniCliente="12804050";
clienteNuevo.rutCliente="123224";



const cliente1= new cliente();//Creamos un objeto para el molde cliente y le pusimos nombre
cliente1.nombreCliente="Agustin";//Elegimos el cliente y la propiedad a la que queremos dar valor. Y le damos el valor con el signo igual.
cliente1.dniCliente= "12345678";

const cuentaCorriente1= new cuentaCorriente();
cuentaCorriente1.numeroCuenta= "123456789";
// cuentaCorriente1.saldoCuenta= 0;
cuentaCorriente1.cliente=clienteNuevo;  //Ahora con 'cliente' estamos llamando al setter
// console.log(cuentaCorriente1);

let saldoCuenta = cuentaCorriente1.verSaldo();   //Es let porque va a variar a lo largo del tiempo en esta scope.
// console.log("Nuestro saldo es "+saldoCuenta);

saldoCuenta= cuentaCorriente1.depositoEnCuenta(27500);//Aquí elegimos la cuenta corriente 1 y luego que se ejecute la funcion con el valor de parametro asignado. 
// console.log("Nuestro saldo es "+saldoCuenta);

// saldoCuenta= cuentaCorriente1.retiroDeCuenta(3000);
// console.log("Nuestro saldo es "+saldoCuenta);
//Cada vez se ejecuta verSaldo, que lo que hace es darnos el valor del saldo por mas que sea privado. Y lo mostramos en pantalla con un console.log.

// console.log(cliente1);
// console.log(cuentaCorriente1);


const cliente2= new cliente();//Creamos un objeto para el molde cliente y le pusimos nombre
cliente2.nombreCliente="Viviana";//Elegimos el cliente y la propiedad a la que queremos dar valor. Y le damos el valor con el signo igual.
cliente2.dniCliente= "3458249";
cliente2.rutCliente="937417";

const cuentaCorriente2= new cuentaCorriente();
cuentaCorriente2.cliente= clienteNuevo; //Ahora con 'cliente' estamos llamando al setter
// cuentaCorriente2.#saldoCuenta; Por defecto es 0 gracias al constructor     
cuentaCorriente2.numeroCuenta="2";
cuentaCorriente2.agencia="002";

cuentaCorriente1.transferirParaCuenta(150, cuentaCorriente2);//Transferimos 150 desde la cuenta de Agustin hacia la cuenta de Viviana.

const saldoVivi= cuentaCorriente2.verSaldo();
// console.log("El saldo actual de Viviana es: "+saldoVivi);

// console.log(cuentaCorriente2.cliente); //Ahora con 'cliente' estamos llamando al getter y poder mostrarlo


//Ejemplo constructor con parametros
const cliente4= new cliente("Agus", "44168419", "12345");
// console.log(cliente4);
const cuentaCorriente4= new cuentaCorriente(cliente4,"14325","Agencia BN");
console.log(cuentaCorriente4.cliente); //Ahora con escritura resumida, pudimos meter al cliente4 dentro de cuentacorriente4 y llamar al cliente.
//Podriamos resumir el codigo de cada cliente con lo hecho recien.

console.log("Cantidad de cuentas creadas: "+cuentaCorriente.cantidadCuentas);//Se mostrará el valor de cantidadCuentas del molde cuentaCorriente.

