package Temas;

public class UT02T0403E04 {

	public static void main(String[] args) {
		
	int num=0;
	
		for (int z=1; z<50; z++) {
				for (int x=1; x<50; x++) {
						for (int y=1; y<50; y++) {
							if (cuadrado(z)==(cuadrado(x))+(cuadrado(y))) {
								System.out.println(z + " " + x + " " + y);
								num++;
							}//if
						}//for
				}//for
		}//for
		
		System.out.println("Total de elementos: " + num);

	}//main
	
	public static int cuadrado(int valor) {
		return valor * valor;
	}//cuadrado 

}//class
