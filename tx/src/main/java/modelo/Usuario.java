package modelo;

public class Usuario {
	private String id;
	private String servicio;
	private String priori;
	private String name;
	
	public Usuario(String id, String name, String servicio, String priori) {
		this.name = name;
		this.id = id;
		this.servicio = servicio;
		this.priori = priori;
	}
	
	public Usuario() {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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

}
