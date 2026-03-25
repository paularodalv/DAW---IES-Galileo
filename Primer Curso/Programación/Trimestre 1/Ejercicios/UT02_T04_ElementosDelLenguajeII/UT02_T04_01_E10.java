package Temas;

import java.util.Scanner;


public class UT02T0401E10{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();

        if (n >= -70 && n <= -5) {
            System.out.println("El número está en el intervalo A (-70 a -5).");
        } else if (n >= 12 && n <= 200) {
            System.out.println("El número está en el intervalo B (12 a 200).");
        } else {
            System.out.println("El número NO está en ningún intervalo.");
        }

        System.out.println("Valor introducido: " + n);

    }

}