package com;

import java.util.Scanner;

public class Ejercico13_ACS {

	public static void main(String[] args) {
		
		//Una instituci�n ben�fica recibe anualmente
		//una donaci�n proveniente de Europa 
		
		 Scanner sc = new Scanner (System.in);
		
		float donacion,csalud,cni�os,bolsa;
			  
			  System.out.print("Ingrese monto de donaci�n: ");
			  donacion = sc.nextFloat();
			  
			  if(donacion>=10000) {
			   csalud = donacion * 0.30f;
			   cni�os = donacion * 0.50f;
			   bolsa = donacion - (csalud+cni�os);
			   
			   System.out.println("El monto para el centro de salud es de: "+csalud);
			   System.out.println("\nEl monto para el comedor de ni�os es de: "+cni�os);
			   System.out.println("\nEl monto para la bolsa: "+bolsa);
			  }
			  else if(donacion>=1 && donacion<10000) {
			   csalud = donacion * 0.25f;
			   cni�os = donacion * 0.60f;
			   bolsa = donacion - (csalud+cni�os);
			   
			   System.out.println("El monto para el centro de salud es de: "+csalud);
			   System.out.println("\nEl monto para el comedor de ni�os es de: "+cni�os);
			   System.out.println("\nEl monto para la bolsa: "+bolsa);
			  }
			  else {
			   System.out.println("ERROR, fuera de rango");
			  }
			  
	}
}