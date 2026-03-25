package Temas;

import java.util.Scanner;

public class UT02_T0502_E02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		String sFrase = sc.nextLine();
		System.out.println("Introduce una palabra a buscar: ");
		String sPalabra = sc.next();
		
		buscarPalabra(sFrase, sPalabra);

	}//main
	
	public static void buscarPalabra(String sFrase, String sPalabra) {
		String sFraseMinuscula = sFrase.toLowerCase();
		String sPalabraMinuscula = sPalabra.toLowerCase();
		int contador=0;
		int index = 0;
		
		while ((index = sFraseMinuscula.indexOf(sPalabraMinuscula, index)) != -1) {
			contador++;
			index += sPalabraMinuscula.length();
		}//while
		
		System.out.println("La palabra casa aparece " + contador + " veces en la frase.");
		
	}//buscarPalabra

}//class
