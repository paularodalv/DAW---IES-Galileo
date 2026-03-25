package Temas;

import java.util.Scanner;

class ejercicioentornosPaulaRodalv {
    public static void main (String [] args) {
       
        Scanner sc = new Scanner(System.in);
 
        int numP=0, numN=0, numM=0, numA=0, num=0, numT=0;
 
        System.out.println("¿Numero?");
        num = sc.nextInt();
 
        while (num!=0 && num>numA){
            numA = num;
            if (num !=0) {
                numT = numT+1;
                if (num>0)
                    numP = numP+1;
                else
                    numN = numN+1;
            if (num % 2 == 0 && num > numM) {
                numM = num;
            }//if
            System.out.println("¿Numero? Debe ser mayor que " + numA + " o 0 para finalizar");
            num = sc.nextInt();
            }//if
        }//while
 
        System.out.println("Total de datos de la serie: " + numT);
        System.out.println("Total de datos negativos: " + numN + " Total positivos: " + numP);
        System.out.println("El mayor par es: " + numM);
 
    }//main
}//class
