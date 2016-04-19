package mx.ipn.escom.dsd.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import mx.ipn.escom.dsd.rmi.interfaces.exception.DivZeroException;

public interface CalculadoraInterface extends Remote{
	public Integer suma(Integer a,Integer b) throws RemoteException;
	public Integer resta(Integer a,Integer b) throws RemoteException;
	public Integer producto(Integer a,Integer b) throws RemoteException;
	public Integer division(Integer a,Integer b) throws RemoteException,DivZeroException;
}
