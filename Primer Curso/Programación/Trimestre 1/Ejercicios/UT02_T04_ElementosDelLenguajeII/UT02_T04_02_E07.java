package Temas;

import java.util.Scanner;

public class UT02T0402E07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double nmedia=0;
		int nalm=0;
		int susp=0;
		int apr=0;
		boolean bnota=false;
		
		System.out.println("Nota: ");
		double nota = sc.nextDouble();
		
		while (nota>=0 && nota<=10) {
			nmedia = nmedia+nota;
			nalm = nalm+1;
			
			if (nota>=5) {
				apr = apr+1;
				if (nota>=8)
					bnota=true;
			}
			else
				susp=susp+1;
		
		System.out.println("Nota: ");
		nota = sc.nextDouble();
		}//while
		
		if (nalm==0)
			System.out.println("Total de alumnos: " + nalm);
		else
			System.out.println("Total de alumnos: " + nalm);
		
		System.out.println("Total nota media: " + nmedia/nalm);
		System.out.println("Total de aprobados: " + apr);
		System.out.println("Total de suspensos: " + susp);
		if (bnota==true) 
			System.out.println("Algún alumno tuvo un 8,5");
		else
			System.out.println("Ningun alumno tuvo un 8,5");
		
		

	}//main

}//class
