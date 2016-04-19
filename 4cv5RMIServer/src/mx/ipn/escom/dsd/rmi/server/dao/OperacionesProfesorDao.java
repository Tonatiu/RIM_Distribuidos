package mx.ipn.escom.dsd.rmi.server.dao;

import org.hibernate.Session;

import mx.ipn.escom.dsd.rmi.server.modelo.Profesor;
import mx.ipn.escom.dsd.rmi.server.util.HibernateUtil;

public class OperacionesProfesorDao {

	public static Profesor findById(Integer idProfesor) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.getTransaction().begin();
		Profesor profesor = (Profesor) session.get(Profesor.class, idProfesor);
		session.getTransaction().commit();
		return profesor;
	}

}
