package com;

import java.util.Scanner;

public class Array3_MVNO {
	public static void main(String[] args) {
		/*Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres*/
		Scanner linea=new Scanner(System.in);
        
        System.out.println("Escrie una frase: ");
        String frase=linea.nextLine(); 
        char caracteres[]=frase.toCharArray();// se utiliza el toCharArray porque 
                                              // copia los caracteres de la instancia en una array
         System.out.println("==================");
         System.out.println("Se ha pasado la frase a un array");
         
         for(int i=0;i<frase.length();i++){
            System.out.println(caracteres[i]);
        }
	}

}
