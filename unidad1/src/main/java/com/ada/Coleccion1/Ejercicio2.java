//2. Crea un método de Java que dado como entrada el directorio raíz del ejercicio 1, 
// liste los ficheros y directorios del mismo, mostrando la misma información que se ve
//  en el ejercicio 1.

package com.ada.Coleccion1;
import java.io.*;

public class Ejercicio2 {
    public static void main(String[] args){

    //Creo la ruta a escritorio
    String escritorio = System.getProperty("user.home") + File.separator + "Desktop";

    //Creo el objeto File d en la ruta escritorio
    File e= new File(escritorio);  

    //Al objeto file le aplico list(),devuelve un array de cadenas de  caracteres con los nombres de los ficheros 
    // y directorios dentro del fichero asociado al objeto File  

    String[] contenido_E=e.list(); 


    System.out.println("El contenido de "+ d.getName()+" : ");

    for(String a:contenido_d) { 
        System.out.println(a);
    }


}  

   
}
