package Temas;

public class Ejemplo6 {

	public static void main(String[] args) {
		
		int num = 3;
			
			//Switch para casos
			switch (num) {
				case 1:
					System.out.println("Valor 1");
					break;
				case 2:
					System.out.println("Valor 2");
					break;
				default:
					System.out.println("Otro valor");
					break;
			} //switch1
			System.out.println("------------------------");
			
			//Switch para sentencias
			switch (num) {
				case 1:
				case 3:
				case 5:
					System.out.println("Impar");
					System.out.println("Es 1, 3 o 5");
					break;
				case 2:
				case 4:
				case 6:
					System.out.println("Par");
					System.out.println("Es 2, 4 o 6");
					break;
			} //switch2
			
			System.out.println("------------------------");
			
			//Switch con caracteres
			char car = 'n';
			
			switch (car) {
				case 'n':
				case 'N':
				case 's':
				case 'S':
					System.out.println("El caracter es valido");
					break;
				default:
					System.out.println("El caracter no es valido");
					break;
			} //switch3
	} //Main

} //Clase
