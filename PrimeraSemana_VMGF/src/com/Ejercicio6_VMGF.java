package com;

import java.util.Scanner;

public class Ejercicio6_VMGF {

	public static void main(String[] args) {
		//La asociaci�n de vinicultores tiene 
		//como pol�tica fijar un precio inicial 
		//al kilo de uva,
		
		char uva;
		int tama�o;
		float uvaa;
		float uvab;
		double preciofinal;
				
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Ingresa tipo de uva a vender A o� B:");
		uva=sc.nextLine().charAt(0);
		
		System.out.println("Ingresa tipo de Tama�o de uva a vender 1 o� 2:");
		tama�o=sc.nextInt();
		
	
		if ((uva=='A')|| (uva=='a') && (tama�o==1)) {
			System.out.println("Ingresa el Precio Inicial Uva Tipo A:");
			uvaa=sc.nextFloat();
			preciofinal=uvaa+.020;
		System.out.println("El precio a pagar por la uva Tipo A y Tama�o 1 es de: " + preciofinal); 
		
		}else if ((uva=='A')|| (uva=='a') && (tama�o==2)) {
			System.out.println("Ingresa el Precio Inicial Uva Tipo A:");
			uvaa=sc.nextFloat();
			preciofinal=uvaa+.030;
		System.out.println("El precio a pagar por la uva Tipo A y Tama�o 2 es de: " + preciofinal); 
		
		}else if ((uva=='B')|| (uva=='b') && (tama�o==1)) {
			System.out.println("Ingresa el Precio Inicial Uva Tipo B:");
			uvab=sc.nextFloat();
			preciofinal=uvab-.030;
		System.out.println("El precio a pagar por la uva Tipo B y Tama�o 1 es de: " +preciofinal); 
		
		}else if((uva=='B')|| (uva=='b') && (tama�o==2)) {
			System.out.println("Ingresa el Precio Inicial Uva Tipo B:");
			uvab=sc.nextFloat();
			preciofinal=uvab-.050;
		System.out.println("El precio a pagar por la uva Tipo B y Tama�o 2 es de: " +preciofinal); 
		
		}else System.out.println("Datos Incorrectos a los solicitados");
	}

}
