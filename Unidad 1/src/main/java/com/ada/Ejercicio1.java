//Hecho con IA, repasar bien.
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



package ADA.ejercicio1.src.main.java.com.ada;

public class Ejercicio1 {
  
    public static void crearEstructura() throws IOException {

        // Directorio Escritorio del usuario
        String escritorio = System.getProperty("user.home") + File.separator + "Desktop";

        // Directorios
        File d = new File(escritorio, "d");
        File d1 = new File(d, "d1");
        File d2 = new File(d, "d2");
        File d21 = new File(d2, "d21");
        File d22 = new File(d2, "d22");
        File d3 = new File(d, "d3");
        File d31 = new File(d3, "d31");

        // Crear directorios
        d1.mkdirs();
        d21.mkdirs();
        d22.mkdirs();
        d31.mkdirs();

        // Ficheros
        new File(d1, "f11").createNewFile();
        new File(d1, "f12").createNewFile();
        new File(d21, "f21").createNewFile();
        new File(d22, "f222").createNewFile();

        System.out.println("Estructura creada correctamente.");
        //prueba 1
        
    }
}
    
}
