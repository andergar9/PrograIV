package modelo;

import java.util.ArrayList;


public class Asesor extends Persona { 

	private String id;
	private String servicios;
	private boolean estado;
	
	public Asesor(String id, String nombre, String servicios, boolean estado) {
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
	
	public String getServicios() {
		return servicios;
	}

	public void setServicios(String servicios) {
		this.servicios = servicios;
	}
	
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}


}
