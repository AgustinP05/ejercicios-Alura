/*Importación de clases*/
import {Cliente} from './Cliente.js'

import {CuentaCorriente} from './Cuentas/CuentaCorriente.js';
import {CuentaAhorro} from './Cuentas/CuentaAhorro.js';
import { CuentaNomina } from './Cuentas/CuentaNomina.js';
// import { Cuenta } from './Cuentas/Cuenta.js'; No hace falta porque es abstracta

import { Empleado } from './Empleados/Empleado.js';
import { Director } from './Empleados/Director.js';
import { Gerente } from './Empleados/Gerente.js';

import { SistemaAutenticacion } from './SistemaAutenticacion.js';

// const cliente = new Cliente('Leonardo','13804050','123224');
// const cliente2 = new Cliente('María','16979808','8989');

// const cuentaDeLeonardo = new CuentaCorriente(/*'Corriente',*/ cliente, '1', '001' /*,0*/); //El 0 de saldo lo inicialicé en el 'super' de CuentaCorriente. Por lo tanto no hace falta inicializarla cada vez que creo una nueva class CuentaCorriente. Se hace automaticamente desde allí. El tipo no se especifica, ya que se hace segun si se crea una nueva class CuentaCorriente.
// const cuentaDeMaria = new CuentaCorriente(/*'Corriente',*/ cliente2,'2','002' /*,0*/);

// const cuentaAhorroLeonardo = new CuentaAhorro(/*'Ahorro',*/ cliente, '8989', '001', 0); //En cuenta de ahorro si se inicializa el saldo. El tipo no se especifica, ya que se hace segun si se crea una nueva class CuentaAhorro


/*
console.log(cuentaDeLeonardo);
cuentaDeLeonardo.depositoEnCuenta(200);
cuentaDeLeonardo.retirarDeCuenta(30); //Se retira con comision por ser cuenta Corriente
console.log(cuentaDeLeonardo.verSaldo()); //Depositar y mostrar saldo de cuenta corriente de Leonardo

console.log("-------");


console.log(cuentaAhorroLeonardo);
cuentaAhorroLeonardo.depositoEnCuenta(327);
cuentaAhorroLeonardo.retirarDeCuenta(45); //Se retira otra comision ya que es cuenta de Ahorro
console.log(cuentaAhorroLeonardo.verSaldo());  

console.log("-------");

//Ejemplo de acceder y sobreescribir class padre
//cuentaDeLeonardo.prueba();  //Llamamos la funcion creada en padre y que podemos acceder desde la hija CuentaCorriente para modificar o combinar lo que hace la funcion de Padre.


//Asignamos las comisiones correspondientes y las llamamos
cuentaDeLeonardo.retirarDeCuenta(50); //Se ejecutará la funcion de padre heredada a su hija CuentaCorriente y modificada por ella, agregandole la multiplicacion de porcentaje a la funcion de su padre.
console.log("Cuenta Corriente: "+cuentaDeLeonardo.verSaldo());

cuentaAhorroLeonardo.retirarDeCuenta(50); //Se ejecutará la funcion de padre heredada a su hija CuentaAhorro y modificada por ella, agregandole la multiplicacion de porcentaje a la funcion de su padre.
console.log("Cuenta de Ahorro: "+cuentaAhorroLeonardo.verSaldo());
*/


//Propiedad constructor. Evitando la creacion de objetos de una clase.
/*
    const cuentaSimple = Cuenta(cliente, '098','001',100); 
    console.log(cuentaSimple); 
*/    
//Con lo hecho recientemente, accedimos a la clase base.
//Cualquier programador que quiera abrir una nueva cuenta y cambiar el valor de comision en el archivo de la class Cuenta. Y no queremos eso.
//Recordar que la clase Cuenta debe ser una clase abstracta, ya que no la queremos instanciar, es decir, en nuestro caso no queremos que un programador venga y haga una 'new Cuenta', sino que solo queremos que utilice a sus hijas 'CuentaCorriente' y 'CuentaAhorro'. Solo se debe extender a traves de sus hijas.
//Las clases que queramos que sean abstractas para "protegerlas" y mejorar la gestion de errores.
//Para cumplir nuestro objetivo de que se abstracta, vamos al archivo de la class Cuenta y le damos la condicion al constructor. Si se intenta crear una new Cuenta, lanzará el error. Si se dá el error, parará eñ código en el punto donde se encuentre.
//Con esto, hemos protegido nuestra clase base Cuenta.Ahora solo puede ser extendido. Este es el concepto de clases abstractas.

