
public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(10,1);
		//System.out.println(cuenta1.getAgencia());
		Cuenta cuenta2 = new Cuenta(11,2);
		
		System.out.println(Cuenta.getTotalCuentas());
		
	}
}
