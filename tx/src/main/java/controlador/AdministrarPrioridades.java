package controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Prioridades;
import modelo.Servicios;

public class AdministrarPrioridades {
	public static List<Prioridades> prioridades;
	
	public AdministrarPrioridades () {
		prioridades = new ArrayList<Prioridades>();
	}
	
	public List<Prioridades> getPrioridades(){
		return prioridades;
	}
	
	public void setPrioridades(List<Prioridades> prioridades) {
		this.prioridades = prioridades;
	}
	
	public Prioridades AgregarPrioridad(String nombre) {
		Prioridades newPrioridad = new Prioridades(nombre);
		try {
			FileWriter fw = new FileWriter("Prioridades.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			try (PrintWriter pw = new PrintWriter(bw)) {
				pw.println(nombre);
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se registro correctamente", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
		}
		newPrioridad.setNombre(nombre);
		prioridades.add(newPrioridad);
		return newPrioridad;
		
	}

}
