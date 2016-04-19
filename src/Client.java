import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import mx.ipn.escom.dsd.rmi.interfaces.CalculadoraInterface;
import mx.ipn.escom.dsd.rmi.interfaces.OperacionesProfesorInterface;
import mx.ipn.escom.dsd.rmi.interfaces.exception.BadParameterException;
import mx.ipn.escom.dsd.rmi.interfaces.exception.DivZeroException;
import mx.ipn.escom.dsd.rmi.interfaces.modelo.ProfesorInterface;

public class Client {
	public static void main(String[] args) {
		try {
			System.setSecurityManager(new SecurityManager());
			final Registry registry = LocateRegistry
					.getRegistry(Registry.REGISTRY_PORT);
			OperacionesProfesorInterface operacionesProfesor = (OperacionesProfesorInterface) registry
					.lookup("rmi://localhost/OP");
			ProfesorInterface profesor = (ProfesorInterface) operacionesProfesor
					.findById(1);
			System.out.println("Profesor: " + profesor.getGrado().getNombre()
					+ " " + profesor.getNombre() + " "
					+ profesor.getPrimerApellido() + " "
					+ profesor.getSegundoApellido());
			// CalculadoraInterface calculadora = (CalculadoraInterface)
			// registry
			// .lookup("rmi://localhost/Calculadora");
			// System.out.println("Suma: "+calculadora.suma(2, 5));
			// System.out.println("Suma: "+calculadora.resta(4, 3));
			// System.out.println("Suma: "+calculadora.producto(56, 3));
			// System.out.println("Suma: "+calculadora.division(4, 0));
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		} catch (BadParameterException e) {
			e.printStackTrace();
		}
	}
}
