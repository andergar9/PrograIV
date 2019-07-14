package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.AdministrarAsesores;
import controlador.AdministrarServicios;
import modelo.Asesor;
import modelo.Servicios;

import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JList;

public class VistaAsesores {

	private JFrame frame;
	private JTextField textNasesor;
	private JTextField textIdAsesor;
	
	AdministrarAsesores aa = new AdministrarAsesores();
	AdministrarServicios as = new AdministrarServicios();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAsesores vista = new VistaAsesores();
					vista.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VistaAsesores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 361, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblConfiguracionAsesores = new JLabel("Configuracion Asesores");
		lblConfiguracionAsesores.setBounds(109, 11, 121, 14);
		frame.getContentPane().add(lblConfiguracionAsesores);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(47, 68, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblId = new JLabel("ID: ");
		lblId.setBounds(47, 106, 46, 14);
		frame.getContentPane().add(lblId);
		
		JLabel lblServicios = new JLabel("Servicios:");
		lblServicios.setBounds(47, 145, 46, 14);
		frame.getContentPane().add(lblServicios);
		
		JLabel lblDisponible = new JLabel("Disponible:");
		lblDisponible.setBounds(47, 184, 73, 14);
		frame.getContentPane().add(lblDisponible);
		
		textNasesor = new JTextField();
		textNasesor.setBounds(128, 65, 143, 20);
		frame.getContentPane().add(textNasesor);
		textNasesor.setColumns(10);
		
		textIdAsesor = new JTextField();
		textIdAsesor.setBounds(128, 103, 143, 20);
		frame.getContentPane().add(textIdAsesor);
		textIdAsesor.setColumns(10);
		
		final JComboBox comboBoxServicios = new JComboBox();
		comboBoxServicios.setBounds(128, 142, 143, 20);
		frame.getContentPane().add(comboBoxServicios);
		List<Servicios> listaServicios = as.obtenerListaServicios();
		for (Servicios s : listaServicios) {
			comboBoxServicios.addItem(s);
		}
		
		
		final JRadioButton estadoActivar = new JRadioButton("Activar");
		estadoActivar.setBounds(147, 180, 109, 23);
		estadoActivar.setSelected(false);
		frame.getContentPane().add(estadoActivar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<Asesor> l = new ArrayList<Asesor>();
				Asesor a = new Asesor(textIdAsesor.getText(), textNasesor.getText(), comboBoxServicios.getSelectedItem().toString(), estadoActivar.isSelected());
				l.add(a);
				aa.escribirAsesores(l, "Asesores.txt");
				textIdAsesor.setText(null);
				textNasesor.setText(null);
				
			}	
		});
		btnAgregar.setBounds(47, 239, 89, 23);
		frame.getContentPane().add(btnAgregar);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(190, 239, 89, 23);
		frame.getContentPane().add(btnContinuar);
		
		
		
	}
}
