package controlador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Asesor;
import modelo.Servicios;

public class AdministrarAsesores {
	
	List<Asesor> asesores = new ArrayList<Asesor>();

	public List<Asesor> getAsesores() {
		return asesores;
	}

	public void setAsesores(List<Asesor> asesores) {
		this.asesores = asesores;
	}
	
	public void escribirAsesores(List<Asesor> a, String file) {
		try {
			File f = new File(file); 
			if(f.exists())
				f.delete();
			FileWriter fw = new FileWriter("Asesores.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			try (PrintWriter pw = new PrintWriter(bw)){
				for(Asesor c:a) {
					pw.println(c.getNombre()+"|"+c.getServicios());
				}
			}
		}catch (IOException e) {
			JOptionPane.showConfirmDialog(null, "No se registro correctamente", "Advertencia", JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
	public void listarAsesor() {
		List<Asesor> l = new ArrayList<Asesor>();
		for (Asesor asesor:asesores) {
			System.out.println(asesor.getId()+"|"+asesor.getNombre()+"|"+ asesor.getServicios());
		}
		System.out.print("Asesores: " + l.size());
	}
	
	/**
	public void agregarServicioAsesor(String id, ArrayList<String> servicios) {
		for(Asesor asesor:obtenerAsesores()) {
			if(id==asesor.getId()) {
				asesor.setServicios(servicios);
			}
		}
		
	}**/
	
	public List<Asesor> obtenerAsesores(){
		List<Asesor> listaAsesores = new ArrayList<Asesor>();
		return listaAsesores;
	}
	


}
