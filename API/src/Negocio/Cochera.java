package Negocio;

import Persistencia.AdministradorPersistenciaCochera;

public class Cochera {
	private String numero;
	private boolean estado; //falso = disponible
	
	private static int piso; //ultimo numero de piso
	private static int ultimoNro; //ultimo numero de cochera
	
	public Cochera(){
		numero = String.valueOf(obtenerPiso())+"-"+String.valueOf(obtenerNro());
		estado = false;
		AdministradorPersistenciaCochera.getInstancia().insert(this);
	}
	
	private static int obtenerNro(){
		return ultimoNro++;
	}
	
	private static int obtenerPiso(){
		if(ultimoNro == 10){
			piso = piso + 1;
			ultimoNro = 0;
		}
		return piso;
	}

	public String getNumero() {
		return numero;
	}
	
}
