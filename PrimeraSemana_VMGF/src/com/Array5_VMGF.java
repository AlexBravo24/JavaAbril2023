package com;

public class Array5_VMGF {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos
		//y otro para mostrar sus respectivos precios. Muestra 
		//en consola la lista de productos y sus precios. Por lo
		//menos 5 productos o artículos.
		
		String prod [] = {"producto1", "producto2", "producto3", "producto4", "producto5"};
		double precios[] = {10, 20, 30, 40, 50};
		System.out.print("Productos y sus precios\n");
		for(int i =0; i< prod.length; i++) {
			System.out.println(prod[i] + " " + precios[i]);
			
		}
		
		

	}

}
