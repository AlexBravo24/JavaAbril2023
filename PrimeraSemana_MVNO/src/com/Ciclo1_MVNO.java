package com;

import java.util.Scanner;

public class Ciclo1_MVNO {
	public static void main(String[] args) {
		//- Programa un algoritmo que realice la tabla de multiplicar del 12
		
		Scanner leer=new Scanner(System.in);
		int tabla= 12;
		System.out.println("<===== TABLA DEl 12 ====>");
        for(int i = 1; i<=10; i++){
            System.out.println(tabla + " * " + i + " = " + tabla*i);                                                     
       }
	}

}
