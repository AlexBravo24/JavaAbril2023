package com;

public class Arrays5_CALR {

	public static void main(String[] args) {
		 String [] productos = {"mango", "manzana", "mamey", "fresas", "platanos"};
		 double [] precios = {50.5, 35, 55.60, 70, 20};
		 
		 System.out.println("Lista de productos y sus costos");
		 for(int i = 0; i < productos.length; i++) {
			 System.out.println(productos[i] + ": " + " $" + precios[i]);
		 }
	}

}
