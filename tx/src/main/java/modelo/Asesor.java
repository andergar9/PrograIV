package modelo;

import java.util.ArrayList;


public class Asesor extends Persona {
	
	private ArrayList<String> servicios; 
	private String id;
	private boolean estado;
	

	public Asesor(String id, String nombre, ArrayList<String> servicios, boolean estado) {
		super(nombre);
		this.id = id;
		this.servicios = servicios;
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public ArrayList<String> getServicios() {
		return servicios;
	}

	public void setServicios(ArrayList<String> servicios) {
		this.servicios = servicios;
	}
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}


}
