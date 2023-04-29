package com;

public class Arrays5_JIMU {

	public static void main(String[] args) {
		/*
		 * 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		respectivos precios. Muestra en 
		consola la lista de productos y sus precios. 
		Por lo menos 5 productos o artículos
		 */
		
		String [] producto = {"agua", "lapiz", "ventilador", "balon", "camisa"};
		double [] precios = {25.5, 45.0, 23.0, 87.0, 96.0};
		
		for (int i = 0; i<6; i++) {
			//System.out.println("El precio de " );

		System.out.println("El precio de " +producto [i]+ " es "  +precios [i]);
		}
		
		
	}

}
