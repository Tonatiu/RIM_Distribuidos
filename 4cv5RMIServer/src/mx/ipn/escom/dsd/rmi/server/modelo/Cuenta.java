package mx.ipn.escom.dsd.rmi.server.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta")
public class Cuenta {
	@EmbeddedId
	private CuentaId cuentaId;

	@Column(name = "id_profesor", insertable = false, updatable = false)
	private Integer idProfesor;

	@Column(name = "id_perfil", insertable = false, updatable = false)
	private Integer idPerfil;

	@Column(name = "id_cuenta", insertable = false, updatable = false)
	private Integer idCuenta;

	@Column(name = "fh_inicio")
	private Date inicio;

	@Column(name = "fh_fin")
	private Date fin;

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
	 * @return the idPerfil
	 */
	public Integer getIdPerfil() {
		return idPerfil;
	}

	/**
	 * @param idPerfil
	 *            the idPerfil to set
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
	 * @param idCuenta
	 *            the idCuenta to set
	 */
	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}

	/**
	 * @return the inicio
	 */
	public Date getInicio() {
		return inicio;
	}

	/**
	 * @param inicio
	 *            the inicio to set
	 */
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	/**
	 * @return the fin
	 */
	public Date getFin() {
		return fin;
	}

	/**
	 * @param fin
	 *            the fin to set
	 */
	public void setFin(Date fin) {
		this.fin = fin;
	}
}
