package Dulceria;

public class Tienda {
	private String nombre;
	private String direccion;
	private Bebida almacen_bebidas[];
	private Dulce_Unidad almacen_dulces[];
	private Dulce_Paquete almacen_paquetes[];
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public String getDirreccion() {
		return direccion;
	}
	public void setDirreccion(String dirreccion) {
		this.direccion = dirreccion;
	}
	
	
	public Dulce_Unidad[] getAlmacen_dulces() {
		return almacen_dulces;
	}
	public void setAlmacen_dulces(Dulce_Unidad[] almacen_dulces) {
		this.almacen_dulces = almacen_dulces;
	}

	
	public Dulce_Paquete[] getAlmacen_paquetes() {
		return almacen_paquetes;
	}
	public void setAlmacen_paquetes(Dulce_Paquete[] almacen_paquetes) {
		this.almacen_paquetes = almacen_paquetes;
	}

	
	public Bebida[] getAlmacen_bebidas() {
		return almacen_bebidas;
	}
	public void setAlmacen_bebidas(Bebida[] almacen_bebidas) {
		this.almacen_bebidas = almacen_bebidas;
	}
	
	
	public Tienda() {
		
		almacen_bebidas = new Bebida[10];
		for(int i = 0; i<almacen_bebidas.length;i++) {
			almacen_bebidas[i] = new Bebida();
		}
		
		almacen_dulces = new Dulce_Unidad[10];
		for(int i = 0;i<almacen_dulces.length;i++) {
			almacen_dulces[i] = new Dulce_Unidad();
		}
		
		almacen_paquetes = new Dulce_Paquete[5];
		for(int i = 0;i<almacen_paquetes.length;i++) {
			almacen_paquetes[i] = new Dulce_Paquete();
		}
	}
	
	public Tienda(String nombre,String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		
		almacen_bebidas = new Bebida[10];
		for(int i = 0; i<almacen_bebidas.length;i++) {
			almacen_bebidas[i] = new Bebida();
		}
		crear_bebidas();
		
		almacen_dulces = new Dulce_Unidad[10];
		for(int i = 0;i<almacen_dulces.length;i++) {
			almacen_dulces[i] = new Dulce_Unidad();
		}
		crear_dulce_unidad();
		
		almacen_paquetes = new Dulce_Paquete[5];
		for(int i = 0;i<almacen_paquetes.length;i++) {
			almacen_paquetes[i] = new Dulce_Paquete();
		}
		crear_paquete();
	}



	public void crear_bebidas() {
		almacen_bebidas[0] = new Bebida("Colombiana","Gaseosa","Bebida azucarada, sabor artifical colombiana", 600,877,9878); 
		almacen_bebidas[1] = new Bebida("Sprite","Gaseosa","Bebida azucarada, sabor artifical efervescente", 600,877,9878); 
		almacen_bebidas[2] = new Bebida("Coca Cola","Gaseosa","Bebida azucarada, sabor artifical cola", 600,877,9878); 
		almacen_bebidas[3] = new Bebida("Leche achocolatada","Leche","Leche con sabor artificial chocolate", 600,877,9878); 
		almacen_bebidas[4] = new Bebida("Jugo Hit Piña Naranja","Jugo","Bebida con sabor artificial a Piña Naranja", 600,877,9878); 
		almacen_bebidas[5] = new Bebida("Jugo Hit Mora","Jugo","Bebida con sabor artificial a Mora", 600,877,9878); 
		almacen_bebidas[6] = new Bebida("Jugo Hit Frutos Tropicales","Jugo","Bebida con sabor artificial a Frutos Tropicales", 600,877,9878); 
		almacen_bebidas[7] = new Bebida("Jugo Hit Mango","Jugo","Bebida con sabor artificial a Mango", 600,877,9878); 
		almacen_bebidas[8] = new Bebida("Agua con gas Manzana","Agua","Agua con gas saborizada a Manzana", 600,877,9878); 
		almacen_bebidas[9] = new Bebida("Agua con gas Frutos Rojos","Agua","Agua con gas saborizada a Frutos Rojos", 600,877,9878); 
		
			
	}
	
	public void crear_dulce_unidad() {
		almacen_dulces[0] = new Dulce_Unidad("Gusanitos","Gomita","Pequeña goma azucarada de colores con azucar",5245,43);
		almacen_dulces[1] = new Dulce_Unidad("Jet","Chocolate","Chocolatina tradicional Colombiana con leche",5245,43);
		almacen_dulces[2] = new Dulce_Unidad("Supercoco","Caramelo","Bombon con trozos de coco 100% natural",5245,43);
		almacen_dulces[3] = new Dulce_Unidad("Chupetin","Caramelo","Caramelo duro, con variedad de sabores",5245,43);
		almacen_dulces[4] = new Dulce_Unidad("Malvisco","Gomita","Es una gomita de colores masticable suave",5245,43);
		almacen_dulces[5] = new Dulce_Unidad("Chocoramo","Torta","Bizcocho de vainilla cubierto de chocolate",5245,43);
		almacen_dulces[6] = new Dulce_Unidad("Barrilete","Caramelo","Caramelo masticable de colores",5245,43);
		almacen_dulces[7] = new Dulce_Unidad("Cintas","Gomita","Gomitas arcoiris azucaradas",5245,43);
		almacen_dulces[8] = new Dulce_Unidad("Burbuja Jet","Chocolate","Esfera de Chocolate con relleno",5245,43);
		almacen_dulces[9] = new Dulce_Unidad("Goma Feliz","Gomita","Goma artesanal hecha con alcohol",5245,43);	
	}
	
	public void crear_paquete() {
		almacen_paquetes[0] = new Dulce_Paquete("Gusanitos","gomitas","Pequeña goma azucarada de colores con azucar",100,1234,13);
		almacen_paquetes[0] = new Dulce_Paquete("Jets","Chocolates","Chocolatina tradicional Colombiana con leche",20,1234,13);
		almacen_paquetes[0] = new Dulce_Paquete("Supercocos","Caramelo","Bombon con trozos de coco 100% natural",50,1234,13);
		almacen_paquetes[0] = new Dulce_Paquete("Barriletes","Caramelo","Caramelo masticable de colores",25,1234,13);
		almacen_paquetes[0] = new Dulce_Paquete("Chupetin","Caramelo","Caramelo duro, con variedad de sabores",25,1234,13);
	}









}




