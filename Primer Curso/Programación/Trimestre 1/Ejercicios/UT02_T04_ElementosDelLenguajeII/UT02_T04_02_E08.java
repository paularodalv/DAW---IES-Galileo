package Temas;

import java.util.Scanner;

public class UT02T0402E08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int num;
        int signum=0;
 
        System.out.println("Introduce un numero entero");
        num = sc.nextInt();
 
        while (num > 0) {
        	if (num>50) {
        		if (num%7 == 0) 
        			System.out.println("El numero " + num + "es multiplo de 7");
        		else 
        			while (num%7 != 0) {
        				signum = ((num/7)+1)*7;
        			System.out.println("El siguiente numero multi de 7 es " + signum);
        			
        			System.out.println("Introduce un numero entero");
            	    num = sc.nextInt();
        			}//while
        	}//if
        	
        	if (num<50)	
        		for (int i=1; i <=num; i+=3)
        			System.out.println(i);
        		
        			
        		System.out.println("Introduce un numero entero");
        	    num = sc.nextInt();
        	}//while
	
	}//main

}//class
