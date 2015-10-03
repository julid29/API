package Controlador;

import java.util.*;
import Negocio.*;

public class SistemaCochera {
	private Vector<Cochera> cocheras;
	private List<MedioDePago> mediosDePago;
	private Vector<Cliente> clientes;
	
	public SistemaCochera(){
		cocheras = new Vector<Cochera>();
		mediosDePago = new LinkedList<MedioDePago>();
		clientes = new Vector<Cliente>();
	}
	
	public String crearCochera(){
		Cochera cochera = new Cochera();
		cocheras.add(cochera);
		String info = cochera.getNumero();
		return info;
	}
	
	public void IngresarCliente(int cod){
		Cliente c = buscarCliente(cod);
		if(c == null){
			
		}
	}
	
	private Cliente buscarCliente(int cod){
		for(int i = 0; i<clientes.size();i++){
			if(clientes.elementAt(i).SosCliente(cod)){
				return clientes.elementAt(i);
			}
		}
		return null;
	}
	
	
}
