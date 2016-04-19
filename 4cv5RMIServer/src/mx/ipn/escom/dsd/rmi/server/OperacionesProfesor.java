package mx.ipn.escom.dsd.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import mx.ipn.escom.dsd.rmi.interfaces.OperacionesProfesorInterface;
import mx.ipn.escom.dsd.rmi.interfaces.exception.BadParameterException;
import mx.ipn.escom.dsd.rmi.interfaces.modelo.ProfesorInterface;
import mx.ipn.escom.dsd.rmi.server.bs.OperacionesProfesorBs;

public class OperacionesProfesor extends UnicastRemoteObject implements
		OperacionesProfesorInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected OperacionesProfesor() throws RemoteException {
		super();
	}

	@Override
	public ProfesorInterface findById(Integer idProfesor)
			throws RemoteException, BadParameterException {
		if (idProfesor == null) {
			throw new BadParameterException();
		}
		return OperacionesProfesorBs.findById(idProfesor);
	}

	@Override
	public List<ProfesorInterface> obtenerProfesores() throws RemoteException {
		return OperacionesProfesorBs.obtenerProfesores();
	}

	@Override
	public List<ProfesorInterface> obtenerProfesores(Integer idGrado)
			throws RemoteException {
		return OperacionesProfesorBs.obtenerProfesores(idGrado);
	}

	@Override
	public ProfesorInterface registrar(ProfesorInterface profesor)
			throws RemoteException {
		return OperacionesProfesorBs.registrar(profesor);
	}

	@Override
	public ProfesorInterface actualizar(ProfesorInterface profesor)
			throws RemoteException {
		return OperacionesProfesorBs.actualizar();
	}

	@Override
	public void eliminar(Integer idProfesor) throws RemoteException {
		OperacionesProfesorBs.eliminar(idProfesor);
	}

}
