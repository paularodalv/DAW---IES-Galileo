package Temas;

import java.util.Scanner;

public class Ejemplo004 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso: java AnalizadorTexto \"frase entre comillas\"");
            return;
        }

        String frase = args[0];
        System.out.println("Frase recibida: " + frase);

        // 1. Convertir la frase en array de palabras
        String[] palabras = frase.split(" ");
        System.out.println("Número total de palabras: " + palabras.length);

        Scanner sc = new Scanner(System.in);

        // 2. Pedir N y contar palabras con más de N caracteres (recursivo)
        System.out.print("Introduce un número N: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        int palabrasLargas = contarLargas(palabras, n, 0);
        System.out.println("Palabras con más de " + n + " caracteres: " + palabrasLargas);

        // 3. Palabra más larga (iterativo)
        String masLarga = palabraMasLarga(palabras);
        System.out.println("Palabra más larga: " + masLarga);

        // 4. Pedir letra y contar apariciones en toda la frase (recursivo)
        System.out.print("Introduce una letra a buscar: ");
        String entradaLetra = sc.nextLine();
        while (entradaLetra.isEmpty()) {
            System.out.print("Introduce una letra válida: ");
            entradaLetra = sc.nextLine();
        }
        char letra = entradaLetra.charAt(0);

        int apariciones = contarLetra(frase, letra, 0);
        System.out.println("La letra '" + letra + "' aparece " + apariciones + " veces.");

        // 5. Invertir cada palabra del array (recursivo)
        String[] invertidas = new String[palabras.length];
        invertirArray(palabras, invertidas, 0);

        System.out.println("Array de palabras invertidas:");
        for (String p : invertidas) {
            System.out.print(p + " ");
        }
        System.out.println();

        sc.close();
    }

    // 2. Método recursivo: contar palabras con más de n caracteres
    public static int contarLargas(String[] palabras, int n, int index) {
        if (index == palabras.length) {
            return 0;
        }
        int suma = palabras[index].length() > n ? 1 : 0;
        return suma + contarLargas(palabras, n, index + 1);
    }

    // 3. Método para obtener la palabra más larga (no recursivo)
    public static String palabraMasLarga(String[] palabras) {
        String max = palabras[0];
        for (int i = 1; i < palabras.length; i++) {
            if (palabras[i].length() > max.length()) {
                max = palabras[i];
            }
        }
        return max;
    }

    // 5. Método recursivo: contar apariciones de una letra en la frase
    public static int contarLetra(String frase, char letra, int index) {
        if (index == frase.length()) {
            return 0;
        }
        int suma = (frase.charAt(index) == letra) ? 1 : 0;
        return suma + contarLetra(frase, letra, index + 1);
    }

    // Método recursivo para invertir una palabra
    public static String invertirPalabra(String palabra) {
        if (palabra.length() <= 1) {
            return palabra;
        }
        return invertirPalabra(palabra.substring(1)) + palabra.charAt(0);
    }

    // Método recursivo para llenar el array invertido
    public static void invertirArray(String[] original, String[] invertido, int index) {
        if (index == original.length) {
            return;
        }
        invertido[index] = invertirPalabra(original[index]);
        invertirArray(original, invertido, index + 1);
    }//invertirArray
}//class

