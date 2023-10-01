package ar.com.bytebank.modelo;
//Vamos a sumar las bonificaciones correspondientes al Funcionario segun su tipo
public class ControlBonificacion {
	
	private double suma;
	
	//Esta funcion va a ser como puerta de entrada para funcionario y sus hijas
	//Esta funcion guarda en la variable 'suma', el porcentaje bonificacion por el salario del Funcionario creado.
	public double registrarSalario(Funcionario funcionario) {//Funcionario es padre, entonces en esta funcion se va a poder como parametro cualquiera de las hijas
		this.suma = this.suma + funcionario.getBonificacion();//Recordar que el getBonificacion solo retorna el valor de la bonificacion. El getBonificacion de Gerente retorna el valor de bonificacion+salario
		System.out.println("Bonificacion de: "+this.suma);
		return this.suma;
	}
	
	/*//Puerta de entrada para Gerente
	public double registrarSalario(Gerente gerente) {
		this.suma = this.suma + gerente.getBonificacion();//Recordar que el getBonificacion solo retorna el valor de la bonificacion. El getBonificacion de Gerente retorna el valor de bonificacion+salario
		System.out.println("Bonificacion de: "+this.suma);
		return this.suma;
	}
	Y podria seguir copiando y pegando por cada tipo de trabajador.
	Volver a crear el mismo metodo una y otra vez en la misma clase y darle un comportamiento distinto a cada una, se llama sobrecarga.(La sobrecarga no implica herencia)
	Pero no queremos eso ahora, sino que queremos explicar lo que es polimorfismo.
	
	
	En este ejercicio estamos haciendo polimorfismo con el registrarSalario(), ya que hemos declarado que en su parametro tiene que ingresarse un objeto de tipo Funcionario.
	Como las hijas (Gerente, Contador, etc.) son al mismo tiempo Funcionarios, entonces va a estar permitido ingresarlos como parametros.
	Incluso, si así lo deseamos, podemos sobreescribir la funcion dentro de cada clase
	
	Esto se considera polimorfismo porque esta funcion tiene muchas formas mientras sea del tipo Funcionario o hijas.*/




	//Getter para ver la suma total cuando yo quiera
	public double getSuma() {
		System.out.println("La suma total es: "+ this.suma);
		return this.suma;
	}









}
