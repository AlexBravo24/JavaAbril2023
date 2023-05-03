package com;

public class Ciclos3_ESJS {


		// Realiza un programa para determinar si un String es palíndromo.

		 public static boolean Palindromo(String str)
		    {
		        if (str == null) {
		            return false;
		        }
		 
		        for (int i = 0, j = str.length() - 1; i < j; i++, j--)
		        {
		            if (str.charAt(i) != str.charAt(j)) {
		                return false;
		            }
		        }
		 
		        return true;
		    }
		 
		    public static void main (String[] args)
		    {
		        String str = "XYBYBYX";
		 
		        if (Palindromo(str)) {
		            System.out.println("Palindromo");
		        }
		        else {
		            System.out.println("No es Palindromo");
		        }
		
	}

}
