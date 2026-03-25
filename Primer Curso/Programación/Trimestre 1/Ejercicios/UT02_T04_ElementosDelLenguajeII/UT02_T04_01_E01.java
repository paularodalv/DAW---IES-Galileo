package Temas;

import java.util.Scanner;

public class UT02T0401E01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe la edad de Juan: ");
		int edadJuan;
		edadJuan = sc.nextInt();
		
		System.out.print("Escribe la edad de Ana: ");
		int edadAna;
		edadAna = sc.nextInt();
		
		if (edadJuan>edadAna)
			System.out.println("Juan no es mas joven que Ana");
		else 
		{
			if (edadJuan<edadAna) 
			System.out.println("Juan es menor que Ana");
			else
			System.out.println("Juan y Ana son de la misma edad");
		}
	}

}
