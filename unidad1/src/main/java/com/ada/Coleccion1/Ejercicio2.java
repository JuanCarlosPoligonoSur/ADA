//2. Crea un método de Java que dado como entrada el directorio raíz del ejercicio 1, 
// liste los ficheros y directorios del mismo, mostrando la misma información que se ve
//  en el ejercicio 1.

package com.ada.Coleccion1;
import java.io.*;

public class Ejercicio2 {

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

            //Una función que he encontrado consigue la ruta total del elemento  .getAbsolutePath()

            //Si el elemento es una carpeta, vuelvo a llamar al método listar
            if (elemento.isDirectory()) {
                listar(elemento);
            }
        }
    }
    }

    
    public static void main(String[] args){

    //Creo la ruta a escritorio
    String escritorio = System.getProperty("user.home") + File.separator + "Desktop";

    //Creo el objeto File llamado carpeta con la ruta de escritorio
    File carpeta= new File(escritorio);  


    //llamo al metodo listar
    listar(carpeta);



    
}  

   
}
