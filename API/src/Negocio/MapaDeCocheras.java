package Negocio;

import java.util.Vector;

public class MapaDeCocheras {
	private Vector<Cochera> Cocheras;
	
	public MapaDeCocheras(){
		Cocheras = new Vector<Cochera>();
	}
	
	private void agregarCochera(){
		Cochera c = new Cochera();
		Cocheras.add(c);
	}
	
	public Cochera verificarEspacio(){
		return null;
	}
}
