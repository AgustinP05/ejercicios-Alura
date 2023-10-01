
public class TestCuentaExcepChecked {
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta();
		try {
			cuenta1.deposita();//En esta funcion se lanza una excepcion que hay que tratar
		} catch (MiExcepcion e) {
			e.printStackTrace();
		} 
	}
}
