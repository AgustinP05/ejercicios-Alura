
export class SistemaAutenticacion{ //interfaz de las clases

    // funcion para logear al usuario y ver si se ingresa la contraseña correcta 
    static login(usuario, clave){ //Queremos que sea una funcion estatica ya que se le va a preguntar a la clase y no a algun objeto de esta.
        //return usuario.clave == clave; //(Interfaz con parametro) retornará true o false
        //Cambiamos la interfaz de ser un atributo como arriba, a ser una funcion como abajo (autenticable(clave)). Es mas seguro usar funciones que atributos, ya que con los atributos hay que tener mas cuidado.
        
        // Con esta funcion  siempre estamos asumiendo que lo que pongamos en el parametro 'usuario' es un objeto autenticable (como Cliente o Empleado, etc.), y ahí se esta cometiendo un error. Nosotros deberiamos validar si lo que esta dentro de usuario es algo a lo que esta permitido hacer autenticacion.
        //Queremos verificar que si dentro del usuario puesto existe nuestra interfaz que tiene el nombre 'autenticable'. Si existe una propiedad 'autenticable' o function autenticable(), entrará al if y hará la funcion que queremos.
        // Para eso vamos a hacer lo siguiente:
        if("autenticable" in usuario && usuario.autenticable instanceof Function){
         //"autenticable" está dentro de usuario Y 'autenticable' de 'usuario' es una Funcion? Si es si, entra.    El operador in devuelve true si la propiedad especificada está en el objeto especificado o su prototipo.El operador instanceof verifica si un objeto en su cadena de prototipos contiene la propiedad prototype de una Function en este caso.
            return usuario.autenticable(clave); //(Interfaz con funcion) retornará true o false segun lo que la funcion determine
        }else{
            return false;
        }
    }//Este atributo 'clave' o funcion autenticable(clave) que existe tanto en Empleado como en Cliente, es nuestra interfaz comun para pode acceder a nuestra funcion de autenticacion. Entonces 'interfaz' es la funcion autenticable. Y tanto Cliente como Empleado tienen esa interfaz que se verifica aquí.
    //Se va a poder utilizar para clases distintas aunque no se hereden mientras estas tengan la propiedad clave y las funciones correspondientes con polimorfismo.
}