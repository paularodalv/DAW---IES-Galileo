package Temas;

import java.util.Arrays;

public class Ejemplo17 {

	public static void main(String[] args) {
		
		 int[] iVector;
		 iVector = new int[4];
		 
		 inicializarVector(iVector);
		 System.out.println("Valor: " + iVector[0]);
		 System.out.println("------");
		 visualizarVector(iVector);
		 
		 int iNumeros[] = {1,-2,3,-4};
		 System.out.println("------");
		 System.out.println("Con string: " + Arrays.toString(iNumeros));
		 
		 System.out.println("------");
		 Arrays.fill(iNumeros, 5);
		 System.out.println("Con fill: " + Arrays.toString(iNumeros));
		 
		 //Mismo tipo, misma longitud y mismo contenido == true
		 System.out.println("------");
		 System.out.println("Iguales?: " + Arrays.equals(iNumeros, iVector));
		 
		 System.out.println("------");
		 Arrays.sort(iNumeros); //Ordenar el Array
		 System.out.println("Buscar: " + Arrays.binarySearch(iNumeros, 8));
		 
		 //CopyOf
		 int copy[] = {1,-2,3,-4, 5, 7, 9, 55};
		 int[] cmenor, cmayor, cmedio;
		 cmenor = Arrays.copyOf(copy, 4);
		 cmayor = Arrays.copyOf(copy, 20);
		 cmedio = Arrays.copyOfRange(copy, 3,5);
		 
		 System.out.println("Cmenor: " + Arrays.toString(cmenor));
		 System.out.println("Buscar: " + Arrays.toString(cmayor));
		 System.out.println("Buscar: " + Arrays.toString(cmedio));
		 
		 //Arraycopy clase System
		 System.out.println("------");
		 int numeroOrigen[] = {0,1,1,1,1};
		 int numeroDestino[] = {0,2,2,2,2,2,2,2,2,2};
		 System.arraycopy(numeroOrigen, 0, numeroDestino, 0, numeroOrigen.length);
		 System.out.println("Arraycopy: " + Arrays.toString(numeroOrigen));
		 System.out.println("Arraycopy: " + Arrays.toString(numeroDestino));

	}//main
	
	public static void inicializarVector(int[] inic) {
		inic[0] = 1;
		inic[1] = -2;
		inic[2] = 3;
		inic[3] = -4;
	}//iniciar
	
	public static void visualizarVector(int[] visu) {
		for (int i=0; i<visu.length; i++) {
			System.out.println("Vector: " + visu[i]);
		}
	}//iniciar

}//class
