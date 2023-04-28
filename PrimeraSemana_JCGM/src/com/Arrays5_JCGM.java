package com;

public class Arrays5_JCGM {

	public static void main(String[] args) {
		
		
		
		String[] productos = {"Leche", "Huevos", "Pan", "Queso", "Café"};
        double[] precios = {296.0, 102.0, 12.0, 85.0, 256.23};

        System.out.println("Lista de productos:");

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }

	}

}
