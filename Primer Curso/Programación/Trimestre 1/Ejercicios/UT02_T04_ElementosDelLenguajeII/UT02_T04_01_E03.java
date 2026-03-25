package Temas;

import java.util.Scanner;

public class UT02T0401E03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca su edad: ");
		int edad;
		edad = sc.nextInt();
		
		System.out.print("Introduzca su altura en m: ");
		double altura;
		altura = sc.nextDouble();
		
		System.out.println("Tiene " + edad + " años y mide " + altura + " m");
		
		if (edad>18)
			System.out.println("Es mayor de edad");
		else 
			System.out.println("Es menor de edad");
		
		if (altura>1.75)
			System.out.println("Mide mas de 1.75");
		else 
			System.out.println("Mide menos de 1.75");

	}

}
