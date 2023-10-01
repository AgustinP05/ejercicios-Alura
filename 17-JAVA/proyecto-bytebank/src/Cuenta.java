
public class Cuenta {
 double saldo;
 int agencia;
 int numero;
 //Cliente titular; //Esta propiedad queremos que sea del tipo 'Cliente', es decir, titular queremos que sea una variable que se conecte con las caracteristicas de la clase Cliente. Esta variable titular la vamos a usar exclusivamente para contener dentro al cliente que estará asociado a esta cuenta.
 Cliente titular = new Cliente(); //Cada vez que se crea una Cuenta, se crea un Cliente dentro de titular.
 
 
 
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
 
 
} 

