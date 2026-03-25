package Temas;

import java.util.Random;
import java.util.Scanner;

public class UT02T0403E15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Nombre: ");
		String nombre = sc.next();
		
		System.out.println("Apellido: ");
		String apellido = sc.next();
		
		System.out.printf("Seleccione el nivel de dificultad de la contraseña: %n 1. Baja %n 2. Media %n 3. Alta ");
		int nivel_contrasena = sc.nextInt();
		
		switch (nivel_contrasena) {
			case 1:
				System.out.println("Su contraseña generada es: " + obtenerContrasenaBaja(nombre, apellido));
				break;
			case 2: 
				System.out.println("Su contraseña generada es: " + obtenerContrasenaMedia(nombre, apellido));
				break;
			case 3:
				System.out.println("Su contraseña generada es: " + obtenerContrasenaAlta(nombre, apellido));
				break;
		}//switch

	}//main
	
	public static String obtenerContrasenaBaja (String nom, String apell) {
		String contrasena1="", nom1= nom.toLowerCase(), apell2 = apell.toLowerCase();
		Random rand = new Random();
	
		for (int i=0; i<3; i++) {
			contrasena1 = contrasena1 + nom1.charAt(i);
		}//for
		for (int i=0; i<3; i++) {
			contrasena1 = contrasena1 +  apell2.charAt(i);
		}//for
		for (int i=0; i<1; i++) {
			contrasena1 = contrasena1 + rand.nextInt(10,99);
		}//for
		return contrasena1;
	}//contrasenaBaja
	
	public static String obtenerContrasenaMedia (String nom, String apell) {
		String contrasena2=obtenerContrasenaBaja(nom, apell), carc = "!@#$%&*?";
		char c = ' ';
		Random rand = new Random();

		for (int i=0; i<1; i++) {
			c = carc.charAt(rand.nextInt(1,carc.length()-1));
			contrasena2 = contrasena2 + c; 
		}//for
		return contrasena2;
	}//contrasenaMedia
	
	public static String obtenerContrasenaAlta (String nom, String apell) {
		String contrasena3=obtenerContrasenaMedia(nom, apell), carc = "!@#$%&*?", letr ="ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
		char c = ' ', l =' ';
		Random rand = new Random();
		Scanner sc1 = new Scanner (System.in);
		
		System.out.println("Longitud de la contraseña: (De 10 a 20)");
		int longitud = sc1.nextInt();
		
		for(int i=0; i<8;i++) {
			for (int j=0; j<longitud;j++) {
				c = carc.charAt(rand.nextInt(1,carc.length()-1));
				l = letr.charAt(rand.nextInt(1,letr.length()-1));
			}
			contrasena3 = contrasena3  + "_" + c + l; 
		}//for
		
		return contrasena3;
	}//contrasenaAlta

}//class
