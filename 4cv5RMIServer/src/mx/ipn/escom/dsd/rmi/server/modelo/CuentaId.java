package mx.ipn.escom.dsd.rmi.server.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CuentaId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id_profesor", nullable = false)
	private Integer idProfesor;

	@Column(name = "id_perfil", nullable = false)
	private Integer idPerfil;

	@Column(name = "id_cuenta", nullable = false)
	private Integer idCuenta;
	
	public CuentaId(Integer idProfesor, Integer idPerfil, Integer idCuenta) {
		super();
		this.idProfesor = idProfesor;
		this.idPerfil = idPerfil;
		this.idCuenta = idCuenta;
	}

	/**
	 * @return the idProfesor
	 */
	public Integer getIdProfesor() {
		return idProfesor;
	}

	/**
	 * @param idProfesor the idProfesor to set
	 */
	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	/**
	 * @return the idPerfil
	 */
	public Integer getIdPerfil() {
		return idPerfil;
	}

	/**
	 * @param idPerfil the idPerfil to set
	 */
	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	/**
	 * @return the idCuenta
	 */
	public Integer getIdCuenta() {
		return idCuenta;
	}

	/**
	 * @param idCuenta the idCuenta to set
	 */
	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}
}
