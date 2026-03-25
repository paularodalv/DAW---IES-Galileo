package Temas;

import java.util.Scanner;

public class Ejemplo10 {

	public static void main(String[] args) {

		String cad="La casa es azul";
		try {
			//System.out.println(7/0);
			System.out.println(cad.charAt(cad.length()));
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		} finally {
			System.out.println("Bloque finally ");
		}

		
		/*String cad="La casa es azul";
		try {
			System.out.println(7/0);
			System.out.println(cad.charAt(cad.length()));
		} catch (StringIndexOutOfBoundsException f) {
			System.out.println("Error " + f.getMessage());
		}//catch1
		catch (ArithmeticException e) {
		System.out.println("Error matematico: No puedes dividir entre 0" + e.getMessage());
		}//catch2*/
	}//main

}//class
