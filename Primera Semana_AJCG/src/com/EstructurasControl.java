package com;

public class EstructurasControl {

	public static void main(String[] args) {
		//Estructuras de decisión IF-Valores booleanos
		
		
		int x= 12;
		
//		if (x<10) { //Si se cumple la condicion se realice
//			//lo siguiente
//			System.out.println("si es menor");
//		}//Llave de cierre del if
//		else { 
//			System.out.println("Es mayor");
//		}//cierre del else
		//Seleccionando varias lineas y presionando ctrl+7
		//puedo comentar varias lineas al mismo tiempo
		
		String nombre="Alam";
		//System.out.println(nombre.length());
		
		//La funcion .length devuelve el valor entero
		//del String en este caso
		
//		if (nombre.length()<10) {
//			System.out.println("si es menor");
//		} else {
//			System.out.println("Es mayor");
//		}
		//CONDICIONES COMPUESTAS CON OPERADORES LOGICOS 
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND= &&- Devuelve un valor true cuando cumple 
		//las condiciones
		
//		if (nombre.length()<3 && nombre.length()>1) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		//OR= || Devuelve un valor true cuando se cumple
		//al menos una condicion
		
//		if (nombre.length()<1 || nombre.length()>2) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		//NOT= ! Negamos una condicion/cambiar el valor
		//de true a fale y viceversa
		
//		if (!(nombre.length()<11)) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		//DIFERENTE DE= != sirve para comparar valores y si es 
		//diferente manda un valor true
		
//		if (x!=10) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		//IGUALDAD- == - Compara el valor y si este es igual
		//manda true
		
//		if (x==12) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		//Estructura if-else concatenado o if-else anidado
		//Anidamos varias condiciones a evaluar
		
//		int d=6;
//		
//		if(d==1) {
//			System.out.println("Lunes");
//		} else if (d==2) {
//			System.out.println("Martes");
//		} else if (d==3 ) {
//			System.out.println("Miercoles");
//		} else if (d==4) {
//			System.out.println("Jueves");
//		} else if (d==5) {
//			System.out.println("Viernes");
//		} else {
//			System.out.println("Desconocido");
//		}
		
		//Estructura de decision SWITCH-CASE
		//Puede ser tipos de dato char, String, int, etc.
		
		int dia= 6;
		
		switch (dia) {
		
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default: 
			System.out.println("Desconocido");
		
		} 
		
		

	}//CIERRE DEL MAIN

}//CIERRE DE LA CLASE
