package Temas;

public class Ejemplo12 {

	public static void main(String[] args) {
		compruebahora(12, 23, 57);
		compruebahora(7, 3, 5);

	}//main
	
	public static void compruebahora(int h1, int m2, int s3) {
		if (h1 >=0 && h1<=23) {
			if (m2 >= 0 && m2<=59) {
				if (s3 >=0 && s3<=59) {
					System.out.printf("La hora %02d : %02d : %02d es valida" , h1,m2,s3);
				} else {
					System.out.printf("La hora %02d : %02d : %02d no es valida" , h1,m2,s3);
				}
			} else {
				System.out.printf("La hora %02d : %02d : %02d no es valida" , h1,m2,s3);
			}
		} else {
			System.out.printf("La hora %02d : %02d : %02d no es valida" , h1,m2,s3);
		}
	}//compruebahora

}//class
