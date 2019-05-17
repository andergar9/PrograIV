package co.nihil.turnero.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuarios")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "Nombre")
	private String name;
	
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "Servicio")
	private String servicio;
	
	@Column(name = "Prioridad")
	private String priori;

	public Usuario() {	
	}
	
	public Usuario(String id, String name, String servicio, String priori) {
		this.name= name;
		this.id = id;
		this.servicio = servicio;
		this.priori = priori;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getPriori() {
		return priori;
	}

	public void setPriori(String priori) {
		this.priori = priori;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", servicio=" + servicio + ", priori=" + priori + ", name=" + name + "]";
	}

}

