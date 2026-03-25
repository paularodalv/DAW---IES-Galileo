package Temas;

import java.util.Scanner;

public class UT02T0402E04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int fact=1;
		
		System.out.print("Introduce un numero entero: ");
		int num = sc.nextInt();
		
		for (int i=num; i>=1; i--) {
			fact = fact * i; 
			System.out.println("El numero factorial: " + fact);
		}//for

	}//main

}//class
