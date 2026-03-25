package Temas;

public class UT02_T0404_E06 {

	public static void main(String[] args) {
		
int n = 10;
		
		System.out.println("Los " + n + "primeros numeros de Fibonacci: ");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}//for
	}//main
	
	public static int fibonacci(int n) {
		if (n==0) {
			return 0;
		} else if (n==1) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n -2);
		}
	}//fibonacci

}//class
