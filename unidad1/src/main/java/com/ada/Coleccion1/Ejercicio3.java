//3. Modifica el método del ejercicio 2 para que pueda listar cualquier estructura de ficheros y directorios que contenga el directorio 
// raíz pasado como parámetro. Pruébalo con varias estructuras de directorios y ficheros.

package com.ada.Coleccion1;
import java.io.*;

public class Ejercicio3 {

    




    // método para listar todo el contenido de una carpeta
    public static void listar(File carpeta) {

    //Hago un array con los nombre de los elementos en la carpeta.
    String[] nombres = carpeta.list();

    //Si el array no está vacío, hago un for each con el nombre de cada elemento
    if (nombres != null) {
        for (String nombre : nombres) {

            //creo un objeto file llamado elemento con cada nombre encontrado en carpeta
            File elemento = new File(carpeta, nombre);
            
            //Imprimo el nombre de cada elemento.
            System.out.println(elemento.getName());


            //Si el elemento es una carpeta, vuelvo a llamar al método listar
            if (elemento.isDirectory()) {
                listar(elemento);
            }
        }
    }
    }

    
    public static void main(String[] args){

    //Creo la ruta a la carpeta
    String carpetaAleatoria = System.getProperty("user.home") + File.separator + "Documentos";

    //Creo el objeto File llamado carpeta con la ruta de escritorio
    File carpeta= new File(carpetaAleatoria);  


    //llamo al metodo listar
    listar(carpeta);

    }
}



