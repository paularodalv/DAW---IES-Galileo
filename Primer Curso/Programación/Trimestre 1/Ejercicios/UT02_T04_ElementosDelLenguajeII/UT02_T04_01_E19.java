package Temas;

import java.util.Scanner;
import java.io.PrintStream;

public class UT02T0401E19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int boleto=16236;
		
		System.out.print("Introduzca su numero de loteria: ");
		int numloteria = sc.nextInt();
		
		
		System.out.print("Introduzca cuantos decimos tiene: ");
		int numdecimos = sc.nextInt();
		
		
		if (numloteria==boleto)
			System.out.printf("¡Felicidades! Has ganado el primer decimo, el premio total es: %,.2f€" , (400000f*numdecimos));
		else
			if (numloteria==(boleto-1))
				System.out.printf("¡Felicidades! Te has aproximado, el premio total es: %,.2f€" , numdecimos*2000f);
			else
				if (numloteria==(boleto+1))
					System.out.printf("¡Felicidades! Te has aproximado, el premio total es: %,.2f€" , numdecimos*2000f);
				else 
					if ((numloteria%100)==(boleto%100))
						System.out.printf("¡Felicidades! Los dos ultimos digitos coinciden, el premio total es: %,.2f€" , numdecimos*100f);
					else
						if ((numloteria%10)==(boleto%10)) 
							System.out.printf("¡Felicidades! El ultimo digito coincide, el premio total es: %,.2f€" , numdecimos*20f);
						else 
							System.out.println("¡Lastima! No te ha tocado nada.");
				
			
	} //main

} //class
