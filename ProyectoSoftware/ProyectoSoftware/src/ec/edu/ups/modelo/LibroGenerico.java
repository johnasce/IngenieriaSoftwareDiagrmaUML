package ec.edu.ups.modelo;

public abstract class LibroGenerico {

	private String titulo;
	private String Autor;
	private String edicion;
	private float precio;

	
	
	public LibroGenerico(String titulo, String autor, String edicion, float precio) {
		super();
		this.titulo = titulo;
		Autor = autor;
		this.edicion = edicion;
		this.precio = precio;
	}
	
	

	public float precioFinal() {
		float precioTotal = this.getPrecio() + this.CalcularComision()+this.CalcularEnvio();
		return precioTotal;
	};
	
	public abstract float CalcularComision();
	public abstract float CalcularEnvio();
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return Autor;
	}


	public void setAutor(String autor) {
		Autor = autor;
	}


	public String getEdicion() {
		return edicion;
	}


	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
}
