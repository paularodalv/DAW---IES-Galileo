package Temas;

import java.util.Scanner;


public class UT02T0402E21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las horas trabajadas en la semana: ");
        int horas = sc.nextInt();

        double tarifaBase = 15.0;
        double salarioBruto = 0.0;

        if (horas <= 40) {
            salarioBruto = horas * tarifaBase;
        } else {
            salarioBruto = 40 * tarifaBase + (horas - 40) * tarifaBase * 1.5;
        }

        double impuestos = 0.0;
        if (salarioBruto > 500) {
            double tramo25 = salarioBruto - 500;
            if (tramo25 > 400) {
                tramo25 = 400;
            }
            impuestos += tramo25 * 0.25;
        }

        if (salarioBruto > 900) {
            double tramo45 = salarioBruto - 900;
            impuestos += tramo45 * 0.45;
        }

        double salarioNeto = salarioBruto - impuestos;
        System.out.println("Salario bruto: " + salarioBruto + " €");
        System.out.println("Impuestos: " + impuestos + " €");
        System.out.println("Salario neto: " + salarioNeto + " €");


    }

}
