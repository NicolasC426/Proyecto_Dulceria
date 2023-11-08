package Dulceria;
import java.util.Scanner;


public class Sistema {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Tienda tienda = new Tienda("Gomitas donde Jhoe","Abajo del puente");
		
		System.out.println("sis"+tienda.getAlmacen_bebidas()[4].getDescripcion());
		
		System.out.println("Bienvenido a la dulcera" + tienda.getNombre() + "estamos ubicados en " + tienda.getDirreccion()
				+ "Gracias por preferirnos por favor para iniciar su proceso de compra digite los siguiente datos");
		System.out.println("Escriba su nombre");
		String nombre = sc.next();
		System.out.println("Escriba su edad");
		int edad = sc.nextInt();
		System.out.println("EScriba su numero de identificacion");
		int id = sc.nextInt();
		System.out.println("Escriba el presupuesto con el que cuenta");
		double presupuesto = sc.nextDouble();
		
		Cliente c1 = new Cliente(nombre,edad,id,presupuesto);
		System.out.println("El cliente ha sido creado con los siguientes datos:\n" +c1.toString());
	}

}
