package com;

import java.util.Scanner;

public class Ejercicio1_VMGF {

	public static void main(String[] args) {
		// Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
int numero1;
int numero2;


Scanner lector1 = new Scanner(System.in);
System.out.println("introduce el primer numero a comparar");
numero1 = lector1.nextInt();

Scanner lector2 = new Scanner(System.in);
System.out.println("intruduce el segundo numero a comparar");
numero2 = lector2.nextInt();

if (numero1<numero2) { //Condición que establece que si se cumple se 
//	//realice lo siguiente
System.out.println( numero2 + " Es el número mayor");
} else if (numero1==numero2) {
	System.out.println("Los numeros son iguales");
}
	else  {
System.out.println(numero1 + " Es el número mayor");

}

//if (numero1=numero2) { //Condición que establece que si se cumple se 
////	//realice lo siguiente
//System.out.println("los numeros son iguales");
//}else {
//System.out.println("");
//}
}//Cierre del main

}//cierre de la clase
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

