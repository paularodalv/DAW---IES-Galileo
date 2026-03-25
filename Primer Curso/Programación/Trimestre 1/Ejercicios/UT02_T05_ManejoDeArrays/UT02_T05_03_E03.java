package Temas;

import java.io.File;

public class UT02_T0503_E03 {

	public static void main(String[] args) {
		
		String rutaRecibida = args[0];
        File directorio = new File(rutaRecibida);
 
        while (args.length != 1){
            System.out.println("Error: Debes poner solo un parametro");
        }
 
        if (!directorio.exists()){
            System.out.println("Error: la ruta " + rutaRecibida + " no existe.");
        } else {
            File [] contenido = directorio.listFiles();
            if (contenido == null || contenido.length == 0) {
                System.out.println("El directorio está vacio");
            } else {
                System.out.println("Contenido de: " + directorio.getAbsolutePath());
 
                for (File item: contenido){
                    String tipo = item.isDirectory() ? "[DIR] " : "[FILE]";
                    System.out.println(tipo + " " + item.getName());
                }
            }
        }
	}//main

}//class
