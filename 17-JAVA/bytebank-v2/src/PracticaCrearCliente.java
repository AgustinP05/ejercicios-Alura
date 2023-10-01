
public class PracticaCrearCliente {
	public static void main(String[] args) {
		//Creamos un cliente y asignamos propiedades
		Cliente cliente1 = new Cliente();
		//cliente1.nombre = "Agustin"; //(3*)Tambien queremos que sean privados
		//cliente1.documento = "43212342";//(3*)
		//cliente1.telefono = "11542341324";//(3*)
		//Lo cambiamos por setters y getters
		cliente1.setNombre("Agustin");
		System.out.println(cliente1.getNombre()); 
		cliente1.setDocumento("43212342");
		System.out.println(cliente1.getDocumento()); 
		cliente1.setTelefono("11542341324");
		System.out.println(cliente1.getTelefono()); 
		/////
		
		System.out.println("");
		
		//Creamos cuenta y tambien le asignamos propiedades
		Cuenta cuenta1 = new Cuenta();
		//cuenta1.saldo = 100; (1*) Encapsulamos saldo
		//cuenta1.agencia = 321; (2*)
		//cuenta1.numero = 1;	(2*)	
		
		//cuenta1.titular = cliente1; //Aquí conectamos la cuenta1 a cliente 1 gracias a titular
		//con titular ya podemos ingresar a las caracteristicas de la clase Cliente en cliente1.
		//System.out.println(cuenta1.titular.nombre+ "- Es igual a - "+cliente1.nombre);//Ahi se ve como accedimos a propiedades de cliente 1 desde cuenta1
		//Si nosotros queremos que cada vez que se haga una nueva instancia de cuenta, que tambien se cree automaticamente un nuevo cliente dentro de 'titular'
		//Podriamos asignarlo en las mismas variables de la clase en el archivo Cuenta.
		
		
		///////////
		//Como vemos en el 1*, lo comentamos porque da error, ya que le asignamos private a saldo de Cuenta.
		//Entonces si queremos asignarle dinero, tendriamos que estar obligados a utilizar las funciones que creamos con tal objetivo.
		//Porque nosotros no queremos que alguien sobreescriba el valor de saldo, solo queremos que deposite o retire. Entonces:
		cuenta1.depositar(100);//Ahora si depositamos el dinero
		System.out.println(cuenta1.getSaldo());//Para ver el saldo
	
		//2*
		cuenta1.setAgencia(321);//Para asignar
		System.out.println(cuenta1.getAgencia()); //Para obtener/ver
		
		cuenta1.setNumero(1);//Para asignar
		System.out.println(cuenta1.getNumero());//Para obtener/ver
		//////
		//Le asignamos el titular a la cuenta con setter y lo vemos con getter
		
		cuenta1.setTitular(cliente1);
		System.out.println(cuenta1.getTitular()+" - "+cliente1);//Vemos que hace referencia al hash del cliente1
		System.out.println(cuenta1.getTitular().getNombre()); //Para acceder a las caracteristicas de la clase de cliente1 desde cuenta1. Se puede con 'cuenta1.getTitular(). ' y luego indicas a que queres acceder
		//Así accedimos al nombre del titular de cuenta1 con getter y setter para mas proteccion del codigo.
		
	}
}
