package Temas;

import java.util.Scanner;

public class UT02T0402E14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numv=0;
		
		System.out.println("Introduce un numero entero: ");
		int numE = sc.nextInt();
		
		for (int j=0; j<numE; j++) {
			numE=numE/10;
			System.out.println(numE);
			for (int v=0; v<j; v++) {
				numv= v+2;
			}//for2
		}//for
		
		System.out.println("El numero tiene: " + numv);

	}//main

}//class
