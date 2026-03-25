package Temas;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejemplo002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0, num_aleatorio = (int)(Math.random()*40)+1, caract =0;
		char c=' ';
		
		System.out.println("¿Cuántas líneas quieres pintar?");
		num = sc.nextInt();
		
 
        //Validamos que los datos sean los correctos
 
        while (cant_puntuaciones<=0) {
            System.out.println("Introduzca la cantidad de puntuaciones que introducirá: ");
            try {
                cant_puntuaciones = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalido. Debe ser un numero positivo.");
                sc.next();
                cant_puntuaciones = -1;
            }//catch
        }//while para validar
 
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
