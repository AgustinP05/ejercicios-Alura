export function valida(input) {/*Esta funcion va a tener como parametro el input */
  const tipoDeInput = input.dataset.tipo;/*tipoDeInput va a ser igual al valor del data-tipo de los input que tengan su data-tipo.*/
  if (validadores[tipoDeInput]) {/*if de la lista de objetos existe el valor del data-tipo seleccionado, será true y entra */
    validadores[tipoDeInput](input);/*Si el if es true, entra al objeto nacimiento y ejecuta la funcion validarNacimiento */
  }

  if (input.validity.valid) { /*Si la informacion puesta en el input es válida, true y entra. validity es un objeto donde dentro tiene todas las propiedades de verificacion de los input. El valid es true cuando se cumplen todos los requisitos del input.*/
    input.parentElement.classList.remove("input-container--invalid");//Si la informacion puesta en el input es valida, eliminar del div contenedor esta clase que muestra en borde en rojo.
    input.parentElement.querySelector(".input-message-error").innerHTML = "";//Si la informacion puesta en el input es valida, no aparece el mensaje de error
  } else {
    input.parentElement.classList.add("input-container--invalid");//Si el contenido esta mal, se agregará esta clase.
    input.parentElement.querySelector(".input-message-error").innerHTML =
      mostrarMensajeDeError(tipoDeInput, input);//Si el contenido esta mal, se mostrará el mensaje correspondiente al input.
  }
}

const tipoDeErrores = [
  "valueMissing",
  "typeMismatch",
  "patternMismatch",
  "customError",
];

const mensajesDeError = {//Lista de objetos para los mensajes de error de cada campo.
  nombre: { //Mensaje de error para data-tipo="nombre"
    valueMissing: "El campo nombre no puede estar vacío", //Cuando el campo lo dejamos vacio
  },
  email: {
    valueMissing: "El campo correo no puede estar vacío",
    typeMismatch: "El correo no es válido",//Cuando lo puesto no corresponde a los requisitos para correo electronico
  },
  password: {
    valueMissing: "El campo contraseña no puede estar vacío",
    patternMismatch:
      "Al menos 6 caracteres, máximo 12, debe contener una letra minúscula, una letra mayúscula, un número y no puede contener caracteres especiales.",
  },
  nacimiento: {
    valueMissing: "Este campo no puede estar vacío",
    customError: "Debes tener al menos 18 años de edad",
  },
  numero: {
    valueMissing: "Este campo no puede estar vacío",
    patternMismatch: "El formato requerido es XXXXXXXXXX 10 números",
  },
  direccion: {
    valueMissing: "Este campo no puede estar vacío",
    patternMismatch: "La dirección debe contener entre 10 a 40 caracteres.",
  },
  ciudad: {
    valueMissing: "Este campo no puede estar vacío",
    patternMismatch: "La ciudad debe contener entre 10 a 40 caracteres.",
  },
  estado: {
    valueMissing: "Este campo no puede estar vacío",
    patternMismatch: "El estado debe contener entre 10 a 40 caracteres.",
  },
};

const validadores = {/*Objeto para que coincidan el nombre del tipo con la llamada de su objeto. */
  nacimiento: (input) => validarNacimiento(input),
};/*El objeto nacimiento va a tener como propiedad una funcion que va a recibir un input que va a invocar la funcion validarNacimiento con el mismo input como parametro. */

function mostrarMensajeDeError(tipoDeInput, input) {//Esta function recibe el etipo de input y el valor dentro de ese input.
  let mensaje = "";
  tipoDeErrores.forEach((error) => {//Por cada objeto de tipoDeErrores, sera 'error'
    if (input.validity[error]) {//verifica si el error es true
      console.log(tipoDeInput, error);
      console.log(input.validity[error]);
      console.log(mensajesDeError[tipoDeInput][error]);//Queremos que muestre lo que hay dentro de la lista de objetos--> el tipo de error-->mensaje
      mensaje = mensajesDeError[tipoDeInput][error];//mensaje va a ser igual al string que haya quedado, y eso se mostrará en la pagina cuando haya algo que falte. 
    }
  });
  return mensaje;
}

function validarNacimiento(input) {
  const fechaCliente = new Date(input.value);/*fechaCliente es igual a la fecha que puso el usuario */
  let mensaje = "";
  if (!mayorDeEdad(fechaCliente)) {/*Un if preguntando un not de una llamada a la funcion mayorDeEdad co el parametro fechaCliente */
    mensaje = "Debes tener al menos 18 años de edad"; /*Si la funcion retorna false (es menor de edad), se mostrará este mensaje */
  }

  input.setCustomValidity(mensaje);/*Dependiendo si fue true o false, se mostrará el mensaje correspondiente en el cuadro del input. setCustomValidity() define el mensaje de validacion personalizado para el elemento seleccionado (input en este caso) con el mensaje especifico. El estring vacio representa que el elemento no tiene error de validacion customizada.*/
}

function mayorDeEdad(fecha) {/*fecha es un parametro con fin descriptivo, arriba cuando se llama a la funcion, da como parametro fechaCliente */
  const fechaActual = new Date();/*Fecha actual. Con no poner nada en la funcion, toma la fecha acual automaticamente.*/
  const diferenciaFechas = new Date(  /*diferenciaFechas es igual a la fecha que entra por el parámetro (fecha dada por el usuario, en este caso fechaCliente). Pero al año de la fecha ingresada, se le sumara 18 años */
    fecha.getUTCFullYear() + 18,
    fecha.getUTCMonth(),
    fecha.getUTCDate() /*Estas son funciones para que dentro del calendario de la nueva Date creada, tenga el dia, mes o año dado por el usuario.*/
  );
  return diferenciaFechas <= fechaActual;/*Si la fecha del usuario + 18 años es menor a la fecha actual, retornará true. entonces, true= mayor de 18; false= menor de edad*/
}
