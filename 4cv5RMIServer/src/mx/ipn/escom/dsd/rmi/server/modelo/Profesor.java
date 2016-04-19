package mx.ipn.escom.dsd.rmi.server.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import mx.ipn.escom.dsd.rmi.interfaces.modelo.GradoAcademicoInterface;
import mx.ipn.escom.dsd.rmi.interfaces.modelo.ProfesorInterface;

@Entity
@Table(name = "profesor")
public class Profesor implements Serializable, ProfesorInterface {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_profesor")
	private Integer idProfesor;

	@Column(name = "nb_profesor")
	private String nombre;

	@Column(name = "tx_primer_ap")
	private String primerApellido;

	@Column(name = "tx_segundo_ap")
	private String segundoApellido;

	@Column(name = "tx_email")
	private String email;

	@ManyToOne
	@JoinColumn(name = "id_grado", referencedColumnName = "id_grado", insertable = false, updatable = false)
	private GradoAcademico grado;

	/**
	 * @return the idProfesor
	 */
	public Integer getIdProfesor() {
		return idProfesor;
	}

	/**
	 * @param idProfesor
	 *            the idProfesor to set
	 */
	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
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
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido
	 *            the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido
	 *            the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the grado
	 */
	@SuppressWarnings("unchecked")
	public GradoAcademicoInterface getGrado() {
		return (GradoAcademicoInterface) grado;
	}

	/**
	 * @param grado
	 *            the grado to set
	 */
	public void setGrado(GradoAcademicoInterface grado) {
		this.grado = (GradoAcademico) grado;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Profesor clone() {
		Profesor other = new Profesor();
		other.setIdProfesor(this.idProfesor);
		other.setNombre(this.nombre);
		other.setPrimerApellido(this.primerApellido);
		other.setSegundoApellido(this.segundoApellido);
		other.setEmail(this.email);
		other.setGrado(this.grado.clone());
		return other;
	}
}
