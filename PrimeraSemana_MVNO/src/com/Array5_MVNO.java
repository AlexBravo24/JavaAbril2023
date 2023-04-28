package com;

public class Array5_MVNO {
	public static void main(String[] args) {
		//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios. 
		//Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.
		
		String abarrotes []={"mayonesa", "crema","aceite","sal"};
		 double precios[]={35,20,42,10.5};
		 System.out.println("Lista de Productos y sus precios");
		 for (int i=0;i<abarrotes.length;i++){
		 System.out.println("El Producto es : " + abarrotes[i] + "  y su Precio es: "+ precios[i]); 
		} 
	}

}
