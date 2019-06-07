package Vista;

import Control.ControlTurnero;
import Modelo.Usuario;

public interface InterfazVista {
	
	void setControlador(ControlTurnero c);
	void comenzar();
	
	void escribeUsuario(String s);
	Usuario getUsuario(); 
	
	static final String REGISTRAR = "Registrar";

}
