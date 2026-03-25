package Temas;

import java.util.Scanner;

public class Examen2_PaulaRodriguezAlvarez {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0, num_aleatorio = (int)(Math.random()*40)+1, caract =0;
		char c=' ';
		
		
		//Validar numeros 		
		do {	
			System.out.println("¿Cuántas líneas quieres pintar?");
			try {
				num = sc.nextInt();
			} catch (java.util.InputMismatchException e){
				System.out.println("Incorrecto, debe ser entre 10 y 20.");
                sc.nextLine();
			}
		} while (num <10 || num>20);
			
		
		//Imprimir líneas con el numero entre 1 y 40
		for (int i=1; i<=num; i++) {
			num_aleatorio = (int)(Math.random()*40)+1;
			for (int j=0; j<=num_aleatorio; j++) {
				System.out.print("*");
			}
			System.out.println();
		}//for
		
		//Imprimir caracter aleatorio
				for (int i=1; i<=num; i++) {
					num_aleatorio = (int)(Math.random()*40)+1;
					caract = (int)(Math.random()*6)+1;
					for (int j=0; j<=num_aleatorio; j++) {
						switch (caract) {
						case 1:
							c='*';
							break;
						case 2:
							c = '-';
							break;
						case 3:
							c='=';
							break;
						case 4:
							c = '.';
							break;
						case 5:
							c='|';
							break;
						case 6:
							c = '@';
							break;
						}//switch
						System.out.print(c);
					}//for
					System.out.println();
				}//for
		
	}//main

}//class
