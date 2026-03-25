package Temas;

public class Ejemplo8 {

	public static void main(String[] args) {
		
		for (int i=7; i>=3; i -= 3) {
			System.out.println(i + " ");
		}//for1
		
		System.out.println("---------------");
		
		for (int i=5, j=6; i+j<15; i+=1) {
			System.out.println("i= " + i + "\tj = " + j);
		}//for2
		
		System.out.println("---------------");
		
		/*for (;;) {
			System.out.println("Sigo...");
		}//for3 BUCLE INFINITO*/
		
		for (char car='z'; car>= 'a'; car--) {
			System.out.println(car + " ");
		}//for4
		
	}//main

}//class
