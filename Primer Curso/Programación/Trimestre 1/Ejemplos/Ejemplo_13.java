package Temas;

public class Ejemplo13 {

	public static void main(String[] args) {
		//Tipos primitivos se pasan por valor
		int num = 5;
		cambiar(num);
		System.out.println("Entero despues del metodo " + num);
		
		//Se denomina que hay objetos inmutables, String, Integer, Float, Double...
		String texto = "hola";
		cambiarS(texto);
		System.out.println("String despues del metodo " + texto);
		
		//Objetos mutables || paso por referencia
		StringBuilder textoSB = new StringBuilder("Hola");
		System.out.println("StringBuilder antes del metodo " + textoSB);
		cambiarSB(textoSB);
		System.out.println("StringBuilder despues del metodo " + textoSB);
		
		//Metodo de sumar
		System.out.println("Suma despues del metodo " + sumar(1, sumar(1,2)));
		

	}//main
	
	public static void cambiar(int n) {
		n = 10;
	}//cambiar
	
	public static void cambiarS(String t) {
		t = "adios";
	}//cambiarS
	
	public static void cambiarSB(StringBuilder t) {
		t.append("Mundo");
	}//cambiarS
	
	public static int sumar(int i,int j) {
		return i+j;
	}//sumar

}//class
