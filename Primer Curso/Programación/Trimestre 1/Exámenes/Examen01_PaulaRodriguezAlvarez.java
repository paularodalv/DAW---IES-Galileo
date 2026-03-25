package Temas;

public class Examen_PaulaRodriguezAlvarez {
    public static void main (String [] args) {
 
        //Variables
        //String frase = "La casa es azul";
        String frase = "Amo la paloma";
        int num_letra=0, i=0, num_palabra=1, errores=0;
        String frase_inv="";
       
        //Cuantas letras tiene
        for (i=0; i<frase.length()-1; i++) {
            char esp = frase.charAt(i);
            if (esp != ' ') {
                num_letra++;
            }//if
        }//for
       
        //Cuantas palabras tiene
        for (i=0; i<frase.length(); i++) {
            char esp = frase.charAt(i);
            if (esp == ' ') {
                num_palabra++;
            }//if
        }//for
       
 
        System.out.println("Número de letras: " + num_letra);
        System.out.println("Número de palabras: " + num_palabra);
 
        //Palabra a palabra
        String palabra_Act= " ";
        System.out.println("Palabra a palabra-------");
        for (i=0; i<frase.length();i++){
            char car = frase.charAt(i);
            if (car != ' ') {
                System.out.println(palabra_Act);
                palabra_Act += car;
            } else {
                palabra_Act = "";
            }//if..else
        }//for
        System.out.println(palabra_Act);
 
        //Letras en mayúscula
        System.out.println("Mayúsculas-------");
        String resultado = "";
        for (i=0; i<frase.length(); i++){
            char c = frase.charAt(i);
            if (i==0 || frase.charAt(i -1) == ' '){
                resultado += Character.toUpperCase(c);
            } else {
                resultado += c;
            }//if...else
        }//for
        System.out.println(resultado);
 
        //Saber si es palíndromo
        System.out.println("Palíndromo-------");
        for (i=0; i>frase.length()/2; i++){
            if (frase.charAt(i)!=frase.charAt(frase.length()-1-i)){
                errores++;
            }//if
        }//for
        if (errores==0)
            System.out.println("Es palíndromo");
        else
            System.out.println("No es palíndromo");
 
    }//main
}//class