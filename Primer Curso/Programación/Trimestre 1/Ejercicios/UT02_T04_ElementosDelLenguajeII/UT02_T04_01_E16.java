package Temas;

import java.util.Scanner;

public class UT02T0401E16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un año: ");
		int año = sc.nextInt();
		
		System.out.print("Escribe un mes con numeros (1-12): ");
		int mes = sc.nextInt();
		
		switch (mes) {
			case 1: //Enero
			case 3: // Marzo
			case 5: //Mayo
			case 7: //Julio
			case 8: //Agosto
			case 10: //Octubre
			case 12: //Diciembre
				System.out.println("El mes " + mes + " del año " + año + " tiene 31 dias");
				break;
			case 4: //Abril
			case 6: //Junio
			case 9: //Septiembre
			case 11: //Noviembre
				System.out.println("El mes " + mes + " del año " + año + " tiene 30 dias");
				break;
			case 2: //Febrero
				if (año%4 == 0 && año%100 != 0 || año%400 == 0)
					System.out.println("El mes " + mes + " del año " + año + " tiene 29 dias");
				else 
					System.out.println("El mes " + mes + " del año " + año + " tiene 28 dias");
		
		} //Switch

	} //Main

} //Clase
