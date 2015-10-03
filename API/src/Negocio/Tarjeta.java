package Negocio;

import java.sql.*;

public class Tarjeta extends MedioDePago {
	private int nroTarj;
	private Date fecha;
	
	public Tarjeta(String entidad, int nroTarj, Date fecha) {
		super(entidad);
		this.nroTarj = nroTarj;
		this.fecha = fecha;
		// TODO Auto-generated constructor stub
	}

	public boolean sosMedioDePago(String entidad, int nroTarj) {
		if(this.entidad.equals(entidad) && this.nroTarj==nroTarj)
			return true;
		return false;
	}
	
	
	//getters & setters
	public int getNroTarj() {
		return nroTarj;
	}

	public void setNroTarjeta(int nroTarj) {
		this.nroTarj = nroTarj;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	

}
