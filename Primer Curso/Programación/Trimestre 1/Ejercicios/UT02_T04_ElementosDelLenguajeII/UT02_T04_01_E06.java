package Temas;

import java.util.Scanner;

public class UT02T0401E06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduzca el primer apellido: ");
		String apellido;
		apellido = sc.next().toUpperCase();
	
		
		char p1;
		p1 = apellido.charAt(0);
		
		if (p1=='E' || p1=='F')
			System.out.println("Si corresponde a la sucursal");
		else 
			System.out.println("No corresponde a la sucursal");

	}

}
