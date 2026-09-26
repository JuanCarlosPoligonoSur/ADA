//Lee un fichero.

package com.ada.Coleccion2;
import java.io.*;

public class Ejercicio3 {

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
        try{
            FileReader fr= new FileReader(rutaArchivo);
            BufferedReader br= new BufferedReader(fr);

            //El br.readLine() lo metemmos en un string que va a contener la línea leída
            //  para después imprimirlo.
            String linea;

            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }

        // Hay que cerrar br
        br.close();

        //Capturo excepción de archivo no encontrado
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
}