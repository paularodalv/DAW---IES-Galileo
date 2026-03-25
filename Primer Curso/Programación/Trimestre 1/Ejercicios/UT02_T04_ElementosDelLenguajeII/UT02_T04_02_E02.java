package Temas;

import java.util.Scanner;

public class UT02T0402E02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el numero entero: ");
		int num = sc.nextInt();

		
		if (num>0) {
			for(int i = 1; i<= num; i++) {
				System.out.print("*");
			}
		} else {
			System.out.println("ERROR");
		}
	}

}
