package ec.edu.ups.modelo;

import java.util.ArrayList;

public class Digital extends LibroGenerico{
	
	private ArrayList<Digital> digitales = new ArrayList<Digital>(); 
	
	public Digital(String titulo, String autor, String edicion, float precio) {
		super(titulo,autor,edicion,precio);
	}
	
	@Override
	public float CalcularComision() {
		return (getPrecio()*2)/100;
	}

	@Override
	public float CalcularEnvio() {
		return 0;
	}
	
	public float precioFinal() {
		return super.precioFinal();
	}

	public String getTitulo() {
		return super.getTitulo();
	}


	public void setTitulo(String titulo) {
		super.setTitulo(titulo);
	}


	public String getAutor() {
		return super.getAutor();
	}


	public void setAutor(String autor) {
		super.setAutor(autor);
	}


	public String getEdicion() {
		return super.getEdicion();
	}


	public void setEdicion(String edicion) {
		super.setEdicion(edicion);
	}


	public float getPrecio() {
		return super.getPrecio();
	}


	public void setPrecio(float precio) {
		super.setPrecio(precio);
	}

	public ArrayList<Digital> getDigitales() {
		return digitales;
	}

	public void setDigitales(ArrayList<Digital> digitales) {
		this.digitales = digitales;
	}
	
	public void addDigitales(Digital digital) {
		this.digitales.add(digital);
	}
	
	
}
