package com;

import java.util.Scanner;

public class Ciclos11_AHP {

	public static void main(String[] args) {
		/*11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
ancho y el alto. Ejemplo: 8 x 8 
		 * 
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.print("Introduce el ancho del cuadrado: ");
		int ancho = input.nextInt();
        
        System.out.print("Introduce la altura del cuadrado: ");
        int altura = input.nextInt();
		
		
		
		for (int i = 0; i < altura; i++) {
			System.out.println();
			for (int j = 0; j < ancho; j++) {
				if (i == 0 || i == altura -1 || j == 0 || j == ancho -1) {
				System.out.print(" * ");
				
			}else {
				System.out.print(" * ");
				input.close();
			}
			}
		}
	}
}
			
			


//		 Scanner input = new Scanner(System.in) ;
//		 for (int i = 0; i < 8; i++) {
//			 for (int j = 0; j < 8; j++) {
//			System.out.print(" * ");
//			 }
//			 System.out.println(" ");
//		 }
//	}	
//		}





//		Scanner input = new Scanner(System.in);
//		System.out.print("Introduce el numero de * : ");
//		int num=input.nextInt();
//		
//		
//		System.out.println("--------\n");
//	for (int i = 0; i < num; i++) {
//		for (int j = 0; j < num; j++) {
//			System.out.println(" * ");
//		}
//		System.out.print("\n");
//			
//		}
//	System.out.print("\n * \t");
//	}
//}