/*Nota: Un metodo abstracto basicamente son funciones que no devuelven nada. Es decir que solo tiene la definicion pero no la implementacion. Está hecho el esqueleto pero no hace nada.
Los metodos abstractos deben ser sobreescritos por las clases hijas. No se debetener metodos abstractos en una clase comun, solo en una abstracta. Ya que para eso son abtractas, para evitar que se puedan acceder a ellas.
Las clases abstractas son diseñadas de forma tal que solo sean extensibles o heredables por otras clases. Ellas nos ayudan a crear el aesqueleto de funcionamiento de las clases que comparten ese funcionamiento, de forma que el codigo sea reutilizable lo maximo posible.*/


//En este punto, creamos la nueva class CuentaNomina, donde vamos a convertir el metodo retirarDeCuenta en un metodo abstracto para que no modifique a las otras clases hijas.
// const cuentaNominaLeonardo = new CuentaNomina(cliente,'9854','001',100);

// cuentaNominaLeonardo.depositoEnCuenta(150);
// console.log(cuentaNominaLeonardo.verSaldo());

// cuentaNominaLeonardo.retirarDeCuenta(50);       //Al ser la class creada recientemente, no hemos puesto una funcion retirarDeCuenta en su interior con sus respectivas condiciones, por lo tanto llamará la funcion de la class base Cuenta, esa formula general no tene comision.
// console.log(cuentaNominaLeonardo.verSaldo());
//Luego de haber puesto la comision en su respectiva clase, no nos dará error, ya que ejecutará la funcion de la heredera y no la base de class Cuenta.


/***************************************** */
//Creamos la carpeta Empleados

    //const empleado = new Empleado('Agustin', '44168419', 10000);
    //empleado.asignarClave('12345'); //Asignamos una clave al empleado.
    //const gerente = new Gerente('Viviana', '152543426', 12000);
    //gerente.asignarClave('12345');
    //const director = new Director('Rolando', '143252334', 15000);
    //director.asignarClave('12345');
//Aqui no se usó polimofismo porque todavia estoy usando la funcion de Empleado en una clase que hereda.

//Le agregamos una bonificacion a cada tipo de empleado.
// console.log(empleado.verBonificacion());
// console.log(gerente.verBonificacion());
// console.log(director.verBonificacion());

/************************************************ */


//POLIMORFISMO
//gestion de metodos o atributos de diferentes formas.
//Es cuando tienes una funcion o atributo que se llama de igual forma en varias clases. Pero estas clases no estan relacionadas entre si en un esquema de herencia. Son clases que estan separadas y que se gestionan de manera individual. Y cada una tendran uno de estos metodos que nos permitirá ejecutar esa funcion de distintas formas.
// Nos da la posibilidad de llamar la misma funcion en objetos oclases sin alterar el resultado. Una funcion o variable puede ser polimorfica porque su comportamiento va a depender quien lo quiera llamar.

//Imaginemos que nos piden que hagamos una autenticacion de claves para los empleados.
    //console.log(SistemaAutenticacion.login(empleado, '12345')); //Con esto queremos autenticar si la contraseña del empleado es '12345'. Nos devolvera true o false.
//El 'SistemaAutenticacion.login()' es una funcion estatica de SistemaAutenticacion. Porque le vamos a tomar de la misma clase y no de algun objeto de esta. 
//Vimos que la funcion proveniente del padre Empleado a sus hijas, todavia no es polimorfismo porque es un esquema de herencias, pero podriamos hacer polimorfismo con Cliente ya que no es una hija de Empleado.
//Esto lo hacemos yendo a la class Cliente y agregandole la propiedad 'clave' igual que como hicimos en Empleado. Luego en lugar de usar la propiedad 'clave' como dije anerioremente, la encapsulamos en una funcion, hicimos polimorfismo con Cliente y Empleado y luego la metimos dentro de la funcion SistemaAutenticacion.login() para que nos devuelva true o flase.
    //const cliente = new Cliente('Leonardo','13804050','123224');
    //cliente.asignarClave('23232');
    //console.log(SistemaAutenticacion.login(cliente, '23232'));
