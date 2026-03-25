package Temas;

import java.util.Scanner;

public class UT02T0402E09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char CCaracter=' ';
 
        System.out.println("Introduzca un caracter: ");
        char caracter=sc.next().charAt(0);
 
        while (caracter != '*') {
        	if (caracter >= 'A' && caracter <= 'Z'){
                CCaracter = (char) (caracter+32);
            } else if (caracter >= 'a' && caracter <= 'z') {
                CCaracter = (char) (caracter-32);
            }//if
 
            System.out.println("Caracter original: " + caracter);
            System.out.println("Caracter convertido: " + CCaracter);
            
            System.out.println("Introduzca un caracter: ");
            caracter=sc.next().charAt(0);
        }//while
       
	}//main

}//class
 