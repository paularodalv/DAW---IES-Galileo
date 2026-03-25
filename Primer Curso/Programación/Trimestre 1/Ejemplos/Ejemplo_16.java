package Temas;

public class Ejemplo16 {

	public static void main(String[] args) {
		
		int[] iVector; //declaracion del vector
		iVector = new int[4]; //inicializacion 
		
		iVector[0]=5;
		iVector[1]=4;
		iVector[2]=3;
		iVector[3]=8;
		
		for (int i=0; i<4; i++) {
			System.out.println(iVector[i]);
		}//for
		
		System.out.println("-----");
		
		float fVector[] = new float[4]; //Declarar e iniciar con valores por defecto
		
		for (int i=0; i<4; i++) {
			System.out.println(fVector[i]);
		}//for
		
		System.out.println("-----");
		
		double dVector[] = {3, 2.875, 1.6543}; //Declarar e iniciar con valores propios
		
		for (int i=0; i<dVector.length; i++) {
			System.out.println("dVector {" + i + "}" + dVector[i]);
		}//for
		
		System.out.println("-----");
		
		//String sVector[] = new String[4];
		String sVector[] = {"Manzanas", "Peras", "Naranjas", "Platanos"};
		
		sVector[2]="Fresa";
		
		for (int i=0; i<sVector.length; i++) {
			System.out.println(sVector[i]);
		}//for
		
		System.out.println("-----");
		
		for (String frutas: sVector) {
			System.out.println(frutas + " ");
		}//for each
		
		int iNumeros[] = {1, 2, 3, -4};
		int positivo=0, negativo=0;
		
		for (int numero: iNumeros) {
			if (numero<0) 
				negativo ++;
			else 
				positivo ++;
		}//for1
		
		System.out.println("Numeros negativos: " + negativo);
		System.out.println("Numeros positivos: " + positivo);
		
	}//main

}//class
