package Temas;

public class UT02T0402E05 {

	public static void main(String[] args) {
		
		int num;
		int suma=0;
		double media;
		
		num = (int)(Math.random() * 40) + 1;
		System.out.println(num + " ");
		
		int max= Math.max(num, num);;
		int min= Math.min(num, num);;
		
		for (int i = 0; i<5; i++) {
			
			num = (int)(Math.random() * 40) + 1;
			System.out.println(num + " ");
			
			suma = suma+num;

			if (num>max) {
				max = Math.max(num, num);
			}//if1
			
			if (num<min) {
				min = Math.min(num, min);
			}//if 2
			
		}//for
		
		media = (double) suma/50;
		
		System.out.println("Máximo: " + max);	
		System.out.println("Mínimo: " + min);
		System.out.println("Media: " + media);	

	}//main

}//class
