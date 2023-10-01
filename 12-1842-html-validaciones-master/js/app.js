import { valida } from "./validaciones.js"; //Se importa la function valida del validaciones.js

const inputs = document.querySelectorAll("input");//Se seleccionan todos los input y los guarda en un array

inputs.forEach((input) => { /*Del array inputs, va a pasar por cada input ejecutando lo que hay dentro del forEach */
  input.addEventListener("blur", (input) => { /*Para el input actual, se escuchará el evento blur (es decir qe el evento se ejecutará cuando salgamos del focus del input). Cuando se haga el blur, se ejecutará la function anonima con el parametro input(el input actual del forEach) que ejecutará la function valida con el parametro input seleccionado  */
    valida(input.target);
  });
});
