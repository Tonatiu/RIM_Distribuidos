package mx.ipn.escom.dsd.rmi.server.bs;

import java.util.List;

import mx.ipn.escom.dsd.rmi.interfaces.modelo.ProfesorInterface;
import mx.ipn.escom.dsd.rmi.server.dao.OperacionesProfesorDao;
import mx.ipn.escom.dsd.rmi.server.modelo.Profesor;

public class OperacionesProfesorBs {
	public static Profesor findById(Integer idProfesor){
		Profesor profesor = OperacionesProfesorDao.findById(idProfesor); 
		return profesor.clone();
	}

	public static List<ProfesorInterface> obtenerProfesores() {
		return null;
	}

	public static List<ProfesorInterface> obtenerProfesores(Integer idGrado) {
		return null;
	}
	
	public static ProfesorInterface registrar(ProfesorInterface profesor) {
		return null;
	}

	public static ProfesorInterface actualizar() {
		return null;
	}

	public static void eliminar(Integer idProfesor) {
		
	}
}
