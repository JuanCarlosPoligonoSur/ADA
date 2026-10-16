//1.	Realiza un programa que realice una copia de una imagen que se encuentre en tu escritorio. 
package com.ada.Coleccion3;


import java.io.*;

public class Ejercicio1 {

    public static void main(String[] args) throws IOException {

        String rutaOrigen = System.getProperty("user.home")
                + File.separator + "Desktop"
                + File.separator + "foto.jpg";

        String rutaDestino = System.getProperty("user.home")
                + File.separator + "Desktop"
                + File.separator + "foto_copia.jpg";

        // Abrimos el fichero original para leerlo.
        FileInputStream fis = new FileInputStream(rutaOrigen);

        // Abrimos el fichero de destino para escribir la copia.
        FileOutputStream fos = new FileOutputStream(rutaDestino);

        int dato;

        // Leemos y copiamos byte a byte.
        while ((dato = fis.read()) != -1) {
            fos.write(dato);
        }

        // Cerramos los ficheros.
        fis.close();
        fos.close();

        System.out.println("Imagen copiada correctamente.");
    }
} 