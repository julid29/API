package Controlador;

import java.util.*;
import Negocio.*;

public class SistemaCochera {
	private Vector<Cochera> cocheras;
	private List<MedioDePago> mediosDePago;
	
	public SistemaCochera(){
		cocheras = new Vector<Cochera>();
		mediosDePago = new LinkedList<MedioDePago>();
	}
	
	public String crearCochera(){
		Cochera cochera = new Cochera();
		cocheras.add(cochera);
		String info = cochera.getNumero();
		return info;
	}
	
	
	
	
	
}
