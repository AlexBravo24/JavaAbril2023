package com;

public class StringCiclos {

	public static void main(String[] args) {
		// Metodos de la clase String
		
		//.length (Devuelve el valor de la longuitud de una cadena 
		// de texto)
		
		String cadena = "Alejandro";
		
		System.out.println(cadena.length());
		
		//.charAt (Devolver el caracter que se encuentra 
		//en la posicion o el indice especificado)
		System.out.println(cadena.charAt(1));
		
		System.out.println(cadena.charAt(cadena.length()-1));
		// es el equivalente a 8 si le quito el -1 me marcara error
		
		//.substring (Devuelve el valor de una subcadena de texto
		//a partit del indice especificado)
		System.out.println(cadena.substring(2));
		//el metodo .substring tiene dos forma  de ponerle una coma
		System.out.println(cadena.substring(2,7));
		
		//.toLowerCase (Convierte la cadena a minusculas)
		//.toUpperCase (Convierte la cadena a mayusculas)
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		
		//.equals (Compara objetos, o en este caso, Strings
		//y nos devuelve un valor true o falso
		System.out.println(cadena.equals("Alejandro"));
		
		//.equalsIgnoreCase (Compara los objetos, pero
		//ignora si tiene mayuscukas o minisculas )
		System.out.println(cadena.equalsIgnoreCase("Alejando"));
		System.out.println(cadena.contains("j"));
		
		
		
		
		//CICLOS o también llamdos bucles 
		//Estructuras que nos van a permitir
		//repetir una secuencia o proceso
		
		//whilw (Mientras)
		
		//variable que me va a servir para realizar determinada accion
		int x = 2;
		
		while (x<5) { //mientras x sea menor que 5, realiza lo siguiente
			System.out.println("Hola mundo");
			x++; //una vez ejecutada la linea de arriba
			//incrementa  el valor de x en 1 +
			
		}
		
		//DO_WHILE (Nos aseguramos de que el codigo se ejecute por lo 
		//menos una vez, y despues pregunta de acuerdo a la condicion
		//si el programa debe seguir ejecutandose
		
		do {
			System.out.println("Hola mundo");
		}while(x>5);
		
		//FOR (Para las siguientes condicones o argumentos, realiza x cosa)
		
		for (int i = 10; i < 5; i++) {
			//System.out.println("Hola mundo");
			System.out.println(i+1);
			
		}
		
	}

}
