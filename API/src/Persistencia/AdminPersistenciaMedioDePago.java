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
			ps.setDate(3,tarjeta.getVencim());
			
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
	
	public MedioDePago buscarTarjeta(String entidad, int nroTarj)
	{
		Tarjeta tarj = null;
		//Obtener conexion BD 
		Connection con = PoolConnection.getPoolConnection().getConnection();
		
		//Generar sentencia SQL
		try
		{
			//Preparar sentencia insert en tabla destino
			String senten = "SELECT entidad,nroTarj,fecha FROM MedioDePago WHERE tipo='Tarjeta' AND entidad=? AND nroTarj=?" ;
			PreparedStatement ps = null;
			ps = con.prepareStatement(senten);
			ps.setString(1,entidad);
			ps.setInt(2,nroTarj);
			ResultSet result = ps.executeQuery();
			while (result.next())
			{
				tarj = new Tarjeta();
				tarj.setEntidadBancaria(entidad);
				tarj.setNroTarjeta(nroTarj);
				tarj.setVencim(result.getDate("fecha"));
			}
			
			PoolConnection.getPoolConnection().closeConnections();
			return tarj;
		}
	      catch( SQLException e ) 
	      {
				System.out.println("Mensaje Error al Borrar Cliente: " + e.getMessage());
				System.out.println("Stack Trace al Borrar Cliente: " + e.getStackTrace());
				PoolConnection.getPoolConnection().closeConnections();
	      }
	      return tarj;
	}
	
	public MedioDePago buscarCBU(String entidad, int nroCbu)
	{
		CBU cbu = null;
		//Obtener conexion BD 
		Connection con = PoolConnection.getPoolConnection().getConnection();
		
		//Generar sentencia SQL
		try
		{
			//Preparar sentencia insert en tabla destino
			String senten = "SELECT entidad,cbu FROM MedioDePago WHERE tipo='CBU' AND entidad=? AND cbu=?" ;
			PreparedStatement ps = null;
			ps = con.prepareStatement(senten);
			ps.setString(1,entidad);
			ps.setInt(2,nroCbu);
			ResultSet result = ps.executeQuery();
			while (result.next())
			{
				cbu = new CBU();
				cbu.setEntidadBancaria(entidad);
				cbu.setCbu(nroCbu);
			}
			
			PoolConnection.getPoolConnection().closeConnections();
			return cbu;
		}
	      catch( SQLException e ) 
	      {
				System.out.println("Mensaje Error al Borrar Cliente: " + e.getMessage());
				System.out.println("Stack Trace al Borrar Cliente: " + e.getStackTrace());
				PoolConnection.getPoolConnection().closeConnections();
	      }
	      return cbu;
	}
	
}
