package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		//estructuras de deciscion IF BOLEANOS
		
		int x = 12;
		if(x<10) {
			System.out.println("si es menor");
		}
		else {
			System.out.println("Es mayor");
		}
			
		String nombre =" elba";
		//System.out.println(nombre.length());
		
		if(nombre.length()<10) {
			System.out.println("si es menor");
		}else {System.out.println("si  es mayor");
		}
		
		// condiciones compuestas con operadopsres logicos  AND OR NOT,  DIFERENTE DE, IGUALDAD
		// AND-&&- devuelve un valor true
		//cuando se cumplan todas las condiciones
		
		//if(nombre.length()<11 && nombre.length()<=9) {
			//System.out.println("si");
		//}else {System.out.println("no");}
		
		//OR -||-SI SE CUMPLE POR LO MENOS UNA CONDICION
		//if(nombre.length()<11 || nombre.length()<=9) {
		//	System.out.println("si");
		//}else {System.out.println("no");}
		
		//Not-!- negamos una condicion o cambiar el valor de verdadero a falso  y viseversa
	
		//if(nombre.length()<11!nombre.length()<=9) {
			System.out.println("si");
		//}else {System.out.println("no");}
		
		
		
	}
	
}
