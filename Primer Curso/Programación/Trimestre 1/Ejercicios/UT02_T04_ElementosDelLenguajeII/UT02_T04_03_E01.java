package Temas;

import java.util.Scanner;

public class UT02T0403E03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero a: " );
		int a = sc.nextInt();
		System.out.println("Introduce el numero b: " );
		int b = sc.nextInt();
		System.out.println("Introduce el numero c: " );
		int c = sc.nextInt();
		
		System.out.println("El menor es: " + obtenerMenor(a, b, c));
		System.out.println("El mayor es: " + obtenerMayor(a, b, c));

	}//main
	
	static public int obtenerMenor(int a,int b,int c) {
		int menor=0;
		if (a<b)
			if (a<c)
				menor = a;
			else 
				menor = c;
		else if (b<c)
			menor = b;
		else 
			menor = c;
		return menor;
			
	}//menor
	
	static public int obtenerMayor(int a, int b, int c) {
		int mayor=0;
		if (a>b && a>c)
			mayor = a;
		else if (b>a && b>c)
			mayor = b;
		else if (c>a && c>b)
			mayor = c;
		return mayor;
	}//mayor

}//class
