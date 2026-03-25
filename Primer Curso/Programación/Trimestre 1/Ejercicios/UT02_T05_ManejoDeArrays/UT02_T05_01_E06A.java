package Temas;

import java.util.Arrays;
import java.util.Scanner;

public class UT02T0501E06 {

	public static void main(String[] args) {
		
		String[] nombres = {"Ana", "Luis", "Sofia"};
		int[][] notas = {{8,7,9,10,6},{6,5,7,8,7},{9,10,8,9,10}};
		int numExamen=0, opc=0, notaCambiar=0;
		String nombre="";
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Elige ua opcion: %n 1. Visualizar notas %n 2. Cambiar notas %n 3. Salir");
		opc=sc.nextInt();
		switch (opc) {
		case 1:
			visualizarDatos(nombres, notas);
			break;
		case 2:
			System.out.println("Introduce el nombre para cambiar: ");
			nombre=sc.next();
			System.out.println("Introduce el numero de examen a cambiar: ");
			numExamen=sc.nextInt();
			System.out.println("Nota a la que le quieres cambiar: ");
			notaCambiar=sc.nextInt();
			cambiarNotas(nombres, notas, numExamen, nombre, notaCambiar);
			visualizarDatos(nombres, notas);
			break;
		}
		

	}//main
	
	public static void visualizarDatos(String[] nombres, int[][] notas) {
		for (int i=0; i < notas.length; i++) {
			System.out.print(nombres[i] + " --> Notas: ");
			double promedio=0;
			for (int j=0; j < notas[0].length; j++) {
				System.out.print(" "+notas[i][j]);
				promedio += notas[i][j];
			}//for2
			System.out.println(" | Promedio: " + promedio/notas[0].length);
		}//for1
	}//visualizar datos
	
	public static void cambiarNotas(String[] nombres, int[][] notas, int numExamen, String nombreCambiar, int notaCambiar) {
		for (int i=0; i<nombres.length; i++) {
			if (nombres[i].equals(nombreCambiar)) {
				notas[i][numExamen]=notaCambiar;
			}//if
		}//for
	}//cambiarNotas

}//class
