package Temas;

import java.util.Scanner;

public class UT02T402E13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			try {
			System.out.print("Intoduce un numero entero para la altura del triangulo: ");
			num = sc.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.print("Error, no puedes meter un caracter");
				sc.nextLine();
			}
			num = 0;
		} while (num==0); 
		
		for (int i=1; i<=num; i++) {
			for (int j=(2*i-1); j>=i; j-=2) {
				System.out.print(j + " ");
			}//for2
			System.out.println();
		}//for
	}//main

}//class
