package com.ada.Coleccion2;
import java.io.*;


//Realiza un programa que cuente el número de palabras de un fichero 

public class Ejercicio5 {
    //Sin lanzar la excepción, no funciona el programa con un FileWriter
    public static void main(String[] args) throws IOException {
        String frase = "Hola Mundo";

        String rutaArchivo = System.getProperty("user.home") + File.separator + "Desktop"+File.separator+"HOLA.TXT";

        //El append true permite añadir una línea cada vez que se ejecute el fichero. Si no lo pongo, lo machaca.
        FileWriter fw= new FileWriter(rutaArchivo,true);
        PrintWriter pw= new PrintWriter(fw);


        pw.println(frase);

        //Poner siempre el flush y el close. flush limpia y close lo cierra en memoria. 
        pw.flush();
        pw.close();
        



        //Para usar un BufferedReader necesito crear primero un FileReader
        //Después va leyendo línea a línea hasta que encuentra null.
        int contadorPalabras = 0;
        int c=0;
        try{
            FileReader fr= new FileReader(rutaArchivo);
            BufferedReader br= new BufferedReader(fr);

       
        int caracter;
        boolean dentroDePalabra = false;

        // Leemos carácter a carácter.
        while ((caracter = br.read()) != -1) {

            // Si NO es un espacio ni un salto de línea,
            // estamos dentro de una palabra.
            if (caracter != ' ' && caracter != '\n' && caracter != '\r') {

                // Solo contamos la palabra al encontrar su primer carácter.
                if (!dentroDePalabra) {
                    contadorPalabras++;
                    dentroDePalabra = true;
                }

            } else {
                // Hemos encontrado un espacio o salto de línea,
                // por lo que la siguiente letra será el inicio
                // de una nueva palabra.
                dentroDePalabra = false;
            }
        }

        br.close();

    }catch(IOException e ){
        e.printStackTrace();
    }
        System.out.println("El documento contiene "
                + contadorPalabras + " palabras.");
    }
}
    

