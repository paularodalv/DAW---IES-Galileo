package Temas;

public class Ejemplo11 {
	static int valor; //ambito de clase, se inicializan, tipo primitivo
	static String valorS; //tipo objeto

	public static void main(String[] args) {
		/*//*
		tresSaludos();
		
		//*
		tresSaludos();
				
		//*
		tresSaludos();*/
		
		/*//*
		int a=7;
		variosSaludos(a);*/
	
		//*
		variosSaludosPers(4, "Pepe");//parametros actuales
	
	}//main
	/*public static void tresSaludos() {
		int a=0;
		System.out.println("....");
		for (int i=0; i<3; i++) {
			System.out.println("Hola");
			System.out.println("i: " + i);
		}//for
		
		System.out.println("valor: " + valor);
		System.out.println("valorS: " + valorS);
		
	}//tresSaludos*/
	
	/*public static void variosSaludos(int veces) {
		for (int i=0; i<veces; i++) 
			System.out.println("Hola");
	}//variosSaludos*/
	
	public static void variosSaludosPers(int veces, String nombre) {
	for (int i=0; i<veces; i++) 
		System.out.println("Hola " + nombre);
}//variosSaludos

}//class
