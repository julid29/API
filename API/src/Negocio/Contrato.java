package Negocio;

import java.sql.*;

public class Contrato {
	private int idContrato;
	private int idCliente;
	private Date fecha;
	
	public Contrato() {
		super();
	}

	public Contrato(int idContrato, int idCliente, Date fecha) {
		this.idContrato = idContrato;
		this.idCliente = idCliente;
		this.fecha = fecha;
	}

	public int getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
