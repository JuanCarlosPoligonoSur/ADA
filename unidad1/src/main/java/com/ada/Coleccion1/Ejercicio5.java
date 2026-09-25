//5. Escribe un método que borre todos los ficheros que tienen la extensión txt 
// dentro de un directorio que se pasará como parámetro.

package main.java.com.ada.Coleccion1;
import java.io.File;


public class Ejercicio5 {


    public static void BorrarPorExtension(File carpeta, String extension) {

        //Creo array con todos los elementos de la carpeta
        String[] nombres = carpeta.list();

        //Si hay elementos en el array, creo para cada uno de ellos un Objeto File elemento.
        if (nombres != null) {
            
            int contador=0;
            
            for (String nombre : nombres) {

                File elemento = new File(carpeta, nombre);

                String nombreArchivo=elemento.getName();
                
                
                //Si es un archivo y el nombre termina en .extension, lo borra. .delete() devuelve true cuando lo elimina
                if (elemento.isFile() && nombre.endsWith("." + extension)&& elemento.delete()) {
                    
                    System.out.println("El archivo: " + nombreArchivo+" se ha borrado correctamente");
                    contador++;
                }
                
               
            }

            if(contador==0){

                System.out.println("No hay archivos que borrar");
                }
        }
    }


public static void main(String[] args){

    //Creo la ruta a la carpeta
    String carpetaAleatoria = System.getProperty("user.home") + File.separator + "Documentos";

    //Creo el objeto File llamado carpeta con la ruta deseada
    File carpeta= new File(carpetaAleatoria);  


    //llamo al metodo listar
    BorrarPorExtension(carpeta,"txt");

    }
}

