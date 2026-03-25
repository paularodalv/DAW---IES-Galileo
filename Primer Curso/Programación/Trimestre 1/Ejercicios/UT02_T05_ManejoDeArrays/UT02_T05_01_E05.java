package Temas;

public class UT02T0501E05 {

	public static void main(String[] args) {
		
		int[][] m = {{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,6,7}};
		int sumDiag=0;
		
		for (int fila=0; fila<m.length; fila++) {
			int suma=0;
			for (int col=0; col<m[fila].length; col++) {
				System.out.print(m[fila][col]+" ");
				suma = suma + m[fila][col];
				if (fila==col) {
					sumDiag = sumDiag + m[fila][col];
				}
				
			}//for
			System.out.print(" -> " + suma);
			System.out.println();
		}//for
		
		System.out.println("La suma de la diagonal es: " + sumDiag);

	}//main

}//class
