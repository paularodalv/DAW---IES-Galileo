package Temas;

import java.util.Scanner;

public class Ut02T0401E02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el precio del lector compact disc: ");
		double lcd;
		lcd = sc.nextDouble();
		
		System.out.print("Dime el precio del amplificador: ");
		double ampli;
		ampli = sc.nextDouble();
		
		System.out.print("Dime el precio del sintonizador: ");
		double sint;
		sint = sc.nextDouble();
		
		System.out.print("Dime el precio del pletina: ");
		double plet;
		plet = sc.nextDouble();
		
		double prectotal;
		prectotal = lcd+ampli+sint+plet;
		
		if (prectotal>1000)
			System.out.println("El precio a pagar es " + (prectotal-(prectotal*0.10)));
		else
			System.out.println("El precio a pagar es " + prectotal + " €");

	}

}
