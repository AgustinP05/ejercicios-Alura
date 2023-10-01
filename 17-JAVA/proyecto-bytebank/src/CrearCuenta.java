
public class CrearCuenta {
	public static void main(String[] args) {/*Al escribir main ya me aparece esta linea*/
	//  Variable  Referencia -> Lugar en memoria	
		Cuenta primeraCuenta = new Cuenta();//La variable 'primeraCuenta' de tipo 'Cuenta', va a representar una nueva Cuenta. 
		primeraCuenta.saldo=1000;//Asignamos saldo
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();//Creamos una segunda cuenta
		segundaCuenta.saldo=500;
		
		System.out.println(primeraCuenta);//Mostrará en pantalla Cuenta@76ed5528 -> tipoObjeto@ubicacionEnMemoria. 
		System.out.println(segundaCuenta);//Mostrará en pantalla Cuenta@2fc14f68
	
		Cuenta terceraCuenta = new Cuenta();
		System.out.println(terceraCuenta.saldo);//Empieza con saldo 0
		
		segundaCuenta.transferir(300, terceraCuenta);
		
		System.out.println(segundaCuenta.saldo);
		System.out.println(terceraCuenta.saldo);
		
	}
}
