package ar.com.bytebank.modelo;


//Quiero que Administrador, Gerente y Contador hereden funciones de Funcionario.

//Al mismo tiempo quiero que Administrador y Gerente hereden las funciones de Autenticable.
//NO quiero que Contador herede Autenticable.
//Estas dos condiciones las cumplo al hacer que Autenticable sea hijo de Funcionario y así adquirir las funciones de este.
//Luego que Autenticable sea padre de Administrador y Gerente. Así estas dos puedan tener las funciones de Funcionario y Autenticable. Mientras que Contador solo tiene las funciones de Funcionario.


//VAMOS A HACER INTERFACE
//Vamos a hacer que Autenticable sea una interface y ademas abstracta. Si es abstracta, no necesita dar implementacion de los metodos abstractos de su padre.
//Usando interfaces tenemos otra forma de lograr polimorfismo sin herencia.
//Es un contrato donde el que firma es responsable de implementar estos métodos (cumplir el contrato)
// Solo existe una herencia simple en Java, pero podemos implementar tantas interfaces como queramos.
//Todos los métodos de una interfaz son abstractos, los de una clase abstracta pueden no serlo. Todos los métodos en la interfaz son siempre abstractos y siempre públicos. En una clase abstracta podemos tener métodos publicos/privados y abstractos.
//Toda interfaz es abstracta. Entonces si es interface, NO puede tener metodos implementados. Son TODOS abtractos
//Una interfaz no puede extender de una clase. Solo puede extender de otra interfaz. Tampoco puede tener metods privados ni constructor.
public /*abstract*/interface Autenticable {
	
//private String clave; //Una interfaz no puede tener atributos privados
	
	//Ahora estos metodos estan obligados a implementarse en las clases que implementan Autenticable.
	public /*abstract*/void setClave(String clave);

	public /*abstract*/boolean iniciarSesion(String clave);

	
}
