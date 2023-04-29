package com;

import java.util.Scanner;

public class Ejercicio6_VMGF {

	public static void main(String[] args) {
		//La asociación de vinicultores tiene 
		//como política fijar un precio inicial 
		//al kilo de uva,
		
		char uva;
		int tamaño;
		float uvaa;
		float uvab;
		double preciofinal;
				
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Ingresa tipo de uva a vender A o´ B:");
		uva=sc.nextLine().charAt(0);
		
		System.out.println("Ingresa tipo de Tamaño de uva a vender 1 o´ 2:");
		tamaño=sc.nextInt();
		
	
		if ((uva=='A')|| (uva=='a') && (tamaño==1)) {
			System.out.println("Ingresa el Precio Inicial Uva Tipo A:");
			uvaa=sc.nextFloat();
			preciofinal=uvaa+.020;
		System.out.println("El precio a pagar por la uva Tipo A y Tamaño 1 es de: " + preciofinal); 
		
		}else if ((uva=='A')|| (uva=='a') && (tamaño==2)) {
			System.out.println("Ingresa el Precio Inicial Uva Tipo A:");
			uvaa=sc.nextFloat();
			preciofinal=uvaa+.030;
		System.out.println("El precio a pagar por la uva Tipo A y Tamaño 2 es de: " + preciofinal); 
		
		}else if ((uva=='B')|| (uva=='b') && (tamaño==1)) {
			System.out.println("Ingresa el Precio Inicial Uva Tipo B:");
			uvab=sc.nextFloat();
			preciofinal=uvab-.030;
		System.out.println("El precio a pagar por la uva Tipo B y Tamaño 1 es de: " +preciofinal); 
		
		}else if((uva=='B')|| (uva=='b') && (tamaño==2)) {
			System.out.println("Ingresa el Precio Inicial Uva Tipo B:");
			uvab=sc.nextFloat();
			preciofinal=uvab-.050;
		System.out.println("El precio a pagar por la uva Tipo B y Tamaño 2 es de: " +preciofinal); 
		
		}else System.out.println("Datos Incorrectos a los solicitados");
	}

}
