package Temas;

import java.util.Arrays;

public class Examen3_PaulaRodriguezAlvarez {

	public static void main(String[] args) {
	     // Nombres de los países 
	        String[] paises = {"España", "Francia", "Italia", "Chile"}; 
	     // Temperaturas mensuales ya inicializadas (12 meses por país) 
	        
	        int[][] temperaturas = { {12, 14, 16, 18, 22, 26, 30, 29, 25, 20, 15, 13}, // España 
	        							{8, 10, 12, 15, 18, 22, 25, 24, 20, 16, 12, 9}, // Francia 
	        							{6, 8, 12, 16, 20, 24, 28, 27, 23, 18, 12, 8}, // Italia 
	        							{5, 7, 10, 12, 15, 18, 20, 21, 18, 14, 10, 7} // Chile
	        };
	        
	        //System.out.println("\n--- Tabla por paises ---"); 
	        imprimirTemperaturasMensuales(paises, temperaturas);
	    
	        //System.out.println("\n--- Tabla por meses ---"); 
	        //imprimirTemperaturasMensuales(paises, temperaturas, 3);
	        
	        System.out.println("\n--- Media Anual de Francia ---");
	        System.out.println(mediaAnualPais(temperaturas, buscarPais(paises, "Francia")));
	        
	        
	     // Procesar cada país pasado como argumento 
	       
	     /*try {
	    	 System.out.println("Media anual de " + args + mediaAnualPais(temperaturas, buscarPais(paises, "Francia")));
	     } catch (Arrays.IndexOutOFBoundsException e) {
	    	 System.out.println("El pais " + args + " no existe.");
	     }//try...catch*/

	    }//main
	
	public static double mediaAnualPais (int temperaturas[][], int pais) {
		double media = 0.0;
		
		for (int i=0; i<temperaturas[pais].length; i++) {
			media = media + temperaturas[pais][i];
		}//for
		
		return media/temperaturas[pais].length;
	}//mediaAnualPais
	 
	// Buscar país por nombre (ignora mayúsculas/minúsculas) 
	 public static int buscarPais(String[] paises, String nombre) {
		 int indice = -1;
		 
		 for (int i = 0; i < paises.length; i++) 
			 if (paises[i].equalsIgnoreCase(nombre))  
				 indice = i;   
		
		 return indice; 
	}//buscarPais
	 
	 public static void imprimirTemperaturasMensuales(String paises[], int temperaturas[][]){
			
			for (int i=0; i < paises.length; i++) {
				System.out.println("País: " + paises[i]);
				System.out.print("Temperaturas: ");
				for (int j=0; j < temperaturas[i].length; j++) {
					System.out.print(temperaturas[i][j] + " ");
				}
				System.out.println();
			}//for
		}//imprimirTemperaturasMensuales

	
	public static void imprimirTemperaturasMensuales(String paises[], int temperaturas[][], int letra){
		
		String mes[] = {"ene", "feb", "mar", "abr", "may", "jun", "jul", "agos", "sep", "oct", "nov", "dic"};
		
		switch (letra) {
		case 1:
			imprimirTemperaturasMensuales(paises, temperaturas, letra);
			break;
		}
		
		for (int i=0; i < paises.length; i++) {
			System.out.println(paises[i] + " ");
			for (int j=0; j<temperaturas.length; j++) {
				//System.out.print(mes[j] + " " + paises[i] + temperaturas[0][i] );
			}//for2
			System.out.println();
		}//for
	}//imprimirTemperaturasMensuales

}//class
