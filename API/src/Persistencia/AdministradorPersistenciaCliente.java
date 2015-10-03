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
	
	public boolean verificarExistenciaCliente(int cod){
		Connection con = PoolConnection.getPoolConnection().getConnection();
		try{
			String senten = "Select dni from clientes where dni=?" ;
			PreparedStatement ps = null;
			ps = con.prepareStatement(senten);
			ps.setString(1,String.valueOf(cod));
			ps.execute();
			
			ResultSet result = ps.executeQuery();
			if(result.wasNull()){
				PoolConnection.getPoolConnection().closeConnections();
				return true;
			}
			PoolConnection.getPoolConnection().closeConnections();
			return false;
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
