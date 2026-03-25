package Temas;

public class UT02T0404E01 {

	public static void main(String[] args) {
		int num = 5;
		int resultado = suma(num);
		
		System.out.println("La suma de 1 hasta " + num + " es: " + resultado);

	}//main
	
	public static int suma(int num) {
		int resultado=0;
		
		if (num==0)
			resultado = 0;
		else
			resultado = num + suma(num-1); 
		
		return resultado;
	}//suma

}//class
