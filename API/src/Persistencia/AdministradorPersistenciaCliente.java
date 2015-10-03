package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Negocio.Cliente;

public class AdministradorPersistenciaCliente {
	private static AdministradorPersistenciaCliente pool;
	
	private AdministradorPersistenciaCliente(){
		
	}
	
	public static AdministradorPersistenciaCliente getInstancia(){
		if (pool== null)
			pool =new AdministradorPersistenciaCliente();
		return pool;
	}
	
	public Cliente verificarExistenciaCliente(int cod){
		Connection con = PoolConnection.getPoolConnection().getConnection();
		try{
			Cliente c = null;
			String senten = "Select dni from clientes where dni=?" ;
			PreparedStatement ps = null;
			ps = con.prepareStatement(senten);
			ps.setString(1,String.valueOf(cod));
			ps.execute();
			
			ResultSet result = ps.executeQuery();
			while(result.next()){
				c = new Cliente();
				c.setNombre(result.getString("nombre"));
				c.setDomicilio(result.getString("domicilio"));
				c.setTelefono(result.getString("telefono"));
				c.setDni(result.getString(result.getString("dni")));
				c.setMail(result.getString("mail"));
				c.setCodigo(Integer.parseInt(result.getString(result.getString("codigo"))));
			}
			PoolConnection.getPoolConnection().closeConnections();
			return c;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}
