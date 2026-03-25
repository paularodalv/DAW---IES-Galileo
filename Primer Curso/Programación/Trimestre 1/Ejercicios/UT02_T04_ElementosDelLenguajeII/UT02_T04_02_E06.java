package Temas;

import java.util.Scanner;


public class UT02T0402E06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mostrar tabla de multiplicar");
            System.out.println("2. Sumar números en un rango");
            System.out.println("3. Mostrar n primeros números primos");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    System.out.print("¿Qué tabla de multiplicar quieres ver? ");
                    int tabla = sc.nextInt();
                    for(int i = 1; i <= 10; i++) {
                        System.out.println(tabla + " x " + i + " = " + (tabla * i));
                    }
                    break;
                case 2:
                    System.out.print("Introduce el número inicial: ");
                    int inicio = sc.nextInt();
                    System.out.print("Introduce el número final: ");
                    int fin = sc.nextInt();
                    int suma = 0;
                    for(int i = inicio; i <= fin; i++) {
                        suma += i;
                    }
                    System.out.println("La suma desde " + inicio + " hasta " + fin + " es: " + suma);
                    break;
                case 3:
                    System.out.print("¿Cuántos números primos quieres ver? ");
                    int n = sc.nextInt();
                    int contador = 0;
                    int numero = 2; 
                    while(contador < n) {
                        int divisores = 0;
                        for(int i = 1; i <= numero; i++) {
                            if(numero % i == 0) {
                                divisores++;
                            }
                        }
                        if(divisores == 2) {
                            System.out.print(numero + " ");
                            contador++;
                        }
                        numero++;
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while(opcion != 4);

    }

}