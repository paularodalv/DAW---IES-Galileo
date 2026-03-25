package Temas;

public class Ejemplo21 {

	public static void main(String[] args) {
		
		char[] miCadena= new char[10]; //valor por defecto es \u0000 - \0
		
		miCadena[0]='H';
		miCadena[1]='o';
		miCadena[2]='l';
		miCadena[3]='a';
		
		System.out.println("Mi cadena tiene una longitud de: " + miCadena.length);
		System.out.println("y contiene el texto: " + miCadena); //al utiizar el + se piensa que el array también son caracteres y los intenta concatenar.
		
		System.out.println(miCadena); //está sobrecargado
		
		/*Programa 2
		int i=0;
		do {
			System.out.println(miCadena[i++]);
		}while(miCadena[i]='\0');
		System.out.println("*");
		
		char[] miCadena2 = {71, 111, 100, 97};
		System.out.println(miCadena2);*/
		
		//Clase StringBuilder - mutable
		System.out.println("Stringbuilder: ");
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.length() + sb.capacity());
		
		sb.append("Hola");
		/*sb.append(" mundoooooooo");
		System.out.println("longitud " + sb.length() + " capacidad " + sb.capacity());*/
		
		sb.insert(2," querido");
		System.out.println(sb);
		
		sb.delete(5, 12);
		System.out.println(sb);
		
		String resultado = sb.toString();
		System.out.println(resultado);

	}//main

}//class
