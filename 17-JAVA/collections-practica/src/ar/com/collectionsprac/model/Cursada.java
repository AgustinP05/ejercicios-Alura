package ar.com.collectionsprac.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Cursada implements Comparable<Cursada> {
	private String nombre;
	private int tiempo;
	private List<Clase> claseList = new ArrayList();//En esta vamos a utilizar clases implementadas es List
			//Aqui estamos utilizando la interface List para crear lista ArrayList
	//Tambien, List tiene la posibilidad de polimorfismo, ya que podria ser tambien LinkedList en lugar de ArrayList.
	
	private Collection<Alumno> alumnoLista = new HashSet<>();
	
	//Un mapa es una interfaz, hace parte del package java.util no posee métodos de la interfaz Collection, trabaja bajo un concepto de (llave, valor)
	//Siempre nos va a convenir usar Map cuando queremos buscar valores unicos
	//Obtener valores a través de una llave única, hace más rápido la búsqueda de información. Un mapa trabaja bajo un concepto de (llave, valor), al tener una llave única por ejemplo un DNI, termina siendo más rápido la búsqueda de información.
	private Map<String, Alumno> alumnoMap = new HashMap<>();
	//Map<Key, Value> nombreMap = new HashMap<>();
	//Key sería lo unico para identificar al Value, en nuestro caso es el codigo que es String
	//Value es lo que queremos encontrar, en nuestro caso algo de tipo Alumno
	//Tambien vamos a agregar en el addAlumno, un put() para agregarlo dentro de este alumnoMap
	//Y tambien creamos un getter de alumnoMap para poder llamarlo en el main
	
	//Tambien existe el LinkedHashMap
	//private Map<String, Alumno> alumnoMap = new LinkedHashMap()<>();
	/* La diferencia entre HasMap y LinkedHashMap es que HashMap los adiciona como crea conveniente
	   LinkedHashMap los adiciona en orden
	 */
	
	
	
	public Cursada(String nombre, int tiempo){
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public Cursada(String nombre, int tiempo, List<Clase> claseList ){
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.claseList = claseList;
	}
	
	
	//Setters y getters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTiempo() {
		return tiempo;
	}


	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	
	public List<Clase> getClaseList() {
		return Collections.unmodifiableList(claseList);//Para que al llamar al getter, no podamos modificar la lista a travez de ella.
	}

	public void setClaseList(List<Clase> claseList) {
		this.claseList = claseList;
	}

	
	public Map<String, Alumno> getAlumnoMap() {
		return alumnoMap;
	}
	
	
	
	
	///////////////////////////

	public void addClase(Clase clase) {
		this.claseList.add(clase);
	}
		
	
///////////Para lo del AlumnoLista
	public void addAlumno(Alumno alumnoNuevo) {
		this.alumnoLista.add(alumnoNuevo);
		
		this.alumnoMap.put(alumnoNuevo.getCodigo(), alumnoNuevo);//Similar a add. Es para agregarle el alumno al HashMap o LinkedHashMap. Lo agrega identificandolo con el codigo. Si en algun momento se quiere agregar un nuevo alumno con el mismo codigo, se reemplazará con el nuevo alumno.
	}
	
	public boolean verificarAlumno(Alumno alumno) {
		return this.alumnoLista.contains(alumno);
	}
	
	public Collection<Alumno> getAlumno() {
		return alumnoLista;
	}
/////////////	
	
	
	

		//Metodo sobreescrito para que retorne el nombre y no el hash
		@Override
		public String toString() {
			return this.nombre;
		}

		
		//Metodo implementado por Comparable
		@Override
		public int compareTo(Cursada o) {
			// TODO Auto-generated method stub
			return this.nombre.compareTo(o.getNombre());
		}

}
