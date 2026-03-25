package Temas;

import java.util.Scanner;


public class UT02T0401E09{

  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);


    // Pedimos las 3 notas
    System.out.print("Nota del módulo 1: ");
    double n1 = sc.nextDouble();

    System.out.print("Nota del módulo 2: ");
    double n2 = sc.nextDouble();

    System.out.print("Nota del módulo 3: ");
    double n3 = sc.nextDouble();


    // Si suspende algún módulo (nota < 5)
    if (n1 < 5 || n2 < 5 || n3 < 5) {
      System.out.println("Calificación global: SUSPENSO");
    } else {

      // Calculamos la media
      double media = (n1 + n2 + n3) / 3;


      // Determinar calificación según la tabla
      if (media < 6) {
        System.out.println("Calificación global: SUFICIENTE");
      } else if (media < 7) {
        System.out.println("Calificación global: BIEN");
      } else if (media < 9) {
        System.out.println("Calificación global: NOTABLE");
      } else {
        System.out.println("Calificación global: SOBRESALIENTE");
      }


      // Mostrar la media por si quieres verla (opcional)
      System.out.println("Media obtenida: " + media);

    }

  }

}

