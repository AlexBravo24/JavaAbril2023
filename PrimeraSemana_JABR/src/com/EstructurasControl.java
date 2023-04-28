package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		//Estructuras de decisi�n IF - valores booleanos
		
		int x = 12;
		
//		if (x<10) { //Condicion en la que establezco que si se cumple
//			//se realice lo siguiente
//			System.out.println("S� es menor");
//		}else {
//			System.out.println("Es mayor");
//		}
		
		//Seleccionando varias lineas
		//y presionando las teclas Ctrl + 7, puedo comentar
		//varias lineas al mismo tiempo
		
		String nombre = "Alejandro";
		
		//System.out.println(nombre.length());
		
		//la funci�on .length devuelve el valor entero
		//del String en este caso
		
//		if (nombre.length()<8) {
//			System.out.println("S� es menor");
//		}else {
//			System.out.println("Es mayor");
//		}
		
		//Condiciones compuestas con operadores l�gicos AND,
		//OR, NOT, DIFERETE DE, IGUALDAD
		
		//AND - && - Devuelve un valor true cuando
		//se cumplan todas las condiciones
		
//		if (nombre.length()<11 && nombre.length()>=9) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//OR - || - Devuelve un valor true cuando se cumple
		//al menos una condicion
		
//		if (nombre.length()<11 || nombre.length()>10) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//NOT - ! - Negamos una condicion/Cambiar el valor
		//de true a false y viceversa
		
//		if (!(nombre.length()<11)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//DIFERENTE DE - != - Comparar valores, y si es diferente
		//manda un valor true
		
//		if (x != 10) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//IGUALDAD - == - Compara el valor y si este es igual manda True
		
//		if (x == 12) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//Estructura if-else concatenado o if-else anidado
		
		//Anidamos varias condiciones a evaluar
		
		int d=7;
		
//		if(d==1) {
//			System.out.println("Lunes");
//		}else if(d==2) {
//			System.out.println("Martes");
//		}else if(d==3) {
//			System.out.println("Mi�rcoles");
//		}else if (d==4) {
//			System.out.println("Jueves");
//		}else if (d==5) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("Desconocido");
//		}
		
		//Estructura de decisi�n SWITCH-CASE
		//Puede ser con tipos de dato char, String, int, etc
		
		int dia = 0;
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Mi�rcoles");
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
		
		

	}//Cierre del main

}//cierre de la clase
