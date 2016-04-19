package mx.ipn.escom.dsd.rmi.interfaces.modelo;

public interface ProfesorInterface {
	/**
	 * @return the idProfesor
	 */
	public Integer getIdProfesor();

	/**
	 * @param idProfesor
	 *            the idProfesor to set
	 */
	public void setIdProfesor(Integer idProfesor);

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
	 * @return the primerApellido
	 */
	public String getPrimerApellido();

	/**
	 * @param primerApellido
	 *            the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido);

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido();

	/**
	 * @param segundoApellido
	 *            the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido);

	/**
	 * @return the email
	 */
	public String getEmail();

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email);
	
	/**
	 * @return the grado
	 */
	public <T extends GradoAcademicoInterface> T getGrado();

	/**
	 * @param grado the grado to set
	 */
	public <T extends GradoAcademicoInterface> void setGrado(T grado);
}
