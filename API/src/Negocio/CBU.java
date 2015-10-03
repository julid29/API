package Negocio;

import Persistencia.AdminPersistenciaMedioDePago;

public class CBU extends MedioDePago {
	private int cbu;
	
	public CBU() {
		super(null);
		this.cbu=0;
		// TODO Auto-generated constructor stub
	}
	
	public CBU(String entidad, int cbu) {
		super(entidad);
		this.cbu=cbu;
		// TODO Auto-generated constructor stub
		AdminPersistenciaMedioDePago.getInstancia().insertarCBU(this);
	}

	public MedioDePago buscarMedioDePago(String entidad,int nroCbu){
		return AdminPersistenciaMedioDePago.getInstancia().buscarCBU(entidad, nroCbu);
	}
	
	public boolean sosMedioDePago(String entidad, int cbu) {
		if(this.entidad.equals(entidad) && this.cbu==cbu)
			return true;
		return false;
	}
	
	//getters & setters
	public int getCbu() {
		return cbu;
	}

	public void setCbu(int cbu) {
		this.cbu = cbu;
	}

	
}
