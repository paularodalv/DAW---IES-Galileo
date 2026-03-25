package Temas;

import java.util.Scanner;

public class UT02T0402E12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int f1=0, f2=0, c1=0, c2=0;
		char caracter=' ';
		
		do {
		System.out.print("Caracter a escribir: ");
		caracter = sc.next().charAt(0);
		} while (caracter != '*' && caracter != '?' && caracter != '+');
		
		do {
			System.out.print("Fila comienzo: ");
			f1 = sc.nextInt();
		} while (f1 <1 && f1 > 25);
		
		do {
			System.out.print("Columna comienzo: ");
			c1 = sc.nextInt();
		} while (c1<1 && c1>25);
				 
		do {
			System.out.print("Fila final: ");
			f2 = sc.nextInt();
		} while (f2<1 && f2>80 && f2>f1);
		
		do {
			System.out.print("Columna final: ");
			c2 = sc.nextInt();
		} while (c2<1 && c2>80 && c2>c1);
		
		
			for (int i=1; i<=25; i++) {
				System.out.println();
				for (int j=1; j<=80; j++) {
					if (i>=f1 && i<=f2 && j >= c1 && j<=c2) 
						System.out.print(caracter);
					else
						System.out.print("a");
				}//for2
			}//for1
	

	}//main

}//class
