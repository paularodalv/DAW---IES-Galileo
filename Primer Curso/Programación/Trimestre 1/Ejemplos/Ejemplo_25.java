package Temas;

import java.util.Arrays;

public class Ejemplo003 {

	public static void main(String[] args) {
		/*Genera un array de 12 numeros enteros aleatorios entre 50 y 150. Al final debe mostrar:
		 1. Los numeros en el orden generado
		 2. Los numeros en el orden inverso
		 3. El valor máximo y mínimo*/
		
		int numeros[] = new int[12];
		
		System.out.println("Los numeros generados son: " + Arrays.toString(numerosAleatorios(numeros)));
		numerosInversos(numeros);
		numeroMayor(numeros);
		numeroMenor(numeros);
		
	}//main
	
	public static int[] numerosAleatorios(int numeros[]) {
		for (int i=0; i<numeros.length; i++) {
			numeros[i] = (int)(Math.random() * 101) + 50;
		}//for
		return numeros;
	}//numerosAleatorios
	
	public static void numerosInversos(int numeros[]) {
		System.out.print("Los numeros en inversa son: ");
		for (int i=numeros.length-1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}//for
		System.out.println();
	}//numerosInversos
	
	public static void numeroMayor(int numeros[]) {
		int max = numeros[0];
		for (int n: numeros) {
			if (n > max) max = n;
		}//for
		System.out.print("El numero mayor es: " + max + "\n");
	}//numeroMayor
	
	public static void numeroMenor(int numeros[]) {
		int min = numeros[0];
		for (int n: numeros) {
			if (n < min ) min = n;
		}//for
		System.out.print("El numero menor es: " +  min + "\n");
	}//numeroMenor

}
