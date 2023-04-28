package com;

public class EstructuraControl {

	public static void main(String[] args) {
		//Edtructura de decisión IF -valores booleanos
		
		int x =12;
		
//		if (x<10) { //condicion en la que establezco que si se cumple
//			//se realice lo sigiente
//			System.out.println("Si es menor");
//		}else {
//			System.out.println("Es mayor");
//		}

		//Seleccionando varias lineas 
		// y presionando ctrl + 7, puedo comentar
		// varias lineas al mismo tiempo
		
		String nombre = "Yocelin";
		
		System.out.println(nombre.length());
		
		//System.out.println(nombre.length());
		if (nombre.length()<10) {
			System.out.println("Si es menor");
	 } else {
		System.out.println("Es mayor");
	 }
		//AND - && - Devuelve un valor true cuando
				//se cumplan todas las condiciones
				
//				if (nombre.length()<11 && nombre.length()>=9) {
//					System.out.println("Si");
//				}else {
//					System.out.println("No");
//				}
				
				//OR - || - Devuelve un valor true cuando se cumple
				//al menos una condicion
				
				if (nombre.length()<11 || nombre.length()>10) {
					System.out.println("Si");
				}else {
					System.out.println("No");
				}
				
				//NOT - ! - Negamos una condición/Cambiar el valor
				//de true a false y viceversa
				
				if (! (nombre.length()<11)) {
					System.out.println("Si");
				}else {
					
				}
				System.out.println("no");
					
		 //DIFERENTE DE - != - Comparar valores, y si en diferente
		 //manda un valor true 
					
					if (x  !=  10) {
						System.out.println("si");
					}else {
						System.out.println("No");
					}
						//manda un valor true
					
					if (x !=10) {
						System.out.println("Si");
					}else {
						System.out.println("No");
						
						//IGUALDAD- == - compara el valor y si este es igual manda True
						
//						if (x == 12) {
//						System.out.println("Si");
//					}else {
//						System.out.println("No");
//					}
//						
						//Estructura if-else concatenado o if-else anidado
						
						//Anidamos varias condiciones a evaluar
						
						int d=7;
						
//						if(d==1) {
//							System.out.println("Lunes");
//						}else if(d==2) {
//							System.out.println("Martes");
//						}else if(d==3) {
//							System.out.println("Miércoles");
//						}else if (d==4) {
//							System.out.println("Jueves");
//						}else if (d==5) {
//							System.out.println("Viernes");
//						}else {
//							System.out.println("Desconocido");
//						}
						
						//Estructura de decisión SWITCH-CASE
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
							System.out.println("Miércoles");
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
	 }
	



