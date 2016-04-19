package mx.ipn.escom.dsd.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import mx.ipn.escom.dsd.rmi.interfaces.exception.BadParameterException;
import mx.ipn.escom.dsd.rmi.interfaces.modelo.ProfesorInterface;

public interface OperacionesProfesorInterface extends Remote {
	public ProfesorInterface findById(Integer idProfesor)
			throws RemoteException,BadParameterException;

	public List<ProfesorInterface> obtenerProfesores() throws RemoteException;

	public List<ProfesorInterface> obtenerProfesores(Integer idGrado)
			throws RemoteException;

	public ProfesorInterface registrar(ProfesorInterface profesor)
			throws RemoteException;

	public ProfesorInterface actualizar(ProfesorInterface profesor)
			throws RemoteException;

	public void eliminar(Integer idProfesor) throws RemoteException;
}
