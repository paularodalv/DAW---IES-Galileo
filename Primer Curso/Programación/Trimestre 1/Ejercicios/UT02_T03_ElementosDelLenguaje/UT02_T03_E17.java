package Temas;

import java.util.Scanner;

public class UT02T03E17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero de varias cifras");
		int num;
		num = sc.nextInt();
		
		String num1 = String.valueOf(num);
		
		int par;
		par = num%2;
		
		String valor;
		valor = (par==0)?"par":"impar";
		System.out.println("El ultimo digito es " + num1.charAt(num1.length()-1) + " y el numero es " + valor);
	}

}
