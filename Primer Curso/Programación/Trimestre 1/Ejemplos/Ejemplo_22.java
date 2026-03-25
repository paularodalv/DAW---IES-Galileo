package Temas;

public class Ejemplo22 {

	public static void main(String[] args) {
		
		
		//Programa 1
		for (int i=0; i<args.length;i++){
			System.out.println(args[i]);
		}//for
		
		//Programa 2
		System.out.println("Buenos dias " + args[0]);
		System.out.println("El ano que viene tendras " + (Integer.parseInt(args[1])+1) + " anos.");

		//Programa 3
		if (args.length < 1) {
			System.out.println("Debes meter un elemento");
		} else if (args.length > 1){
			System.out.println("Debes meter UN elemento");
		} else {
			System.out.println("Buenos dias " + args[0]);
		}//if...else
		
	}//main

}//class
