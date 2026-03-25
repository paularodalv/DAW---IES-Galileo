package Temas;

public class UT02T0401E20 {

	public static void main(String[] args) {
		
		String palo1="";
	
		double palo = (Math.random()*4)+1;
		System.out.println(palo);
		
		double carta = (Math.random()*13)+1;
		System.out.println(carta);
		
		int i_palo = (int) palo;
		int i_carta = (int) carta;
		
		switch (i_palo) {
			case 1:
				 palo1 = "picas";
				break;
			case 2:
				palo1 = "trebol";
				break;
			case 3:
				 palo1 = "diamante";
				break;
			case 4:
				 palo1 = "corazones";
				break;
		
		} //Switch1
		
		switch (i_carta) {
			case 1:
				System.out.println("La carta seleccionada es: A de " + palo1 );
				break;
			case 2:
				System.out.println("La carta seleccionada es: 2 de " + palo1 );
				break;
			case 3:
				System.out.println("La carta seleccionada es: 3 de " + palo1 );
				break;
			case 4:
				System.out.println("La carta seleccionada es: 4 de " + palo1 );
				break;
			case 5:
				System.out.println("La carta seleccionada es: 5 de " + palo1 );
				break;
			case 6:
				System.out.println("La carta seleccionada es: 6 de " + palo1 );
				break;
			case 7:
				System.out.println("La carta seleccionada es: 7 de " + palo1 );
				break;
			case 8:
				System.out.println("La carta seleccionada es: 8 de " + palo1 );
				break;
			case 9:
				System.out.println("La carta seleccionada es: 9 de " + palo1 );
				break;
			case 10:
				System.out.println("La carta seleccionada es: 10 de " + palo1 );
				break;
			case 11:
				System.out.println("La carta seleccionada es: J de " + palo1 );
				break;
			case 12:
				System.out.println("La carta seleccionada es: Q de " + palo1 );
				break;
			case 13:
				System.out.println("La carta seleccionada es:  de " + palo1 );
				break;
		} //Switch2

	} //Main

} //Clase
