//Escribe un programa en el que escribas "Hola, Mundo" en un fichero. 

package com.ada.Coleccion2;
import java.io.*;

public class Ejercicio1 {

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



    }
    
}
