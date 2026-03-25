package Temas;

import java.util.Scanner;

public class UT02T0401E07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce los kilometros a realizar: ");
		double km;
		km = sc.nextDouble();
		
		System.out.print("Viaja el litera: ");
		boolean litera;
		litera = sc.nextBoolean();
		
		double kmmon;
		kmmon = km*0.10;
		
		System.out.println("Red de Ferrocarriles de Paula R.");
		System.out.println("Concepto cantidad a abonar");
		System.out.println("-----------------------------------------  -------------------------------------- ");
		System.out.println("Distancia (Kms.) " + km);
		if (litera)
			System.out.println("Litera 16 euros");
		else 
			System.out.println("Litera 0 euros");
		System.out.println("-----------------------------------------  -------------------------------------- ");
		if (litera)
			System.out.println("TOTAL " + (kmmon+16) + " €" );
		else 
			System.out.println("TOTAL " + kmmon);
	}

}
