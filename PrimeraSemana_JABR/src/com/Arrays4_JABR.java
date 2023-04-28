package com;

public class Arrays4_JABR {

	public static void main(String[] args) {
	
		int[]original= {1,2,3,4,5};
		
		int[]reversa = new int[original.length];
		
		for (int i = original.length-1,j=0; i >=0; i--,j++) {
			reversa[j]=original[i];
			System.out.println(reversa[j]);
		}

	}

}
