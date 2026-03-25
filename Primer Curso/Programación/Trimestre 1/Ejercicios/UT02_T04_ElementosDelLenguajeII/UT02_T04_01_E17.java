package Temas;

import java.util.Scanner;


public class UT02T0401E17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la inicial del modelo (C, M, L): ");
        char modelo = sc.next().toUpperCase().charAt(0);

        System.out.print("Introduce la inicial del color (A, B, R): ");
        char color = sc.next().toUpperCase().charAt(0);

        String resultado;

        switch (modelo) {
            case 'C': 
                switch (color) {
                    case 'A': 
                    case 'B': 
                    case 'R': 
                        resultado = "Disponible";
                        break;
                    default:
                        resultado = "Opción no contemplada";
                }
                break;
            case 'M': 
                switch (color) {
                    case 'A': 
                    case 'R': 
                        resultado = "Disponible";
                        break;
                    case 'B': 
                        resultado = "No disponible";
                        break;
                    default:
                        resultado = "Opción no contemplada";
                }
                break;
            case 'L': 
                switch (color) {
                    case 'B':
                        resultado = "Disponible";
                        break;
                    case 'A': 
                    case 'R': 
                        resultado = "No disponible";
                        break;
                    default:
                        resultado = "Opción no contemplada";
                }
                break;
            default:
                resultado = "Opción no contemplada";
        }

        System.out.println("Resultado: " + resultado);

    }

}

