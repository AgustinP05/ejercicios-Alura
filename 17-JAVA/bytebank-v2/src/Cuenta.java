//public es un modificador de acceso. Y permite que lo que contiene pueda ser visto por todo el proyecto, pero puede pasar que no queremos que algunas variables sean públicas. Para esas usamos private.
public class Cuenta {
	private double saldo; //Encapsulamos saldo. Ya no vamos a poder acceder a 'saldo' de Cuenta en otras clases
	private int agencia;  //(2*)Lo hacemos privado para que no pueda ser modificado su valor de manera directa, para eso vamos a crear un setter
	private int numero;	  //(2*)Lo hacemos privado para que no pueda ser modificado su valor de manera directa, para eso vamos a crear un setter
	 //Cliente titular; //Esta propiedad queremos que sea del tipo 'Cliente', es decir, titular queremos que sea una variable que se conecte con las caracteristicas de la clase Cliente. Esta variable titular la vamos a usar exclusivamente para contener dentro al cliente que estará asociado a esta cuenta.
	private Cliente titular = new Cliente(); //Cada vez que se crea una Cuenta, se crea un Cliente dentro de titular.
	
	private static int totalCuentas = 0; //Variable de la clase
	
	//Constructor. Si queremos, podemos obligar a que se den parametros para crear la nueva instancia
	//Por lo tanto, si la empresa para la que estamos haciendo el codigo, nos dice que solo se permitirá asignar el numero de agencia al momento de crear una nueva Cuenta.
	//En ese caso, solo dejaríamos el el contructor y quitariamos el setter para imposibilitar modificaciones.
	public Cuenta(int agencia, int numero) {
		if(agencia <=0 || numero <= 0) {
			System.out.println("No se permite 0 o menor.");	
		}else {
			this.agencia = agencia;
			this.numero = numero;
		}
		totalCuentas++; //Que se sume 1 en la variable de la clase
		System.out.println("Cuentas totales aquí: "+totalCuentas);
		
	}
	
	//Habiamos declarado que totalCuentas es privado para que nadie lo pueda modificar de manera directa.
	//Hacemos un getter para obtener/ver la cantidad total de cuentas en el momento que queramos
	public static int getTotalCuentas() {//Recordar que a este metodo le ponemos static para que sea una funcion de la Class y no de las instancias.
		return Cuenta.totalCuentas;
	}
	 
	

	//ACLARACION Si tiene void, no retorna nada
	 public void depositar(double valor){ //Recordar definir el tipo de variable en el parametro
		//Para sumar en el saldo de la cuenta que se especifica
		 this.saldo = this.saldo + valor; //Aumentamos el saldo actual 
	 }
	 
	 //Retorna valor tipo booleano
	 //Por que nos importa que estas funciones puedan retornar true o false? 
	 //Porque tal vez despues queremos determinar: Si el retiro funciona bien, será true y podemos hacer que retorne un mesaje. Y si es false otra cosa.
	 public boolean retirar(double valor) {
		 if(this.saldo >= valor){
			 this.saldo -= valor;
			 return true;//Como esta funcion es booleana, tenemos que aclarar que va a retornar true o false
		 } return false; //Sino retorna falso
	 }
	 
	 //Hacemos lo mismo acá
	 public boolean transferir(double valor,Cuenta cuentaDestino) {
		 if(this.saldo >= valor) {
			this.saldo -= valor;		  //Quitamos de la primera cuenta
			cuentaDestino.depositar(valor);//Agregamos a la segunda cuenta
			return true;
		 }return false;//Sino retorna falso
	 }
	 
	//Para obtener un valor, por costumbre en JAVA se le suele poner get al principio del nombre
	 public double getSaldo() {
		 return saldo;
	 }
	 //saldo no tiene setter ya que queremos que el saldo solo sea manipulado por los metodos depositar y retirar
	 
	 
	 
	 /*Lo comento porque en el ejercicio, nos dicen que solamente se puede asignar el valor cuando se crea una nueva cuenta. Y que no se va a poder modificar despues. Por lo tanto, no hace falta un setter
	//2* Vamos a hacer un setter (modificador) para agencia para poder asignarle un numero de agencia, y como la propiedad es privada, no podrá ser modificada de manera directa por otro
	 public void setAgencia(int numAgencia) {//Es void para que no retorne nada, ya que solo queremos asignar un valor y nadamas.
		 if(numAgencia > 0) {
			 this.agencia = numAgencia; 
		 }else {
			 System.out.println("No puede ser negativo");
		 }
	 
	 }
	 //Esto fue para asignarle, pero si luego quiero obtener/ver el numero de agencia de alguna cuenta
	 */
	 //Voy a hacer un getter de eso
	 public int getAgencia() { //Este no tiene void porque SI queremos que nos retorne un valor
		return agencia;
	}
	 
	 
	//2* Lo mismo con numero
	 public void setNumero(int num) {
		 if(num > 0) {
			 this.numero = num; 
		 }else {
			 System.out.println("No puede ser negativo");
		 }
	 }
	 //getter para verlo
	 public int getNumero() {//Este no tiene void porque SI queremos que nos retorne un valor
		return numero;
	}
	 
	 public Cliente getTitular() {
			return titular;
		}

	public void setTitular(Cliente titular) {
			this.titular = titular;
		}


}
