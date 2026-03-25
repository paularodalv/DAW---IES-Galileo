package Temas;

import java.util.Scanner;
import java.util.InputMismatchException;
 
public class Ejemplo001 {
    public static void main (String [] args) {
 
        //Variables
        Scanner sc = new Scanner(System.in);
        int cant_puntuaciones=0, num_switch=0;
        double puntuaciones=0.0, punt_max=0.0, punt_min=100, suma_notas=0.0, promedio=0.0;
        String cal_cuant="";
 
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
 
        //Se validan las calificaciones junto a hacer la máxima y la mínima.
 
        for (int i=0; i<cant_puntuaciones; i++){
            System.out.println("Introduce la nota: ");
            puntuaciones = sc.nextDouble();
            while (puntuaciones<0 || puntuaciones > 100){
                System.out.println("Invalido. Debe ser entre 0 y 100. ");
                sc.next();
                puntuaciones = sc.nextDouble();
            }//while
            punt_max = Math.max(puntuaciones, punt_max);
            punt_min = Math.min(puntuaciones, punt_min);
            suma_notas += puntuaciones;
        }//for
 
        //Se calcula el promedio
        promedio = suma_notas/cant_puntuaciones;
 
        if (promedio>90) {
            num_switch=1;
        } else if (promedio<70) {
            num_switch=3;
        } else if (promedio>70 || promedio<89) {
            num_switch=2;
        }//if
 
        //Hacemos la clasificación cualitativa
        switch (num_switch) {
            case 1:
                cal_cuant="Aprobado con distinción";
                break;
            case 2:
                cal_cuant="Aprobado regular";
                break;
            case 3:
                cal_cuant="Reprobado";
                break;
        }//switch
 
        //Sacamos por pantalla todo lo que nos pide
        System.out.println("El valor máximo es: " + punt_max);
        System.out.println("El valor mínimo es: " + punt_min);
        System.out.println("El promedio de las notas son: " + promedio);
        System.out.println("La clasificación cualitativa es un " + cal_cuant);
 
    }//main
}//class