package Temas;

public class UT02_T0502_E03 {

	public static void main(String[] args) {
		
		String original = "Hola mundo";
		String invertida = invertirCadena(original);
		
		System.out.println("Original: " + original);
		System.out.println("Invertida: " + invertida);

	}//main
	
	public static String invertirCadena(String texto) {
		return new StringBuilder(texto).reverse().toString();
	}//invertirCadena

}//class
