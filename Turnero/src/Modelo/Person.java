
package Modelo;

public class Person {
	private String codigo;
    private String turno;
	
	public Person(String codigo, String turno) {
		this.codigo = codigo;
		this.turno = turno;
	}
	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}


}
