package com.ada.Coleccion1;

/*1. Crea un método de Java que cree la siguiente estructura de ficheros y directorios en el directorio desde el escritorio de tu ordenador:

d 
    d1 
f11 
f12 
    d2 
        d21 
        f21 
        d22 
            f222 
    d3 
        d31

*/

import java.io.*;
public class Ejercicio1 {
  
    public static void main(String[] args) {

        // Estamos sacando la ruta al escritorio,sacamos el usuario, después el separador de archivos (/ linux o mac, \windows) y después Desktop. 
        // Si el escritorio no se llama Desktop falla el programa, se podría poner un bucle para que el usuario introduzca la ruta que quiera.

        String escritorio = System.getProperty("user.home") + File.separator + "Desktop";

        // Creo objetos File que representan los directorios


        File d = new File(escritorio, "d");
        File d1 = new File(d, "d1");
        File d2 = new File(d, "d2");
        File d21 = new File(d2, "d21");
        File d22 = new File(d2, "d22");
        File d3 = new File(d, "d3");
        File d31 = new File(d3, "d31");
    


        // Crear directorios, si mkdirs() crea también los padres. 
        // mkdir() tendría que haber creado también d, d2,d3 ya que solo crea el directorio indicado.
        d1.mkdirs();
        d21.mkdirs();
        d22.mkdirs();
        d31.mkdirs();

        
        // Ficheros
        try {

            new File(d1, "f11").createNewFile();
            new File(d1, "f12").createNewFile();
            new File(d21, "f21").createNewFile();
            new File(d22, "f222").createNewFile();

    


        } catch (IOException e) {
            //printStackTrace() muestra por consola la información de una excepción, incluyendo dónde y cómo ocurrió.
            //TODO Auto-generated catch block--- TODO= TO DO. Te lo pone el IDE para que lo revises. 

            
            e.printStackTrace();
            
            
            // otras Convenciones// TODO: hacer esto // FIXME: corregir esto // NOTE: tener esto en cuenta

        }
        

        System.out.println("Estructura creada correctamente.");
    
      

    }
}
    