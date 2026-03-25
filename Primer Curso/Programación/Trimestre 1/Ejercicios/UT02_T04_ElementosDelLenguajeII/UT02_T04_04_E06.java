package Temas;

import java.util.Random;
import java.io.PrintStream;

public class UT02T0404E06 {

	public static void main(String[] args) {
		
		System.out.println("Numeros reales aleatorios entre 0 y 1:");
		mostrarAleatorios(5);
		System.out.println();
		System.out.println("Numeros enteros aleatorios entre 10 y 20:");
		mostrarAleatorios(5, 10, 20);

	}//main

	public static void mostrarAleatorios(int num) {
		Random r = new Random();
		float rnum=0;
		for (int i=0; i<num; i++) {
			rnum = r.nextFloat(0,1);
			System.out.printf("%.4f%n", rnum);
		}//for
	}//num1
	
	public static void mostrarAleatorios(int num1, int num2, int num3) {
		Random r = new Random();
		int rnum = 0;
		for (int i=0; i<num1; i++) {
			rnum = r.nextInt(10, 20);
			System.out.println(rnum);
		}//for
	}//num2
	
}//class