//Hicimos polimorfismo ya que utilizamos las mismas funciones (copiando y pegando) en distintas clases no heredadas.
/************************************************ */

//Si necesito compartir atributos o metodos con implementacion en las diferetnes clases hijas, necesitaría una clase abstracta, sino utilizaría una interface y con mas razon las utilizaria cuando las clases ya tienen un padre.
//INTERFACES: 
//En si las interfaces son los atributos o metodos que pueden ser invocadas desde fuera de los objetos.
//Este atributo 'clave' o funcion autenticable(clave) que existe tanto en Empleado como en Cliente, es nuestra interfaz comun para pode acceder a nuestra funcion de autenticacion. Entonces en nuestro caso 'interfaz' es la funcion autenticable. Y tanto Cliente como Empleado tienen esa interfaz que se verifica aquí.
//Cabe mencionar que en la mayoria de lenguajes las interfaces vienen definidas de tal manera que se especifíca que clases la van a implementar y asi es más claro comprender el concepto... En js es más complejo de comprender pero no es mas que usar en mismo metodo en clases distintas que no son heredadas de una clase superior o padre y que pueden actuar de forma totalmente diferente cada uno a pesar de llamarse igual

/* La interfaz, como concepto general, establece un contrato de "qué comportamiento se debe tener" . Las clases que implementen una interfaz, deben cumplir con dicho contrato. Por otra parte, el contrato puede ser lógico o abstracto, en el sentido que el lenguaje no valida que la interfaz se cumpla, sino que es tarea del programador cumplir el contrato.
Es importante hacer esta distinción, debido a que javascript no está orientado en clases, sino en prototipos, así que el lenguaje no tiene recursos para representar y validar una "interfaz", en su lugar el programador debe encargarse, ya sea textualmente, a través de la documentación, o bien codificar dichas validaciones, sea cual sea la opción, el concepto de "interfaz" existe, mas no es un recurso del lenguaje.
The javascript way: En javascript puedes obligar a las clases a cumplir una interfaz, actualmente existen dos formas muy conocidas, y no son excluyentes, a veces te servirá más una, que otra: Ducktyping y Prototipado.

*/


const empleadoEjemplo = new Empleado('Rolando', '4123454', 15000);
empleadoEjemplo.asignarClave('54321');
console.log(SistemaAutenticacion.login(empleadoEjemplo,'54321')); //Si la contraseña que ingresamos aquí es igual a la contraseña registrada en asignarClave, retornará true sino false.

const clienteEjemplo = new Cliente('Rolando', '4123454', 15000);
clienteEjemplo.asignarClave('62321');
console.log(SistemaAutenticacion.login(clienteEjemplo,'62321')); //Si la contraseña que ingresamos aquí es igual a la contraseña registrada en asignarClave, retornará true sino false.
//Para todos los clientes he puesto a proposito que la autenticacion retorne false. Lo hice para ejercitar el concepto de polimorfismo, porque aunque les he dado una interfaz definida con polimorfismo a Cliente y a Empleado, hice que Cliente se comporte diferente. Es una ventaja del polimorfisno.

const directorEjemplo = new Director('Rolando', '143252334', 15000);
directorEjemplo.asignarClave('12345');
    //console.log(SistemaAutenticacion.login(directorEjemplo,'12345'));
//Aca con el director podemos ver que es autenticable gracias a que Empleado se lo heredera.
/********************************************* */

//DUCK TYPING
//Es un concepto que se refiere a que si camina como pato, vuela como pato y graznas como pato, es un pato. No importa de que no se tenga la certeza de que sea un pato, lo importante son sus acciones.
// Como es JS un lenguaje de tipado débil, es decir, no estamos obligados a colocar el tipo de dato o tipo de funcion en el codigo. La validacion se basa en que a traves de los metodos que tiene esa clase, nosotros aplicamos ese tipado de pato.
//En el caso de nuestro codigo, lo aplicamos con los usuarios autenticables en SistemaAutenticacion. Si el objeto tiene una funcion autenticable adentro (si se comporta como pato), es un usuario autenticable (es un pato).

