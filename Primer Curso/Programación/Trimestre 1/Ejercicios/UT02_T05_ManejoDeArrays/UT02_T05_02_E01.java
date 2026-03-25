package Temas;

import java.util.Scanner;

public class UT02_T0502_E01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombreCompleto = "";
		
		System.out.println("Introduce tu nombre completo: ");
		nombreCompleto=sc.nextLine();
		
		String resultado = nombreCompleto.replaceAll("[aeiouáéíóúAEIOUÁÉÍÓÚ]", "");
		System.out.println(resultado);
		
	}//main

}//class
