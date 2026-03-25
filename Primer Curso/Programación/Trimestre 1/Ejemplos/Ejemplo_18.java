package Temas;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejemplo18 {

	public static void main(String[] args) {
		
		/*
		String[] nombres= {"Ana", "Pepe", "Lucia", "Maria"};
		String[] nombresSupri= new String[nombres.length-1];
		
		int j=0; //Utilizo la variable para controlar el nombreSupri
		for (int i=0; i<nombres.length; i++) {
			if (!nombres[i].equals("Maria")) {
				nombresSupri[i]=nombres[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(nombresSupri));*/
		
		/*int indice=0;
		System.arraycopy(nombres, 0, nombresSupri, 0, indice);
		System.arraycopy(nombres, indice+1, nombresSupri, indice, nombres.length-indice-1);
		System.out.println(Arrays.toString(nombresSupri));*/
		
		//ArrayList de enteros
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(23);
		numeros.add(45);
		
		/*System.out.println(numeros);
		System.out.println(numeros.size());*/
		
		for (int i=0; i<numeros.size(); i++) {
			System.out.println("For: " + numeros.get(i));
		}
		
		for (Integer num:numeros) {
			System.out.println("For each: " + num);
		}
		
		//Buscar un elemento en la lista
		if (numeros.contains(5))
			System.out.println("Encontrado");
		else
			System.out.println("No encontrado");
		
		//Añadir con metodos
		numeros.add(1, 100);
		System.out.println(numeros);
		
		//Reemplazar con metodos
		numeros.set(1, 200);
		System.out.println(numeros);
		
		//Borrar con metodos
		numeros.remove(1);
		System.out.println(numeros);
		
		//Borrar con metodos
		numeros.remove(Integer.valueOf("45"));
		System.out.println(numeros);
		
		//Limpiar con metodos
		numeros.clear();
		System.out.println(numeros);
	}//main

}//class
