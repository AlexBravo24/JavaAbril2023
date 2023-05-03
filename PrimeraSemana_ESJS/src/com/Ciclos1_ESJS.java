package com;

import java.util.Scanner;

public class Ciclos1_ESJS {

	public static void main(String[] args) {
		//  Programa un algoritmo que realice la tabla de multiplicar del 12
		
		Scanner sc = new Scanner(System.in);
        int n;
        // hace cualquier tabla de multiplicar
        
        System.out.print("Introduce la tabla de multiplicar que requieres: ");                                                         
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }

	}

}
