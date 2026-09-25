//4. Escribir un método que muestre los nombres de los archivos de un directorio, 
// que se pasará como argumento cuya extensión coincida con la que se pase como segundo argumento.

package main.java.com.ada.Coleccion1;
import java.io.File;


public class Ejercicio4 {


    public static void listarPorExtension(File carpeta, String extension) {

        //Creo array con todos los elementos de la carpeta
        String[] nombres = carpeta.list();

        //Si hay elementos en el array, creo para cada uno de ellos un Objeto File elemento.
        if (nombres != null) {
            for (String nombre : nombres) {

                File elemento = new File(carpeta, nombre);

                //Si es un archivo y el nombre termina en .extension, escribe el nombre.
                if (elemento.isFile() && nombre.endsWith("." + extension)) {
                    System.out.println(nombre);
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
    listarPorExtension(carpeta,"txt");

    }
}



