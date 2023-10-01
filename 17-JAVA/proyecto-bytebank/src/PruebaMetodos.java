//archivo para practicar funciones
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(); //El 'miCuenta' es el nombre de la variable y hace referencia a cualquier cuenta que vayamos a crear. Tiene ese nombre para que sea descriptivo. 
		
		miCuenta.saldo=300;//Para la cuenta creada, delcaramos que tenga 300 inicialmente.
		//Tambien podemos utilizar funciones que provienen del archivo del objeto Cuenta, ya que aquí estamos declarando variables haciendo referencia a ese objeto.
		miCuenta.depositar(200);//Puedo usar esta funcion ya que le pertenece a Cuenta.
		
		System.out.println(miCuenta.saldo);//Veo si se sumó el saldo
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);
	}
}
