package Negocio;

import java.sql.*;

import Persistencia.AdminPersistenciaMedioDePago;

public class Tarjeta extends Crédito {
	private int nroTarj;
	private Date vencim;
	
	public Tarjeta() {
		super(null);
		this.nroTarj = 0;
		this.vencim = null;
		// TODO Auto-generated constructor stub
	}
	
	public Tarjeta(String entidad, int nroTarj, Date vencim) {
		super(entidad);
		this.nroTarj = nroTarj;
		this.vencim = vencim;
		// TODO Auto-generated constructor stub
		AdminPersistenciaMedioDePago.getInstancia().insertarTarjeta(this);
	}

	public MedioDePago buscarMedioDePago(String entidad,int nroTarj){
		return AdminPersistenciaMedioDePago.getInstancia().buscarTarjeta(entidad, nroTarj);
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

	public Date getVencim() {
		return vencim;
	}

	public void setVencim(Date vencim) {
		this.vencim = vencim;
	}
	
	

}
