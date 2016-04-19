package mx.ipn.escom.dsd.rmi.interfaces.modelo;

import java.util.List;

public interface GradoAcademicoInterface {
	/**
	 * @return the id
	 */
	public Integer getId();

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id);

	/**
	 * @return the nombre
	 */
	public String getNombre();

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre);

	/**
	 * @return the descripcion
	 */
	public String getDescripcion();

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion);
	
	/**
	 * @return the listProfesores
	 */
	public <T extends ProfesorInterface> List<T> getListProfesores();

	/**
	 * @param listProfesores the listProfesores to set
	 */
	public <T extends ProfesorInterface> void setListProfesores(List<T> listProfesores);
}
