package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import Controlador.SistemaCochera;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VtnContrato extends JFrame {
	private SistemaCochera controlador;
	private JButton btnAltaContrato;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public VtnContrato(SistemaCochera cont){
		controlador = cont;
		initGUI();
	}
	
	private void initGUI() {
		try{
			setTitle("Contratos");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
		
			JButton btnAltaContrato = new JButton("Alta Contrato");
			btnAltaContrato.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				}
			});
			btnAltaContrato.setBounds(145, 30, 137, 37);
			contentPane.add(btnAltaContrato);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
