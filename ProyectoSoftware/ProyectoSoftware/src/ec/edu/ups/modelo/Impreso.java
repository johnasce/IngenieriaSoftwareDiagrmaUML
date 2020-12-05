package ec.edu.ups.modelo;

import java.util.ArrayList;

public class Impreso extends LibroGenerico{

	
	private ArrayList<Impreso> impresos = new ArrayList<Impreso>();
	public Impreso(String titulo, String autor, String edicion, float precio) {
		super(titulo,autor,edicion,precio);
	}
	
	
	@Override
	public float CalcularComision() {
		return (getPrecio()*2)/100;
	}

	@Override
	public float CalcularEnvio() {
		return 20;
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


	public ArrayList<Impreso> getImpresos() {
		return impresos;
	}


	public void setImpresos(ArrayList<Impreso> impresos) {
		this.impresos = impresos;
	}
	
	public void addImpresos(Impreso impreso) {
		this.impresos.add(impreso);
	}

}
