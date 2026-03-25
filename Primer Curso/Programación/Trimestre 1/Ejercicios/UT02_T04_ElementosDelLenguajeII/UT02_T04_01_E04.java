package Temas;

import java.util.Scanner;

public class UT02T0401e04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer caracter: ");
		char pc;
		pc = sc.next().charAt(0);
		
		System.out.print("Introduzca el segundo caracter: ");
		char ssc;
		ssc = sc.next().charAt(0);
		
		if (pc<ssc)
			System.out.println("El orden es: " + pc + ssc);
		else 
			System.out.println("El orden es: " + ssc + pc);

	}

}
