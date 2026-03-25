package Temas;

import java.util.Scanner;

public class UT02T0402E03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer numero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Introduzca el segundo numero: ");
		int num2 = sc.nextInt();
		
		if (num1>num2)
			System.out.println("Error en la entrada de datos");
		else
			for (int i=num1, j=num2; i<=j; i++) {
				System.out.println(i);
			}//for

	}//main

}//class
