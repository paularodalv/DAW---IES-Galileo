package Temas;

import java.util.Scanner;

public class UT02T0501E01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int iNumeros[]= new int[10];
		
		//Numeros por el usuario
		//-----------------------------------------------------------
		
		for (int i=0; i<iNumeros.length; i++) {
			System.out.println("Introduce un numero entero: ");
			try{
				iNumeros[i] = sc.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("Incorrecto, debe ser un numero entero.");
                sc.nextLine();
			}
			
		}//for
		
		for (int numeros:iNumeros) {
			System.out.println("Los numeros son: " + numeros);
		}//for
		
		System.out.println("-----");
		
		for (int i=iNumeros.length - 1; i>=0; i--) {
			System.out.println("Los numeros son: " + iNumeros[i]);
		}//for
		
		//Numeros aleatorios
		//------------------------------------------------------------
		
		for (int i=0; i<iNumeros.length; i++) {
			iNumeros[i]=(int)(Math.random()*100)+1;
		}
		
		for (int numeros:iNumeros) {
			System.out.println("Los numeros son: " + numeros);
		}//for

	}//main

}//class
