
public class Cliente {
	private String nombre;
	private String documento;
	private String telefono;
	private String profesion;
	
	//(3*)Tambien queremos que nombre, documento, telefono sean privados
	//Los getter y setter los podemos hacer automaticamente desde la pestaña source
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	} 
	public String getProfesion () {
        return profesion;
    }
    public void setProfissao(String profesion) {
        this. profesion = profesion;
    }
	
	
	////////////////////////
	
	
	
	

}
