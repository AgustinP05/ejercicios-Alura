package ar.com.bytebank.modelo;

public class CuentaCorriente extends Cuenta implements Tributacion {
	//De a primeras nos da error porque para crear una Cuenta hay que definir la agencia y numero.
	//Podria solucionarlo agregando un constructor vacio en Cuenta, pero no queremos eso.
	//Como el padre si o si necesita esos dosvalores, la hija no tendría que necesitarlos tambien?
	//Como queremos si o si que se cree asignando esos dos valores, podriamos hacer que en el constructor de CuentaCorriente llamemos a super() para llamar a todas las caracteristicas del padre.
	//A su vez, que CuentaCorriente reciba como parametros la agencia y numero y que se los mande al super().
	public CuentaCorriente(int agencia, int numero) {//Con esto asignamos parametros para mandarlos al constructor del padre. Sino no podríamos ingresar a ese contructor.
		super(agencia, numero);//Aqui llamamos todos los metodos del padre.
	}
	
	
//Obligadamente traemos de padre la clase abstracta depositar y la sobreescribimos
	//hacemos lo mismo que pasó en CuentaAhorro
	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	
	
	
		//*4 Utilizamos polimorfismo del tipo sobreescritura para asignarle una comision cuando se retira de esta clase
		@Override //Indica que se ha sobreescrito el metodo original //Esto no se borra porque pueden ocurrir errores sino, y tampoco se puede cambiar la forma. El Override aclara que se esta sobreescribiendo una funcion del padre. Si no estuviese, se tomaría como una funcion nueva pero con el mismo nombre, cosa que seguro rompería con lo que se quiere hacer  
			public void retirar(double valor) {
				double comision = 0.2;
				super.retirar(valor + comision); //Se ejecuta la funcion que viene del padre
		}


		//Viene de Tributacion
		@Override
		public double getValorImpuesto() {
			return super.saldo * 0.01;
		}


		
	
	
}
