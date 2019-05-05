package Modelo;

public class Usuario extends Persona {
	private String id;
	private String servicio;
	private String priori;
	
	public Usuario(String id, String name, String servicio, String priori) {
		super(name);
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

}
