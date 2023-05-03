package com;

import java.util.Scanner;

public class Ciclos2_ESJS {

	public static void main(String[] args) {
//		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
//		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
//		23 x 95 = ???
		
		Scanner sc = new Scanner(System.in);
        int n;
        int e;
        
        System.out.print("Introduce la tabla de multiplicar que requieres: ");                                                         
        n = sc.nextInt();
        
        System.out.print("Hasta que iteracion deseas la tabla: ");                                                         
        e = sc.nextInt();
        
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=e; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }


	}

}
