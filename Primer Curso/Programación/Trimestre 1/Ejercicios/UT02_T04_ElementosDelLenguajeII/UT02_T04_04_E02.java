package Temas;

public class UT02T0404E02 {
	
	public static int contador=0;

	public static void main(String[] args) {
		
		int numero = 12345;
		int cantidad = contarDigitos(numero);
		
		System.out.println("El numero " + numero + " tiene " + cantidad + " digitos.");

	}//main
	
	public static int contarDigitos(int numero) {
		String sNumero = String.valueOf(numero);
		
		for (int i=0; i<sNumero.length(); i++) {
			contador++;
		}//for
		return contador;
		
	}//contarDigitos
}//class
