package Temas;

import java.util.Scanner;

public class UT02T0501E02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int iNotas[]= new int[7];
		int aprobado=0, numAlumnos=0;
		
		//Introducir notas
		for (int i=0; i<iNotas.length; i++) {
			System.out.println("Introduce la nota del alumno: ");
			try{
				iNotas[i] = sc.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("Incorrecto, debe ser un numero entero.");
                sc.nextLine();
			}//try...catch
		}//for
		
		//Cuantos han aprobado
		for (int aprobados:iNotas) {
			if (aprobados>=5)
				aprobado ++;
		}//for
		
		System.out.println(aprobado + " han aprobado, que son el " + (100*aprobado)/7 + "% de la clase");

		//Cuantos alumnos tienen esa nota
		int nota=0;
		do {
			System.out.println("Que nota quieres mirar para que sea igual: ");
			try{
				nota = sc.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("Incorrecto, debe ser un numero entero.");
                sc.nextLine();
			}//try...catch
		} while (nota<0 || nota>10);
		
		for (int notas:iNotas) {
			if (notas==nota) {
				numAlumnos++;
			}//if
		}//for
		
		System.out.println(numAlumnos + " tienen de nota un " + nota + " que representan un " + (100*numAlumnos)/7 + "% de la clase");
		
		
	}//main

}//class
