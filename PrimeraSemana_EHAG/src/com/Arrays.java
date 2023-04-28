package com;

public class Arrays {

	public static void main(String[] args) {
		/* son una estructuraa de datos que almacenan un tipo 
		 * de dato en comun.
		 * como caracteriztica se necesita declarar su tamaño
		 * olongitud,
		 * y una vez declarado este no puede crecer o cambiar en 
		 * tiempo de ejcucion
		 * */
		//como declara un array y tambien su tamaño
		
		//int numero=1222
		
		int[] numeros= new int[5];// un arary de numeros enteros con su tamaño declarado
		char[] letras= new char[5]; // array de caracteres
		
		//en los array podemos almacenar datos en cada una de las pocisiones con las que  cuenta
		
		//el array almacena desde el 0, por lo tanto en un array de [5] se guardarian del 0al4 por lo tanto  tenemos que indicar apartir de que numero vamos a almacenar
		
		numeros[0]= 100;
		numeros[1]= 102;
		numeros[2]= 103;
		numeros[3]= 104;
		numeros[4]= 105;
		
		// presentar o dar salida en consola  al valor contenido
		//en determinado array
		//ejm
		System.out.println(numeros[4]);
		
		//otra manerade declarar array e iniciarlo ya con susu valoress
		
		String [] nombres = {"Juan", "Carlos","Yose","Adri"};
		System.out.println(nombres[1]);
		//imprimir en pantalla los valores del array
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println(nombres[1]);
		}
		 letras[0]= 'A';
		 letras[1]= 'l';
		 letras[2]= 'e';
		 letras[3]= 'x';
		 letras[4]= 'a';
		 
		 for(int i=0;i<letras.length;i++) {
				System.out.println(letras[i]);
		
		
		//for each : imprimir cada uno de los elementos del array
		
		//for( char i:letras) {
		//	System.out.println(i);
		}
		
		
		
		
		 
		

	}

	public static String toString(int[] numeros) {
		// TODO Auto-generated method stub
		return null;
	}



	}
