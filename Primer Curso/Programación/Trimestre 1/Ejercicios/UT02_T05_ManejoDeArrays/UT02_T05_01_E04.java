package Temas;

import java.util.Arrays;
import java.util.Scanner;

public class UT02T0501E04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Declarar array
		String sNombre[] = {"Ana", "Juan", "Lucia"};
		String nombre = "";
		int opc = 0;
		
		
		do {
			System.out.printf("Elige ua opcion: %n 1. Visualizar nombres %n 2. Añadir nombre %n 3. Borrar nombre %n 4. Salir");
			opc=sc.nextInt();
			switch (opc) {
			case 1:
				visualizarNombres(sNombre);
				break;
			case 2:
				System.out.println("Introduce el nombre: ");
				nombre=sc.next();
				sNombre=anadirNombre(sNombre, nombre);
				System.out.println(Arrays.toString(sNombre));
				break;
			case 3:
				System.out.println("Introduce el nombre a borrar: "); 
				nombre = sc.next(); 
				sNombre = borrarNombres(sNombre, nombre); 
				System.out.println(Arrays.toString(sNombre));
				break;
			case 4:
				System.out.println("Hasta luego");
				break;
			}
		} while (opc!=0);

	}//main
	
	public static String[] anadirNombre(String sNombre[], String nomIntro) {
		sNombre = Arrays.copyOf(sNombre,sNombre.length+1);
		Arrays.fill(sNombre, sNombre.length-1, sNombre.length, nomIntro);
		return sNombre;
	}//añadir nombre
	
	public static void visualizarNombres(String[] visu) {
		for (int i=0; i<visu.length; i++) {
			System.out.println(visu[i]);
		}
	}//iniciar
	
	public static String[] borrarNombres(String[] sNombre, String nombre) {
		/*int j=0; //Utilizo la variable para controlar el nombreSupri
		String[] nomSupri= {};
		for (int i=0; i<sNombre.length; i++) {
			if (!sNombre[i].equals(nombre)) {
				nomSupri[i]=sNombre[i];
				j++;
			}//if
		}//for
		return sNombre;*/
		    int contador = 0;
		    for (int i = 0; i < sNombre.length; i++) {
		        if (!sNombre[i].equals(nombre)) {
		            contador++;
		        }//if
		    }//for
		    String[] nomSupri = new String[contador];
		    int j = 0;
		    
		    for (int i = 0; i < sNombre.length; i++) {
		        if (!sNombre[i].equals(nombre)) {
		            nomSupri[j] = sNombre[i];
		            j++;
		        }//if
		    }//for

		    return nomSupri;
	}//borrar

}//class
