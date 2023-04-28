package Arrays;

import java.util.Scanner;

public class Arrays1_DCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crea un array de 10 posiciones de números con valores pedidos por teclado.
			Muestra por consola el índice y el valor al que corresponde.*/
		
		int [] numeros = new int [10];
		Scanner lector = new Scanner(System.in);
		
		for (int i=0; i < numeros.length; i++) {
			System.out.println("Inserta un numero - iteracion:" + i );
			numeros[i] = lector.nextInt();
		}
		
		System.out.println("Los valores del array son los siguientes");
		
		for(int i: numeros) {
			System.out.println(i);
		}
		
		

	}

}
