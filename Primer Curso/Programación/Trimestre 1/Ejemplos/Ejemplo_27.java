package Temas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ibtroduce una frase por teclado: ");
		String sFrase = sc.nextLine();
		
		String frase[] = sFrase.split(" ");
		
		System.out.println("La frase es: " + Arrays.toString(frase));
		System.out.println("Hay " + palabrasVocal(frase) + " que empiezan por vocal");
		System.out.println("La longitud es: " + sumarLongitudes(frase, 0));
		System.out.println("La palabra mas corta es: " + palabraMasCorta(frase));
		

	}//main
	
	public static int palabrasVocal(String frase[]) {
		int contador = 0;
		
		for (String p : frase) {
			if (!p.isEmpty()) {
				char c = Character.toLowerCase(p.charAt(0));
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					contador++;
				}//if
			}//if1
		}//for
		
		return contador;
	}//palabrasVocal
	
	public static int sumarLongitudes (String frase[], int index) {
		
		if (index == frase.length) 
			return 0;
		else
			return frase[index].length() + sumarLongitudes(frase, index + 1);
	}//sumar longitud
	
	public static String palabraMasCorta(String[] frase) {
		String min = frase[0];
		for (String p: frase) {
			if (p.length() < min.length()) {
				min = p;
			}//if
		}//for
		return min;
	}//palabraMasCorta

}//class
