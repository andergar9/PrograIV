package ProgramaTurnero;

import Control.ControlTurnero;
import Modelo.Usuario;
import Vista.InterfazVista;
import Vista.VentanaIngresoU;

public class Turnero {

	public static void main(String[] args) {
		Usuario modelo = new Usuario();
		
		InterfazVista vista = new VentanaIngresoU();
		
		ControlTurnero control = new ControlTurnero (vista, modelo);
		
		vista.setControlador(control);
		
		vista.comenzar();

	}

}
