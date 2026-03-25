package Temas;

import java.util.Scanner;


public class UT02T0401E08 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int precioOrdenador = 1000;

        int precioImpresora = 60;


        System.out.print("Número de ordenadores: ");

        int ordenadores = sc.nextInt();


        System.out.print("Número de impresoras: ");

        int impresoras = sc.nextInt();


        double totalOrdenadores = ordenadores * precioOrdenador;

        double totalImpresoras = impresoras * precioImpresora;


        if (ordenadores > 5) {

            totalOrdenadores = totalOrdenadores * 0.92; 

        }


        if (impresoras > 5) {

            totalImpresoras = totalImpresoras * 0.94; 

        }


        double total = totalOrdenadores + totalImpresoras;


        if (total > 2500) {

            total = total * 0.99; 

        }


        System.out.println("\n--------- FACTURA ---------");

        System.out.println("Ordenadores (" + ordenadores + "): " + totalOrdenadores + " €");

        System.out.println("Impresoras  (" + impresoras + "): " + totalImpresoras + " €");

        System.out.println("----------------------------");

        System.out.println("TOTAL A PAGAR: " + total + " €");

        System.out.println("----------------------------");

    }

}

