package ec.edu.ups.modelo;

import java.util.ArrayList;

public class Cliente extends Persona{

	private ArrayList<Compra> compras; 
	private float saldo;
	
	public Cliente(String nombre, String apellido, String ci, String telefono, String correo,float saldo) {
		super(nombre, apellido, ci, telefono, correo);
		this.compras = new ArrayList<Compra>();
		this.saldo = saldo;
	}

	public Cliente() {
		super();
		this.compras = new ArrayList<Compra>();
	}

	public ArrayList<Compra> getCompras() {
		return compras;
	}

	public void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;
	}
	
	public boolean addCompras(Compra compra) {
		this.compras.add(compra);
		return true;
	}
	
	public boolean recargarSaldo(float valorRecarga) {
		this.saldo = getSaldo()+valorRecarga;
		return true;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	public String getNombre() {
		return super.getNombre();
	}


	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}


	public String getApellido() {
		return super.getApellido();
	}


	public void setApellido(String apellido) {
		super.setApellido(apellido);
	}


	public String getCi() {
		return super.getCi();
	}


	public void setCi(String ci) {
		super.setCi(ci);
	}


	public String getTelefono() {
		return super.getTelefono();
	}


	public void setTelefono(String telefono) {
		super.setTelefono(telefono);
	}


	public String getCorreo() {
		return super.getCorreo();
	}


	public void setCorreo(String correo) {
		super.setCorreo(correo);
	}

	@Override
	public String toString() {
		return "Cliente [compras=" + compras + ", saldo=" + saldo + ", getCompras()=" + getCompras() + ", getSaldo()="
				+ getSaldo() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getCi()="
				+ getCi() + ", getTelefono()=" + getTelefono() + ", getCorreo()=" + getCorreo() + "]";
	}

	
	
}
