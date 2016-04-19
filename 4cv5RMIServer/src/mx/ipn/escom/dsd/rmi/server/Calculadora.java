package mx.ipn.escom.dsd.rmi.server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import mx.ipn.escom.dsd.rmi.interfaces.CalculadoraInterface;
import mx.ipn.escom.dsd.rmi.interfaces.exception.DivZeroException;


public class Calculadora extends UnicastRemoteObject implements CalculadoraInterface{

	protected Calculadora() throws RemoteException {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Integer suma(Integer a, Integer b) throws RemoteException {
		return a+b;
	}

	@Override
	public Integer resta(Integer a, Integer b) throws RemoteException {
		return a-b;
	}

	@Override
	public Integer producto(Integer a, Integer b) throws RemoteException {
		return a*b;
	}

	@Override
	public Integer division(Integer a, Integer b) throws RemoteException,
			DivZeroException {
		if(b.equals(0)){
			throw new DivZeroException();
		}
		return a/b;
	}

}
