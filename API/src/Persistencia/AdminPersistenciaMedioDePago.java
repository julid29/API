package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Negocio.*;

public class AdminPersistenciaMedioDePago {

	private static AdminPersistenciaMedioDePago pool;
	
	private AdminPersistenciaMedioDePago()
	{
		
	}
	
	public static AdminPersistenciaMedioDePago getInstancia()
	{
		if (pool== null)
			pool =new AdminPersistenciaMedioDePago();
		return pool;
	}
	
	public void insertarCBU (CBU cbu) {
		//Obtener conexion BD 
		Connection con = PoolConnection.getPoolConnection().getConnection();
		
		//Generar sentencia SQL
		try
		{
			String senten = "INSERT INTO MedioDePago (tipo,entidad,cbu) VALUES ('CBU',?,?)" ;
			PreparedStatement ps = null;
			ps = con.prepareStatement(senten);
			ps.setString(1,cbu.getEntidadBancaria());
			ps.setInt(2,cbu.getCbu());
			
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
	
	public void insertarTarjeta (Tarjeta tarjeta) {
		//Obtener conexion BD 
		Connection con = PoolConnection.getPoolConnection().getConnection();
		
		//Generar sentencia SQL
		try
		{
			String senten = "INSERT INTO MedioDePago (tipo,entidad,nroTarj) VALUES ('Tarjeta',?,?,?)" ;
			PreparedStatement ps = null;
			ps = con.prepareStatement(senten);
			ps.setString(1,tarjeta.getEntidadBancaria());
			ps.setInt(2,tarjeta.getNroTarj());
			ps.setDate(3,tarjeta.getFecha());
			
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
