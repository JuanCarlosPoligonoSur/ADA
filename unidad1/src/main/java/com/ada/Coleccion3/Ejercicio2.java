/*2.	Escribe un programa que cree un archivo que contiene parejas de números enteros separados por blanco en cada línea. La introducción de datos finalizará al pulsar la tecla INTRO.
Ejemplo de estructura del documento:
12 14
25 12

Nota: Los números en el documento deberán representarse mediante un tipo primitivo de Java (int), no mediante caracteres.
Nota 2: Puedes utilizar un Scanner para introducir los números por teclado.
Nota 3: La comprobación de si se ha pulsado la tecla INTRO se deberá hacer cuando introduzcas dos números, dado que los números van en parejas. Puedes introducir por teclado los números de uno en uno o de dos en dos.
 */
package com.ada.Coleccion3;

import java.io.*;
import java.util.Scanner;

public class Ejercicio2
{

    public static void main(String[] args) throws IOException {

        String ruta = System.getProperty("user.home")
                + File.separator + "Desktop"
                + File.separator + "numeros.dat";

        Scanner sc = new Scanner(System.in);

        DataOutputStream dos = new DataOutputStream(
                new FileOutputStream(ruta));

        System.out.println("Introduce parejas de números enteros.");
        System.out.println("Pulsa INTRO sin escribir nada para terminar.");

        while (true) {

            System.out.print("Introduce el primer número: ");
            String entrada = sc.nextLine();

            // Si pulsamos INTRO sin escribir nada, terminamos.
            if (entrada.isEmpty()) {
                break;
            }

            int num1 = Integer.parseInt(entrada);

            System.out.print("Introduce el segundo número: ");
            int num2 = Integer.parseInt(sc.nextLine());

            // Escribimos los dos números como int.
            dos.writeInt(num1);
            dos.writeInt(num2);
        }

        dos.close();
        sc.close();

        System.out.println("Fichero creado correctamente.");
    }
}