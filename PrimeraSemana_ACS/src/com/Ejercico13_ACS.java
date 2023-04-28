package com;

import java.util.Scanner;

public class Ejercico13_ACS {

	public static void main(String[] args) {
		
		//Una institución benéfica recibe anualmente
		//una donación proveniente de Europa 
		
		 Scanner sc = new Scanner (System.in);
		
		float donacion,csalud,cniños,bolsa;
			  
			  System.out.print("Ingrese monto de donación: ");
			  donacion = sc.nextFloat();
			  
			  if(donacion>=10000) {
			   csalud = donacion * 0.30f;
			   cniños = donacion * 0.50f;
			   bolsa = donacion - (csalud+cniños);
			   
			   System.out.println("El monto para el centro de salud es de: "+csalud);
			   System.out.println("\nEl monto para el comedor de niños es de: "+cniños);
			   System.out.println("\nEl monto para la bolsa: "+bolsa);
			  }
			  else if(donacion>=1 && donacion<10000) {
			   csalud = donacion * 0.25f;
			   cniños = donacion * 0.60f;
			   bolsa = donacion - (csalud+cniños);
			   
			   System.out.println("El monto para el centro de salud es de: "+csalud);
			   System.out.println("\nEl monto para el comedor de niños es de: "+cniños);
			   System.out.println("\nEl monto para la bolsa: "+bolsa);
			  }
			  else {
			   System.out.println("ERROR, fuera de rango");
			  }
			  
	}
}