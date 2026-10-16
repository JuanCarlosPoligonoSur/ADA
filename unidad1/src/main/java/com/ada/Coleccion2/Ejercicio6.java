package com.ada.Coleccion2;

import java.io.*;

public class Ejercicio6 {

    public static void main(String[] args) throws IOException {

        String rutaOrigen = System.getProperty("user.home")
                + File.separator + "Desktop"
                + File.separator + "HOLA.TXT";

        String rutaDestino = System.getProperty("user.home")
                + File.separator + "Desktop"
                + File.separator + "HOLA_MAYUSCULAS.TXT";

        // Creamos los objetos para leer y escribir.
        FileReader fr = new FileReader(rutaOrigen);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter(rutaDestino);
        PrintWriter pw = new PrintWriter(fw);

        int caracter;

        // Leemos carácter a carácter.
        while ((caracter = br.read()) != -1) {

            // Convertimos el carácter a mayúscula.
            char letra = Character.toUpperCase((char) caracter);

            // Eliminamos los espacios en blanco.
            if (!Character.isWhitespace(letra)) {
                pw.print(letra);
            }
        }

        // Cerramos los ficheros.
        br.close();
        pw.close();

        System.out.println("Fichero creado correctamente.");
    }
}