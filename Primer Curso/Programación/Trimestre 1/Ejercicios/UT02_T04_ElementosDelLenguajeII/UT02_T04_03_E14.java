package Temas;
import java.util.Scanner;
import java.util.Random;
public class UT02T0403E14 {
 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Introduce la longitud de la contraseña");
		int longitud= sc.nextInt();
		
		System.out.println("Introduce la longitud de la contraseña");
		int cantidad= sc.nextInt();
		
		generarContrasena(longitud);
		generarContrasena(longitud, cantidad);
	}
	public static void generarContrasena(int longitud) {
		Random r= new Random();
		char carac=' ';
		String car="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()" ;
		
		for(int i=0; i<longitud;i++) {
			carac=car.charAt(r.nextInt(1,car.length()-1));
			System.out.print(carac);
			
		}
		System.out.println();
	}//generaContraseña2
	
	public static void generarContrasena(int longitud, int cantidad) {
		Random r= new Random();
		char carac=' ';
		String car="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()" ;
		for(int j=1; j<cantidad;j++) {
			for(int i=1; i<longitud;i++) {
				carac=car.charAt(r.nextInt(0,car.length()));
				System.out.print(carac);
				
			}
			System.out.println();
		}
	}//generaContraseña1
	
}//class
 
