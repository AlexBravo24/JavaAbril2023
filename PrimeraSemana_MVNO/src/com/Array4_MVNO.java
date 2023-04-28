package com;

public class Array4_MVNO {
	public static void main(String[] args) {
		/*Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}. 
		 * Guardar los valores de este array en otro array distinto pero con los valores invertidos, es decir,
		 * que el segundo array deberá tener los valores {5,4,3,2,1}.*/
		
		String utiles []={"pelota", "zapatilla","mochila","polo"};
		 double precios[]={35.5,89.60,45.99,25.70};
		 System.out.println("Lista de Productos y sus precios");
		 for (int u=0;u<utiles.length;u++){
		 System.out.println(utiles[u]+ " "+ precios[u]); 
		} 
	}

}
