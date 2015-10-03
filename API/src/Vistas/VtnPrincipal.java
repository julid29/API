package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VtnPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VtnPrincipal frame = new VtnPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VtnPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 414);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCliente = new JMenu("Clientes");
		menuBar.add(mnCliente);
		
		JMenuItem mntmNuevoCliente = new JMenuItem("Nuevo Cliente");
		mnCliente.add(mntmNuevoCliente);
		
		JMenuItem mntmModificarCliente = new JMenuItem("Modificar Cliente");
		mnCliente.add(mntmModificarCliente);
		
		JMenuItem mntmEliminarCliente = new JMenuItem("Eliminar Cliente");
		mnCliente.add(mntmEliminarCliente);
		
		JMenu mnContratos = new JMenu("Contratos");
		menuBar.add(mnContratos);
		
		JMenuItem mntmNuevoContrato = new JMenuItem("Nuevo Contrato");
		mnContratos.add(mntmNuevoContrato);
		
		JMenu mnMediosDePago = new JMenu("Medios de Pago");
		menuBar.add(mnMediosDePago);
		
		JMenuItem mntmNuevoMedioDe = new JMenuItem("Nuevo Medio de Pago");
		mnMediosDePago.add(mntmNuevoMedioDe);
		
		JMenu mnCocheras = new JMenu("Cocheras");
		menuBar.add(mnCocheras);
		
		JMenuItem mntmCrearCochera = new JMenuItem("Crear Cochera");
		mnCocheras.add(mntmCrearCochera);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
