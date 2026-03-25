package Temas;

import java.util.Scanner;

public class UT02_T0502_E04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sbFrase = new StringBuilder();
		String sPalabra = "";
		
		System.out.println("Introduce las palabras una a una. Escribe fin para terminar: ");
		
		while (!sPalabra.equalsIgnoreCase("fin")) {
				sPalabra = sc.next();
				sbFrase.append(sPalabra);
				sbFrase.append(" ");
		}
		
		sbFrase.delete(sbFrase.length()-4, sbFrase.length());
		System.out.println("Frase completa: " + sbFrase);
		
	}//main

}//class
