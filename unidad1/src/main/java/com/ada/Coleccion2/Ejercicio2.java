//Modifica el programa anterior para escribir en el fichero ya creado.
package main.java.com.ada.Coleccion2;
import java.io.*;

public class Ejercicio2 {

   //Sin lanzar la excepción, no funciona el programa con un FileWriter
   public static void main(String[] args) throws IOException {
    String frase = "Hola Mundo";

    String rutaArchivo = System.getProperty("user.home") + File.separator + "Desktop"+File.separator+"HOLA.TXT";

    //El append true permite añadir una línea cada vez que se ejecute el fichero. Si no lo pongo, lo machaca.
    // YA CUMPLÍA EN EL ejercicio1 lo de volver a poder a escribir.
    FileWriter fw= new FileWriter(rutaArchivo,true);
    PrintWriter pw= new PrintWriter(fw);


    pw.println(frase);

    //Poner siempre el flush y el close. flush limpia y close lo cierra en memoria. 
    pw.flush();
    pw.close();



    }
    
}
