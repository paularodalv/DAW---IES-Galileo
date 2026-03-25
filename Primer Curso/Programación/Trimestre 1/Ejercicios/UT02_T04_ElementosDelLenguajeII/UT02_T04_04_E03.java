package Temas;

public class UT02T0404E03 {
	
	public static int cociente=0;

	public static void main(String[] args) {
		
		int dividendo = 7;
		int divisor = 3;
		int cociente = dividir(dividendo, divisor);
		int resto = dividendo - cociente * divisor;
		
		System.out.println("Dividendo: " + dividendo);
		System.out.println("Divisor: " + divisor);
		System.out.println("Cociente: " + cociente);
		System.out.println("Resto: " + resto);

	}//main
	
	public static int dividir(int dividendo, int divisor) {
		if (dividendo>=divisor) {
			dividendo = dividendo - divisor;
			cociente++;
			dividir(dividendo, divisor);
		} else if (dividendo<divisor)
			return cociente;
		return cociente;
	}//dividir

}//class
