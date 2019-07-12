package modelo;

import java.util.ArrayList;


public class Asesor extends Persona {
	private ArrayList<String> servicios; 
    private int flag;
    private int libre;
	
	public Asesor(String nombre, ArrayList<String> servicios, int flag, int libre) {
		super(nombre);
		this.servicios = servicios;
		this.flag = flag;
	}
	
	public ArrayList<String> getServicios() {
		return servicios;
	}

	public void setServicios(ArrayList<String> servicios) {
		this.servicios = servicios;
	}

	public int isFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	public int getLibre() {
		return libre;
	}
	
	public void setLibre(int libre) {
		this.libre = libre;
	}

}
