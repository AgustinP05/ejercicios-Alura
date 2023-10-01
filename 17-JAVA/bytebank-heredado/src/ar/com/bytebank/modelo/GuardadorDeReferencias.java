package ar.com.bytebank.modelo;

public class GuardadorDeReferencias {
	
	private Object[] referencias;
	private int posicionLibre;
	
	
	public GuardadorDeReferencias(){
		this.referencias = new Object[10];
		posicionLibre = 0;
	}

	public void adicionar(Object objetoAgregado) {
		this.referencias[posicionLibre] = objetoAgregado;
		posicionLibre++;
	}
	
	public int getLargoDeLista(){
		return this.posicionLibre;
	}

	public Object getReferencia(int i) {
		return this.referencias[i]; 
		
	}
}
