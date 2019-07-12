package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import Modelo.Usuario;
import Vista.InterfazVista;

public class ControlTurnero implements ActionListener{
	
	private InterfazVista vista;
	Metodos m = new Metodos();
	Usuario u = new Usuario();

	public ControlTurnero(InterfazVista vista, Usuario modelo) {
		this.vista = vista;
	}
	
	
	public void actionPerformed(ActionEvent evento) {
		Usuario u = vista.getUsuario();
		if(evento.getActionCommand().equals(InterfazVista.REGISTRAR)) {
			vista.escribeUsuario("Ingrese info");
			try {
				m.agregarRegistro(u);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			vista.escribeUsuario("ERROR");
		}
		
		
	}

}
