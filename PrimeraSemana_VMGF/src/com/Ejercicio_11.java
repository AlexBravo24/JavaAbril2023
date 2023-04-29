package com;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		// paqueteria
		
		float peso;
		int zona = 0;
		float costototal;
		char z = 0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingresa el peso del paquete:  ");
		peso =sc.nextFloat();
		
		if (peso>5) {
		
			System.out.println("NO puede ser enviado, excedente de peso  ");
			
		}else if (peso<=5) {
			
		System.out.println("NUMEROS DE ZONA DE ENVIO ");
		System.out.println("1 AMERICA DEL NORTE, 2 AMERICA CENTRAL, 3 AMERICA DEL SUR, 4 EUROPA, 5 ASIA");
		System.out.println("Ingresa la zona del envio: ");
		zona =sc.nextInt();
		//z = zona.charAt(0);
					
			switch (zona) {  
			
			case 1:
						costototal= peso*2400;
						System.out.println("Costo total del envio es:"+costototal);
						break;
            case 2:
            			costototal= peso*2000;
            			System.out.println("Costo total del envio es:"+costototal);
            			break;
            case 3:			
            	        costototal= peso*2100;
			System.out.println("Costo total del envio es:"+costototal);
			            break;
			
            case 4: 
			            costototal= peso*1000;
			System.out.println("Costo total del envio es:"+costototal);
			            break;            			
            case 5: 
			            costototal= peso*1800;
			System.out.println("Costo total del envio es:"+costototal);
			            break;
               
            default:
	        System.out.println("Datos Incorrectos");

}
}
}
}
         


