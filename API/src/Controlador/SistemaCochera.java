package Controlador;

import java.util.*;

import Negocio.*;
import Persistencia.AdministradorPersistenciaCliente;

public class SistemaCochera {
	private Vector<Cochera> cocheras;
	private List<MedioDePago> mediosDePago;
	private Vector<Cliente> clientes;
	
	public SistemaCochera(){
		cocheras = new Vector<Cochera>();
		mediosDePago = new LinkedList<MedioDePago>();
		clientes = new Vector<Cliente>();
	}
	
	public String crearCochera(){
		Cochera cochera = new Cochera();
		cocheras.add(cochera);
		String info = cochera.getNumero();
		return info;
	}
	
	public void IngresarCliente(int cod){
		Cliente c = buscarCliente(cod);
		if(c == null){
			
		}
	}
	
	private Cliente buscarCliente(int cod){
		for(int i = 0; i<clientes.size();i++){
			if(clientes.elementAt(i).SosCliente(cod)){
				return clientes.elementAt(i);
			}
		}
		Cliente c =AdministradorPersistenciaCliente.getInstancia().verificarExistenciaCliente(cod);	
		if(c == null){
			return null;
		}else{
			return c;
		}
	}
	
	public void crearTarjeta(String entidad, int nroTarj, Date vencim) {
		Tarjeta tarj = buscarTarjeta(entidad,nroTarj);
		if(tarj == null){
			tarj = new Tarjeta(entidad,nroTarj,(java.sql.Date) vencim);
			mediosDePago.add(tarj);
		}
	}
	
	public void crearCBU(String entidad, int nroCbu) {
		CBU cbu = buscarCBU(entidad,nroCbu);
		if(cbu == null)
			mediosDePago.add(new CBU(entidad,nroCbu));
	}	
	
	public Tarjeta buscarTarjeta(String entidad,int nroTarj)
	{
		Tarjeta tarj = new Tarjeta();
		Tarjeta tarj1= (Tarjeta) tarj.buscarMedioDePago(entidad, nroTarj);
		mediosDePago.add(tarj1);
		return tarj1;
	}
	
	public CBU buscarCBU(String entidad,int cbu)
	{
		CBU cbu1 = new CBU();
		CBU cbu2= (CBU) cbu1.buscarMedioDePago(entidad, cbu);
		mediosDePago.add(cbu2);
		return cbu2;
	}
	
}
