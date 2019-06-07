package Control;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import Modelo.Usuario;

public class Metodos {
	
	public String agregarRegistro(Usuario x) throws IOException {
		try {
			FileWriter fw = new FileWriter("Usuarios.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			try (PrintWriter pw = new PrintWriter(bw)) {
				pw.println(x.getName() + "|" + x.getId() + "|" + x.getServicio() + "|" + x.getPriori());
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se registro correctamente", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
		}
		return null;

	}

}
