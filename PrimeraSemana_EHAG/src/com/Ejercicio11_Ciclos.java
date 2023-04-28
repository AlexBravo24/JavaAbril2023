package com;

import java.util.Scanner;

public class Ejercicio11_Ciclos {

	public static void main(String[] args) {
Scanner ld = new Scanner(System.in);
        
        System.out.print("Introduce el ancho de la figura: ");
        int ancho = ld.nextInt();
        
        System.out.print("Introduce el alto de la figura: ");
        int alto = ld.nextInt();
        
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

	}

}
