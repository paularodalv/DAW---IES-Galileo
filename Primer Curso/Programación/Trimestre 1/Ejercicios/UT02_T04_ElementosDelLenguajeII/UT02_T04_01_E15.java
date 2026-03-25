package Temas;

import java.util.Scanner;

public class UT02T0401E15 {

	public static void main(String[] args) {
		
		System.out.println("Suma");
		System.out.println("Resta");
		System.out.println("Multiplicacion");
		System.out.println("Division");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una de las opciones poniendo la primera letra: ");
		char opc = sc.next().charAt(0);
		
		if (opc != 'd' && opc != 'D' && opc != 's' && opc != 'S' && opc != 'm' && opc != 'M' && opc != 'r' && opc != 'R')
			System.out.println("Opcion invalida");
		else {
			System.out.println("Introduce el primer numero entero: ");
			int num1 = sc.nextInt();
			
			System.out.println("Introduce el segundo numero entero: ");
			int num2 = sc.nextInt();
			
			System.out.println("Numero 1: " + num1);
			System.out.println("Numero 2: " + num2);
			
			switch (opc) {
				default:
					System.out.println("La opcion no es valida");
					break;
				case 'S':
				case 's':
					System.out.println("Suma: " + num1+num2);
					break;
				case 'R':
				case 'r':
					System.out.println("Resta: " + (num1-num2));
					break;
				case 'M':
				case 'm':
					System.out.println("Multiplicacion: " + num1*num2);
					break;
				case 'D':
				case 'd':
					if (num2==0)
						System.out.println("Division no valida");
						else
							System.out.println("Division: " + num1/num2);
					break;
					
			} // switch
		} //else

	} //main

} //clase
