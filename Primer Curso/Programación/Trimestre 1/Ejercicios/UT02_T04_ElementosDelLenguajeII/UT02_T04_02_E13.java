package Temas;

import java.util.Scanner;

public class UT02T0402E13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero entero para la altura del triangulo");
		int alt = sc.nextInt();
		
		for(int i=1; i<=((alt*2)-1);i+=2) {
			for(int j=i;j>=1;j-=2) {
				System.out.print(j + " ");
			}//for
			System.out.println();
		}//for

	}//main

}//class
