package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Negocio.Cochera;

public class AdministradorPersistenciaCochera {
	private static AdministradorPersistenciaCochera pool;
	
	private AdministradorPersistenciaCochera()
	{
		
	}
	
	public static AdministradorPersistenciaCochera getInstancia()
	{
		if (pool== null)
			pool =new AdministradorPersistenciaCochera();
		return pool;
	}
	
	public void insert(Cochera c)
	{
		//Obtener conexion BD 
		Connection con = PoolConnection.getPoolConnection().getConnection();
		
		//Generar sentencia SQL
		try
		{
			//Preparar sentencia insert en tabla destino
			String senten = "INSERT INTO clientes (dni, nombre, domicilio, telefono) VALUES (?,?,?,?)" ;
			PreparedStatement ps = null;
			ps = con.prepareStatement(senten);
			
			
			ps.execute();
			
			PoolConnection.getPoolConnection().closeConnections();
			
		}
	      catch( SQLException e ) 
	      {
				System.out.println("Mensaje Error al Insertar Cliente: " + e.getMessage());
				System.out.println("Stack Trace al Insertar Cliente: " + e.getStackTrace());
				PoolConnection.getPoolConnection().closeConnections();
	      } 
	}
}
