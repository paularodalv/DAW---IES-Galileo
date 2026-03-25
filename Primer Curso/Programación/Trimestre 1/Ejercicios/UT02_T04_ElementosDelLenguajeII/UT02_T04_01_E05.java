package Temas;

import java.util.Scanner;

public class UT02T0401E05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un caracter: ");
		char letra;
		letra = sc.next().charAt(0);
		
		String letrastring = String.valueOf(letra);
		
		String letramayus;
		letramayus = letrastring.toUpperCase();
		
		if (letramayus.equals("A"))
			System.out.println("Correcto");
		else 
			System.out.println("Incorrecto");

	}

}
