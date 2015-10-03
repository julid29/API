package Negocio;

public abstract class MedioDePago {
	protected String entidad;

	public MedioDePago(String entidad) {
		super();
		this.entidad = entidad;
	}
	
	
	public String getEntidadBancaria() {
		return entidad;
	}

	public void setEntidadBancaria(String entidad) {
		this.entidad = entidad;
	}




}
