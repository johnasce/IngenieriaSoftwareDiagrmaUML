package ec.edu.ups.vista;

import java.util.ArrayList;
import java.util.Scanner;
import ec.edu.ups.modelo.Biblioteca;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Compra;
import ec.edu.ups.modelo.Digital;
import ec.edu.ups.modelo.Impreso;

public class Principal {
	
	public static ArrayList<Digital> digitales = new ArrayList<Digital>();
	public static ArrayList<Impreso> impresos = new ArrayList<Impreso>();
	public static Biblioteca bib= new Biblioteca("Libreria Nuevas Novelas", "Gran Colombia 2-33 y Hermano Miguel", "072455987");
	
	public void crearProductosDigitales() {
		digitales.add(new Digital("El principito", "desconocido", "tercera edicion", 25));
		digitales.add(new Digital("Flor de cerezo", "desconocido", "tercera edicion", 25));
		digitales.add(new Digital("Calculo diferencial", "James Steawer", "tercera edicion", 50));
		digitales.add(new Digital("Algebra Lineal", "Rodolfo Bojorque", "tercera edicion", 35));
		digitales.add(new Digital("Calculo Integral", "Walter Verdugo", "tercera edicion", 45));
	}
	
	public void crearProductosImpresos() {
		impresos.add(new Impreso("El principito", "desconocido", "tercera edicion", 25));
		impresos.add(new Impreso("Flor de cerezo", "desconocido", "tercera edicion", 25));
		impresos.add(new Impreso("Calculo diferencial", "James Steawer", "tercera edicion", 50));
		impresos.add(new Impreso("Algebra Lineal", "Rodolfo Bojorque", "tercera edicion", 35));
		impresos.add(new Impreso("Calculo Integral", "Walter Verdugo", "tercera edicion", 45));
	}
	
	public static void main(String[] args) {
		
		
		Principal p = new Principal();
		p.crearProductosDigitales();
		p.crearProductosImpresos();
		ArrayList<Cliente> clientes;
		Compra compra;
		String nombre,apellido,telefono,correo,cedula,ce;
		float saldo;
		String repetir="si";
		
		do {
			System.out.println("Menu:\n1)Crear cliente\n2)Recargar saldo cliente\n3)Modificar Cliente\n4)Crear Compra\n5)Salir\nIngrese opcion:");
			Scanner teclado = new Scanner(System.in);
			Scanner tecNumerico = new Scanner(System.in);
		
			int menu= tecNumerico.nextInt();
			
			switch (menu){
			
			case 1:
				System.out.println("Ingrese Nombre");
				nombre = teclado.nextLine();
				System.out.println("Ingrese Apellido");
				apellido = teclado.nextLine();
				System.out.println("Ingrese Cedula");
				cedula = teclado.nextLine();
				System.out.println("Ingrese Telefono");
				telefono = teclado.nextLine();
				System.out.println("Ingrese correo electronico");
				correo = teclado.nextLine();
				System.out.println("Ingrese saldo");
				saldo = tecNumerico.nextFloat();
				Cliente cliente = new Cliente(nombre, apellido, cedula, telefono, correo, saldo);
				bib.addClientes(cliente);
				System.out.println("Cliente: "+cliente.toString());
				break;
			case 2:
				float r;
				System.out.println("Ingrese la cedula");
				String c = teclado.nextLine();
				clientes = bib.getClientes();
				for (Cliente cliente2 : clientes) {
					if (c.equals(cliente2.getCi())) {
						System.out.println("Ingrese saldo a recargar");
						r = tecNumerico.nextFloat();
						cliente2.recargarSaldo(r);
						System.out.println("El saldo del cliente: "+cliente2.getNombre()+" = "+cliente2.getSaldo());
					}
				}
				
				break;
			case 3:
				
				System.out.println("Ingrese la cedula");
				ce = teclado.nextLine();
				clientes = bib.getClientes();
				for (Cliente cliente3 : clientes) {
					if (ce.equals(cliente3.getCi())) {
						System.out.println("Ingrese Nombre");
						nombre = teclado.nextLine();
						cliente3.setNombre(nombre);
						
						System.out.println("Ingrese Apellido");
						apellido = teclado.nextLine();
						cliente3.setApellido(apellido);

						System.out.println("Ingrese Cedula");
						cedula = teclado.nextLine();
						cliente3.setCi(cedula);
						
						System.out.println("Ingrese Telefono");
						telefono = teclado.nextLine();
						cliente3.setTelefono(telefono);

						System.out.println("Ingrese correo electronico");
						correo = teclado.nextLine();
						cliente3.setCorreo(correo);
						
						System.out.println("Cliente Actualizado: "+cliente3.toString());					}
				}
				
				break;
			case 4:
				String titulo;
				String op;
				System.out.println("Ingrese la cedula");
				ce = teclado.nextLine();
				compra = new Compra();
				
				clientes = bib.getClientes();
				for (Cliente cliente3 : clientes) {
					if (ce.equals(cliente3.getCi())) {
						
						System.out.println("Quieres comprar textos digitales?S/N");
						op = teclado.nextLine();
						if (op.equalsIgnoreCase("S")) {
							do {
								for (Digital dg : digitales) {
									System.out.println("Libros digitales de la empresa disponibles");
									System.out.println("Titulo: "+dg.getTitulo()+" Autor: "+dg.getAutor());
								}
								
								System.out.println("Ingrese el nombre del libro que desea: ");
								titulo = teclado.nextLine();
								
								for (Digital dg : digitales) {
									if (titulo.equalsIgnoreCase(dg.getTitulo())) {
										if (compra.verificarSaldo(cliente3,dg.getPrecio())==true) {
											compra.debitoSaldo(cliente3,dg.getPrecio());
											compra.addDigital(dg);
											
										}
									}
								}
								
								
								System.out.println("Quieres seguir comprando textos digitales? S/N");
								op = teclado.nextLine();
	 						} while (op.equalsIgnoreCase("S")==true);
						}
						
						System.out.println("Quieres comprar textos impresos?S/N");
						op = teclado.nextLine();
						if (op.equalsIgnoreCase("S")) {
							do {
								for (Impreso imp : impresos) {
									System.out.println("Libros digitales de la empresa disponibles");
									System.out.println("Titulo: "+imp.getTitulo()+" Autor: "+imp.getAutor());
								}
								
								System.out.println("Ingrese el nombre del libro que desea: ");
								titulo = teclado.nextLine();
								
								for (Impreso imp : impresos) {
									if (titulo.equalsIgnoreCase(imp.getTitulo())) {
										if (compra.verificarSaldo(cliente3,imp.getPrecio())==true) {
											compra.debitoSaldo(cliente3,imp.getPrecio());
											compra.addImpreso(imp);
											
										}
									}
								}
								
								
								System.out.println("Quieres seguir comprando textos digitales ? S/N");
								op = teclado.nextLine();
	 						} while (op.equalsIgnoreCase("S")==true);
						}
						compra.setCliente(cliente3);
						System.out.println("Compra del cliente: "+cliente3.getNombre()+" detalles = "+compra.toString());
					}
				}
				break;
			case 5:
				//opcion de salida
				System.out.println("Desea probar de nuevo nuestro sistema....si/no");
				repetir = teclado.nextLine();
				break;
			default:
				break;
		}
			
		} while (repetir.equalsIgnoreCase("si")==true);
		
		
	}
}
