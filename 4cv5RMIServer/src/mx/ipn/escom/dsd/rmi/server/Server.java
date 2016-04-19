package mx.ipn.escom.dsd.rmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import mx.ipn.escom.dsd.rmi.interfaces.CalculadoraInterface;
import mx.ipn.escom.dsd.rmi.interfaces.OperacionesProfesorInterface;

public class Server {
	public static void main(String[] args) {
		try {
			System.setSecurityManager(new SecurityManager());
			final Registry registry = LocateRegistry
					.createRegistry(Registry.REGISTRY_PORT);
			CalculadoraInterface calculadora = new Calculadora();
			OperacionesProfesorInterface operacionesProfesor = new OperacionesProfesor();
			registry.rebind("rmi://localhost/Calculadora", calculadora);
			registry.rebind("rmi://localhost/OP", operacionesProfesor);
			System.out.println("El servidor esta listo para atender peticiones...");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
