package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// estructuras de decision IF - booleanos
//		int x = 17;
//		if (x < 15) {
//			System.out.println("es menor");
//		} else {
//			System.out.println("es mayor");
//		}
		int x = 12;

//		String nombre = "reducindo";
//		
//		if(nombre.length() < 10) {
//			System.out.println("es menor");
//		} else {
//			System.out.println("es mayor");
//		}

//		// operador && (y)
//		if (nombre.length() < 10 && nombre.length() >= 8) {
//			System.out.println("si");
//		} else {
//			System.out.println("no");
//		}
//
//		// operador || or (o)
//		if (nombre.length() < 10 || nombre.length() >= 8) {
//			System.out.println("si");
//		} else {
//			System.out.println("no");
//		}
//		
//		//operador NOT !
//		if(!(nombre.length() < 10)) {
//			System.out.println("es menor");
//		} else {
//			System.out.println("es mayor");
//		}
//		//operador diferente de !=
//		if(nombre.length() != 9) {
//			System.out.println("es menor");
//		} else {
//			System.out.println("es mayor");
//		}
		
		//operador de igualdad, compara los valores
//		if (x == 12) {
//			System.out.println("es igual");
//		} else {
//			System.out.println("no es igual");
//		}
		
		//if anidados
//		int cont = 5;
//		
//		if (cont == 1) {
//			System.out.println("Lunes");
//		} else if(cont == 2) {
//			System.out.println("Martes");
//		} else if (cont == 3) {
//			System.out.println("Miercoles");
//		} else if (cont == 4) {
//			System.out.println("jueves");
//		} else if (cont == 5) {
//			System.out.println("viernes");
//		} else {
//			System.out.println("desconocido");
//		}
		
		int dia = 3;
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
		case 6:
			System.out.println("Desconocido");
			break;
		}
		

	}

}
