package Vista;

import java.awt.BorderLayout;
import java.io.IOException;
import Modelo.Usuario;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Control.ControlTurnero;

public class VentanaIngresoU extends JFrame implements InterfazVista{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField name;
	private JTextField id;
	private JTextField service;
	private JTextField priori;
	private JButton registrar;
	private JLabel resultado;
	
	public VentanaIngresoU() {
		super("Ingreso de Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setBounds(79, 53, 46, 20);
		getContentPane().add(lblNombre);
		
		name = new JTextField();
		name.setBounds(152, 50, 176, 20);
		getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(79, 102, 46, 20);
		getContentPane().add(lblId);
		
		id = new JTextField();
		id.setBounds(152, 99, 176, 20);
		getContentPane().add(id);
		id.setColumns(10);
		
		JLabel lblServicio = new JLabel("Servicio :");
		lblServicio.setBounds(79, 144, 46, 20);
		getContentPane().add(lblServicio);
		
		service = new JTextField();
		service.setBounds(152, 141, 176, 20);
		getContentPane().add(service);
		service.setColumns(10);
		
		JLabel lblPrioridad = new JLabel("Prioridad :");
		lblPrioridad.setBounds(79, 189, 72, 20);
		getContentPane().add(lblPrioridad);
		
		priori = new JTextField();
		priori.setBounds(152, 189, 176, 20);
		getContentPane().add(priori);
		priori.setColumns(10);
		
		JButton Registrar = new JButton("Registrar");
		Registrar.setBounds(177, 249, 89, 23);
		registrar.setActionCommand(REGISTRAR);
		getContentPane().add(Registrar);
		
		JLabel resultado = new JLabel("Ingrese datos");
		resultado.setBounds(177, 11, 89, 20);
		getContentPane().add(resultado);
		
	}
	
	public void escribeUsuario(String s) {
		resultado.setText(s);
		
	}
	
	public Usuario getUsuario() {
		Usuario u = new Usuario(name.getText(),id.getText(),service.getText(),priori.getText());
		return u;
	}
		

	public void setControlador(ControlTurnero c) {
		registrar.addActionListener(c);
	}

	public void comenzar() {
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
}
