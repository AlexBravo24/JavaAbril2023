package com;

public class StringCiclos {
	public static void main(String[] args) {
		String cadena = "Alejandro";
		System.out.println(cadena.length());
		System.out.println(cadena.charAt(1));
		// charAt devuelve 
/*		System.out.println(cadena.charAt(cadena.length()-1));
	    System.out.println(cadena.substring(2,7));
	//.toLowerCase convierte la cadena a minusculas
	//.toUpperCase convierte la cadena en mayusculas 
	    System.out.println(cadena.toLowerCase());
	    System.out.println(cadena.toUpperCase());
	//.equals compara objetos o en este caso, strings y nos devuelve un valor true o false
	    System.out.println(cadena.equals("alejandro"));
	// .equalsaiagnoreCase compara los objetos , pero ignora si tiene mayusculas o minusculas 
	    System.out.println(cadena.equalsIgnoreCase("ALEJANDRO"));
	
	    int x = 2;
	    while(x<5) {
	    	System.out.println("Hola mundo");
	    	x++;
	    }
	    
	    do {
	    	System.out.println("hola mundo");
	    }while (x>5);
	    */
	    //For para las siguientes condiciones o argumentos, realiza x cosa
	    for(int i =0 ; i>5; i++) {
	    	//System.out.println("hola mundo");
	    	System.out.println(i+1);
	    }
	}
	
}
