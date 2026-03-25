package Temas;

import java.util.Scanner;

public class UT02T0403E05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduce número de aciertos: ");
        int aciertos = scanner.nextInt();

        System.out.print("Introduce total de preguntas: ");
        int total = scanner.nextInt();

        // Evaluación
        int porcentaje = evaluar(aciertos, total); 
        //Calcula el porcentaje de aciertos
        String calificacion = evaluar(porcentaje);
        /*Devuelve una calificación textual según el porcentaje:
			>= 90: "Excelente"
			>= 75: "Bien"
			>= 60: "Suficiente"
			< 60: "Insuficiente"
         */
        String rendimiento = evaluar(calificacion);
        //Devuelve "Sí" si la calificación es "Excelente" o "Bien".
        //Devuelve "No" si es "Suficiente" o "Insuficiente"

        // Resultados
        System.out.println("\nPorcentaje de aciertos: " + porcentaje + "%");
        System.out.println("Calificación: " + calificacion);
        System.out.println("¿Rendimiento aceptable?: " + rendimiento);

	}//main
	
	public static int evaluar(int a, int t) {
		return (100*a)/t;
	}//evaluarporcentaje
	
	public static String evaluar(int p) {
		String cal="";
		if (p>=90) 
			cal = "Excelente";
		else if (p>=75)
			cal = "Bien";
		else if (p>=60)
			cal = "Suficiente";
		else if (p<60) {
			cal = "Insuficiente";
		}//if
		return cal;
	}//evaluarcalificacion
	
	public static String evaluar(String r) {
		String ren = " ";
		if (r == "Excelente" || r == "Bien") {
			ren = "sí"; 
		} //if
		if (r == "Suficiente" || r == "Insuficiente") {
			ren = "no";
		}//if
		return ren;
	}//evaluarrendimiento

}//class
