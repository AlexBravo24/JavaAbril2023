package com;

public class Array5_YGVC {

	public static void main(String[] args) {
		/*Crea dos arrays, uno para mostrar n productos 
		 * y otro para mostrar sus respectivos precios. 
		 * Muestra en consola la lista de productos y sus precios. 
		 * Por lo menos 5 productos o artículos
		 * 
		 */
		
		//Productos y sus precios
		String[] productos = {"Mango", "Pera", "Piña", "Fresa", "Duranzno"};
		double[] precios = {29, 20.5, 30, 25, 38};
		
		//Mostrar productos y precios 
		System.out.println("Lista de productos:");
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i] + ": " + " $" + precios[i] );
		}

	}

}
