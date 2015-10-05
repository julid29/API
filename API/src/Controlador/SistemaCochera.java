package Controlador;

import java.util.*;

import Negocio.*;
import Persistencia.AdministradorPersistenciaCliente;

public class SistemaCochera {
	private Vector<Cochera> cocheras;
	private Vector<MedioDePago> mediosDePago;
	private Vector<Cliente> clientes;
	private Vector<Vehiculo> vehiculos;
	
	public SistemaCochera(){
		cocheras = new Vector<Cochera>();
		mediosDePago = new Vector<MedioDePago>();
		clientes = new Vector<Cliente>();
		vehiculos = new Vector<Vehiculo>();
	}
	
	public String crearCochera(){
		Cochera cochera = new Cochera();
		cocheras.add(cochera);
		String info = cochera.getNumero();
		return info;
	}
	
	
	//cliente
	public void CrearCliente(String dni,String dom,String nom,String tel,String mail)
	{
		Cliente cli = buscarCliente(dni);
		if(cli == null)
		{
			cli = new Cliente(dni, dom, nom, tel, mail);
			clientes.add(cli);
		}
	}
	public void ModificarCliente(int codigo, String dni,String dom,String tel,String mail)
	{
		Cliente cli = buscarCliente(codigo);
		if(cli != null)
		{
			cli.ModificarCliente(dom, tel, mail);
			
			//hay que hacer esto, porq los cambios quedan en cli y en la base de datos, pero no en vector
			for(int i = 0; i < clientes.size(); i++){
				if(clientes.elementAt(i).SosCliente(dni)){
					clientes.set(i, cli);
				}
			}
		}
	}
	public void EliminarCliente(int codigo)
	{
		//verifica q exita cliente
			//existe
				//verifica q no tenga contratos asociados
					//no tiene
					//elimina los medios de pago
					//eimina cliente
				
	}
	
	public void IngresarCliente(int cod){ 
		Cliente c = buscarCliente(cod); 
			if(c == null){ 
			 
			} 
	} 
	private Cliente buscarCliente(String dni){
		for(int i = 0; i<clientes.size();i++){
			if(clientes.elementAt(i).SosCliente(dni)){
				return clientes.elementAt(i);
			}
		}
		
		Cliente c =AdministradorPersistenciaCliente.getInstancia().verificarExistenciaCliente(dni);	
		if(c == null)
			return null;
		else
			return c;
	}
	private Cliente buscarCliente(int cod){
		for(int i = 0; i<clientes.size();i++){
			if(clientes.elementAt(i).SosCliente(cod)){
				return clientes.elementAt(i);
			}
		}
		
		Cliente c =AdministradorPersistenciaCliente.getInstancia().verificarExistenciaCliente(cod);	
		if(c == null)
			return null;
		else
			return c;
	}
	
	
	//medios e pago
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
