package File;

public class Pet {

    private String Case =null;
    private String Especie =null;
    private String Tamaño = null;
    private String Localidad =null;
    private String Direccion=null;
    private String Nombre =null;
    private String Telefono =null;
    private String Email =null;
    private String Comentarios =null;
    private String fecha=null;


    public Pet(String case1, String especie, String tamaño, String localidad, String direccion, String nombre,
			String telefono, String email, String comentarios, String fecha) {
		super();
		Case = case1;
		Especie = especie;
		Tamaño = tamaño;
		Localidad = localidad;
		Direccion = direccion;
		Nombre = nombre;
		Telefono = telefono;
		Email = email;
		Comentarios = comentarios;
		this.fecha = fecha;
	}


	public Pet(){


    }


	/**
	 * @return the case
	 */
	public String getCase() {
		return Case;
	}


	/**
	 * @param case1 the case to set
	 */
	public void setCase(String case1) {
		Case = case1;
	}


	/**
	 * @return the especie
	 */
	public String getEspecie() {
		return Especie;
	}


	/**
	 * @param especie the especie to set
	 */
	public void setEspecie(String especie) {
		Especie = especie;
	}


	/**
	 * @return the tamaño
	 */
	public String getTamaño() {
		return Tamaño;
	}


	/**
	 * @param tamaño the tamaño to set
	 */
	public void setTamaño(String tamaño) {
		Tamaño = tamaño;
	}


	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return Localidad;
	}


	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}


	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return Direccion;
	}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return Telefono;
	}


	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}


	/**
	 * @return the comentarios
	 */
	public String getComentarios() {
		return Comentarios;
	}


	/**
	 * @param comentarios the comentarios to set
	 */
	public void setComentarios(String comentarios) {
		Comentarios = comentarios;
	}


	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}


	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

   
}
