package com;

import java.util.Scanner;

public class Array5_ESJS {

	public static void main(String[] args) {
////		//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
//		respectivos precios. Muestra en consola la lista de productos y sus precios. 
//		Por lo menos 5 productos o artículos
		
		String producto []={"Iphone: $", "Samsung: $","Motorola: $","Xiaomi: $","Huawei: $" };
		 double precios[]={500,400,300,200,100};
		 System.out.println("Lista de Productos y sus precios");
		 for (int i=0;i<producto.length;i++)
		 {
		 System.out.println(producto[i]+ " "+ precios[i]); 
		}


	}

}
