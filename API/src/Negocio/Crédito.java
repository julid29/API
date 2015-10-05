package Negocio;

public abstract class Crédito extends MedioDePago{
	protected String entidad;
	
	public Crédito(String entidad) {
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
