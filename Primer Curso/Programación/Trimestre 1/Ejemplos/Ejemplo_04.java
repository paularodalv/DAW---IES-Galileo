package Temas;

class coche {
	int numero;
}

public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		coche miCoche = new coche();
		miCoche.numero=3;
		
		coche cPedro = new coche();
		cPedro.numero=5;
		
		System.out.println("mio: " + miCoche.numero);
		System.out.println("Pedro: " + cPedro.numero);
		
		miCoche=cPedro;
		System.out.println("mio: " + miCoche.numero);
	}

}
