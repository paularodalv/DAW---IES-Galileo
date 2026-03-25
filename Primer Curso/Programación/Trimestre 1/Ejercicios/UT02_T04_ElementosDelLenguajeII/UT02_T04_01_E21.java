package Temas;

import java.util.Scanner;
import java.io.PrintStream;

public class UT02T0401E21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double impuestos;
		
		System.out.println("Introduce el numero de horas trabajadas esta semana: ");
		int horastrab = sc.nextInt();
		
		System.out.printf("Salario bruto: %,.2f€%n" , (15f*horastrab));
		
		if (horastrab>40) {
			System.out.printf("Salario bruto: %,.2f€%n" , (22.5*horastrab)=impuestos);
		}
	}

}
