package controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Servicios;

public class AdministrarServicios {
	public static List<Servicios> servicios;
	
	public AdministrarServicios() {
		servicios = new ArrayList<Servicios>();
	}
	
	public List<Servicios> getServicios(){
		return servicios;
	}
	
	public void setServicios(List<Servicios> servicios) {
		this.servicios = servicios;
	}
	
	public Servicios AgregarServicio(String nombre) {
		Servicios newServicio = new Servicios(nombre);
		try {
			FileWriter fw = new FileWriter("Servicios.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			try (PrintWriter pw = new PrintWriter(bw)) {
				pw.println(nombre);
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se registro correctamente", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
		}
		
		newServicio.setNombre(nombre);
		servicios.add(newServicio);
		return newServicio;
	}
	
	/**
	public void listarServicios() {
		List<Servicios> servicio = List<Servicios>;
				for(Servicios ser : servicio) {
					System.out.print(ser.getNombre()+"\n");
				}
				System.out.print("Total Servicios: " + servicio.size());
	}**/

}
