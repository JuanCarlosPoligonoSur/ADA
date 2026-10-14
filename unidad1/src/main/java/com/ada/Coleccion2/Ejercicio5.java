package com.ada.Coleccion2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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

        int c=0;
        try{
            FileReader fr= new FileReader(rutaArchivo);
            BufferedReader br= new BufferedReader(fr);

          //Leo lcaracter a carácter a carácter al usar br.read()
            int caracter;
            //split
            // bandera que indique si
            boolean puedoContar=true;  
            caracterPrevio='';
            while((caracter=(br.read()))!=-1){                
               if(caracter!=32 || caracter!=10 ){
                c++;
                puedoContar=false;
               }
               if(caracter!=32 || caracter!=10 ){
                caracterpREVIO=CARACTER;
                if (caracterPrevio) //  Caracter previo es igual 10 o 32 y caracter actual es igual a 10 o 32
               
               }else{
                 puedoContar=false;
               }
               

                
            }

        // Hay que cerrar br
        br.close();

        //Capturo excepción de archivo no encontrado
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("El documento contiene "+(c+1)+" palabras.");
    }
    
}
