package Persistencia;

public class AdministradorPersistenciaCliente {
	private static AdministradorPersistenciaCliente pool;
	
	private AdministradorPersistenciaCliente(){
		
	}
	
	public static AdministradorPersistenciaCliente getInstancia(){
		if (pool== null)
			pool =new AdministradorPersistenciaCliente();
		return pool;
	}
	
	
}
