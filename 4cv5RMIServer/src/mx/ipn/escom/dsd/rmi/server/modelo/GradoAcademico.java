package mx.ipn.escom.dsd.rmi.server.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import mx.ipn.escom.dsd.rmi.interfaces.modelo.GradoAcademicoInterface;
import mx.ipn.escom.dsd.rmi.interfaces.modelo.ProfesorInterface;

@Entity
@Table(name = "grado_academico")
public class GradoAcademico implements Serializable, GradoAcademicoInterface {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_grado")
	private Integer id;

	@Column(name = "nb_grado")
	private String nombre;

	@Column(name = "ds_grado")
	private String descripcion;

	@OneToMany(mappedBy = "grado")
	private List<Profesor> listProfesores;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends ProfesorInterface> List<T> getListProfesores() {
		return (List<T>) listProfesores;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends ProfesorInterface> void setListProfesores(
			List<T> listProfesores) {
		this.listProfesores = (List<Profesor>) listProfesores;
	}

	public GradoAcademico clone() {
		GradoAcademico other = new GradoAcademico();
		other.id = this.id;
		other.nombre = this.nombre;
		other.descripcion = this.descripcion;
		return other;

	}

}
