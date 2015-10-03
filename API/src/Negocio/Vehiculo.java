package Negocio;

import java.util.Date;
import java.util.Vector;

public class Vehiculo {
	private String tipo;
	private String patente;
	private String marca;
	private String modelo;
	private Date fechaentrada;
	private Vector<Cochera> Cocheras;
	private boolean estado;  //false = bloqueado
	
	public Vehiculo(String tipo,String patente,String marca,String modelo,Vector<Cochera> coch){
		Cocheras = coch;
		this.tipo = tipo;
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.fechaentrada = new Date();
		this.estado = true;
		
	}
	
}
