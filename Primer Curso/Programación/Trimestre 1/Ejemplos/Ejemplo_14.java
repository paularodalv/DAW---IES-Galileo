package Temas;

public class Ejemplo14 {

	public static void main(String[] args) {
		int a=3, b=5;
		System.out.println("Suma normal " + sumar(a,b)); //Parametros actuales
		
		// Sobrecargar los métodos
		System.out.println("Suma ponderada. " + sumar(2, 0.25, 3, 0.75));

	}//main

	public static int sumar(int i,int j) { //Parametros formales, por valor
		return i+j;
	}//sumar
	
	public static double sumar(int a, double a1, int b, double b1) {
		return (float)(a*a1)+(b*b1);
	}//sumar2
	
}//class
