package ec.edu.ups.modelo;

public class Persona {
	private String nombre;
	private String apellido;
	private String ci;
	private String telefono;
	private String correo;
	
	
	public Persona(String nombre, String apellido, String ci, String telefono, String correo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.telefono = telefono;
		this.correo = correo;
	}


	public Persona() {
		super();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCi() {
		return ci;
	}


	public void setCi(String ci) {
		this.ci = ci;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", ci=" + ci + ", telefono=" + telefono
				+ ", correo=" + correo + "]";
	}
}
