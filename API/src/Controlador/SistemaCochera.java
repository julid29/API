package Controlador;

import java.util.Vector;

import Negocio.Cochera;

public class SistemaCochera {
	private Vector<Cochera> cocheras;
	
	public SistemaCochera(){
		cocheras = new Vector<Cochera>();
	}
	
	public String crearCochera(){
		Cochera cochera = new Cochera();
		cocheras.add(cochera);
		String info = cochera.getNumero();
		return info;
	}
}
