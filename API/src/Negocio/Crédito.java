package Negocio;

public abstract class Cr�dito extends MedioDePago{
	protected String entidad;
	
	public Cr�dito(String entidad) {
		this.entidad = entidad;
		// TODO Auto-generated constructor stub
	}
	
	public abstract MedioDePago buscarMedioDePago(String entidad, int nroIdentif);

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	
}
