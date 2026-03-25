package Temas;

import java.util.Locale;
import java.util.Scanner;

public class UT02_T0501_E07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		boolean sala[][] = new boolean[10][30];
		int vendidas[]= {0};
		int opc;
		while ((opc=imprimeMenu(sc)) != 4) {
			switch (opc) {
			case 1: 
				ventaEntrada(sala, vendidas, sc);
				break;
			case 2:
				filasCompletadas(sala);
				break;
			case 3:
				estadoOcupacion(sala, vendidas[0]);
				break;
			}//switch
		}//while
		localidadesVendidas(vendidas[0]);
 
	}//main
	public static int imprimeMenu(Scanner sc) {
		System.out.println("CINE \n 1. Venta de entradas. \n 2. Filas completas. \n 3. Estado de ocupacion. \n 4. Fin. \n ¿Opcion?: ");
		return sc.nextInt();
	}//imprimeMenu
	public static void ventaEntrada(boolean sala[][], int vendidas[], Scanner sc) {
		System.out.println("Fila (1-10): ");
		int fila = sc.nextInt()-1;
		System.out.println("Fila (1-30): ");
		int butaca = sc.nextInt()-1;
		if (fila < 0 || fila >= 10 || butaca < 0 || butaca >= 30) {
			System.out.println("Localidad incorrecta.");
		} else if (sala[fila][butaca]) {
			System.out.println("La butaca ya esta ocupada");
		} else {
			sala[fila][butaca] = true; 
			vendidas[0]++;
			System.out.println("Entrada vendida correctamente");
		}//if
	}//ventaEntrada
	public static void filasCompletadas(boolean sala[][]) {
		boolean hay = false;
		for (int i=0; i<sala.length; i++) {
			boolean completa = true;
			for (int j=0; j<sala[i].length;j++) {
				if (!sala[i][j]) {
					completa = false;
				}//if
			}//for
			if (completa) { //hay == true
				System.out.println("Fila " + (i+1) + " completa");
				hay = true;
			}//if
		}//for
		if (!hay) { //hay == false
			System.out.println("No hay filas completas");
		}//if 
	}//filasCompletadas
	public static void estadoOcupacion(boolean sala[][], int vendidas) {
		int total = sala.length * sala[0].length;
		System.out.println("Butacas vendidas: " + vendidas);
		System.out.println("Butacas libres: " + (total - vendidas));
		System.out.println("Ocupación: " + (vendidas * 100 / total));
	}//estadoOcupacion
	public static void localidadesVendidas(int vendidas) {
		System.out.println("Localidades vendidas: " + vendidas + "\n Programa finalizado.");
	}//localidadesVendidas
 
}//class