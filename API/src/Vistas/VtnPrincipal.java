package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import Controlador.SistemaCochera;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class VtnPrincipal extends JFrame {
	private JMenuBar menuBar;
	private JMenu mnCliente;
	private JMenuItem mntmNuevoCliente;
	private JMenuItem mntmModificarCliente;
	private JMenuItem mntmEliminarCliente;
	private JMenu mnContratos;
	private JMenuItem mntmNuevoContrato;
	private JMenu mnMediosDePago;
	private JMenuItem mntmNuevoMedioDe;
	private JMenu mnCocheras;
	private JMenuItem mntmCrearCochera;
	
	private SistemaCochera controlador;
	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


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
	public VtnPrincipal(){
		initGUI();
		controlador = new SistemaCochera();
	}
	
	private void initGUI() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 631, 414);
		this.setFont(new java.awt.Font("Calibri",0,10));
		this.setTitle("Sistema de Cocheras");

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
		mntmCrearCochera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		mnCocheras.add(mntmCrearCochera);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
