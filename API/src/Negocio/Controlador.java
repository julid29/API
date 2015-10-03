package Negocio;

import java.util.Vector;

public class Controlador {
	private String domActual;
	private Vector<Cliente> Clientes;
	private Cliente ClienteActual;
	private Vector<Contrato> Contratos;
	private Contrato ContratoActual;
	private Vector<Cobranza> Cobranzas;
	private MapaDeCocheras Mapa;
	
	public Controlador(){
		Clientes = new Vector<Cliente>();
		Contratos = new Vector<Contrato>();
		Cobranzas = new Vector<Cobranza>();
		ClienteActual = null;
		ContratoActual = null;
		Mapa = null;
	}
}
