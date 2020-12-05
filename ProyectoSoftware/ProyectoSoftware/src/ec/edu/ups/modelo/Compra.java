package ec.edu.ups.modelo;

import java.util.ArrayList;

public class Compra {

	private ArrayList<Digital> digitales = new ArrayList<Digital>(); 
	private ArrayList<Impreso> impresos = new ArrayList<Impreso>(); 
	private Cliente cliente;

	public Compra() {
		super();
		cliente = new Cliente();
	}

	public boolean addDigital(Digital digital) {
		this.digitales.add(digital);
		return true;
	}
	
	public boolean addImpreso(Impreso impreso) {
		this.impresos.add(impreso);
		return true;
	}
	
	
	public boolean verificarSaldo(Cliente cliente, float precio) {
		
		if (cliente.getSaldo() > precio) {
			return true;
		}else {
			System.out.println("No dispone de saldo");
			return false;
		}
	}
	
	public boolean debitoSaldo(Cliente cliente, float precio) {
		
		if (cliente.getSaldo()>precio) {
			cliente.setSaldo(cliente.getSaldo()-precio);
			System.out.println("Debito actual del cliente: "+cliente.getNombre()+ " = "+cliente.getSaldo());
			return true;
		}
		return false;
	}

	public ArrayList<Digital> getDigitales() {
		return digitales;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setDigitales(ArrayList<Digital> digitales) {
		this.digitales = digitales;
	}

	public ArrayList<Impreso> getImpresos() {
		return impresos;
	}

	public void setImpresos(ArrayList<Impreso> impresos) {
		this.impresos = impresos;
	}
	
	
	
}
