package Temas;

import java.io.PrintStream;

public class Ejemplo7 {

	public static void main(String[] args) {
		
		String ape="Fernandez";
			System.out.printf("Sr. %s puede %S %n", ape, "Valladolid");
			System.out.printf("Numero entero: %6d %n", 124);
			System.out.printf("Numero entero: %-6dsigo %n", 124);
			System.out.printf("Numero entero: %06d%n", 124);
			System.out.printf("Numero decimal: %f%n", Math.random());
			System.out.printf("Numero decimal: %.2f%n", Math.random());
			System.out.printf("Numero decimal: %+d %+d%n", -23, 45);
			
			System.out.printf("Numero decimal: %,.2f€%n", 1531211.6455);
			
			//Ejemplo 7.1
			
			System.out.println("----------	");
			
			double q=1.0/0;
			System.out.println(q);
		
	}

}
