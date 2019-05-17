package co.nihil.turnero.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Asesores")
public class Asesor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column
	private ArrayList<String> servicios; 
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Id
	@Column(name = "Flag")
    private int flag;
	
	@Column(name = "Libre")
    private int libre;
	
    public Asesor() {
		
	}
	
	public Asesor(String nombre, ArrayList<String> servicios, int flag, int libre) {
		this.nombre = nombre;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Asesor [servicios=" + servicios + ", nombre=" + nombre + ", flag=" + flag + ", libre=" + libre + "]";
	}

}

