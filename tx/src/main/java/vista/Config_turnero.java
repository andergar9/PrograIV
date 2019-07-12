package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import modelo.Prioridades;
import modelo.Servicios;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.AdministrarPrioridades;
import controlador.AdministrarServicios;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class Config_turnero {

	private JFrame frame;
	private JTextField textService;
	private JTextField textPriori;
	
	AdministrarServicios aS = new AdministrarServicios ();
	AdministrarPrioridades aP = new AdministrarPrioridades ();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Config_turnero window = new Config_turnero();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Config_turnero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblConfiguracionTurnero = new JLabel("Configuracion Turnero");
		lblConfiguracionTurnero.setBounds(161, 11, 170, 14);
		frame.getContentPane().add(lblConfiguracionTurnero);
		
		JLabel lblServiciosAPrestar = new JLabel("Servicios a prestar:");
		lblServiciosAPrestar.setBounds(22, 66, 105, 14);
		frame.getContentPane().add(lblServiciosAPrestar);
		
		JLabel lblPrioridades = new JLabel("Prioridades:");
		lblPrioridades.setBounds(22, 108, 73, 14);
		frame.getContentPane().add(lblPrioridades);
		
		textService = new JTextField();
		textService.setBounds(123, 63, 138, 20);
		frame.getContentPane().add(textService);
		textService.setColumns(10);
		
		textPriori = new JTextField();
		textPriori.setBounds(123, 105, 138, 20);
		frame.getContentPane().add(textPriori);
		textPriori.setColumns(10);
		
		JButton btnAgregarService = new JButton("Agregar");
		btnAgregarService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Servicios s = new Servicios(textService.getText());
				aS.AgregarServicio(textService.getText());
				textService.setText(null);
				
			}
		});
		btnAgregarService.setBounds(271, 62, 89, 23);
		frame.getContentPane().add(btnAgregarService);
		
		JButton btnAgregarPriori = new JButton("Agregar");
		btnAgregarPriori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prioridades p = new Prioridades(textPriori.getText());
				aP.AgregarPrioridad(textPriori.getText());		
			}
		});
		btnAgregarPriori.setBounds(271, 104, 89, 23);
		frame.getContentPane().add(btnAgregarPriori);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VistaAsesores vista = new VistaAsesores();
			//	vista.setVisible(true);	
			}
		});
		btnContinuar.setBounds(172, 182, 89, 23);
		frame.getContentPane().add(btnContinuar);
	}
}
