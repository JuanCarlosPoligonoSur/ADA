/*3.	Se tiene un fichero que contiene dos números enteros en cada línea. Se pide hacer un programa que lea el fichero y realice los siguientes cálculos: 
●	La media aritmética de los números que están en la primera columna. 
●	La media ponderada de los números de la primera columna empleando como pesos los de la segunda.
*/
package com.ada.Coleccion3;

import java.io.*;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {

        String ruta = System.getProperty("user.home")
                + File.separator + "Desktop"
                + File.separator + "numeros.txt";

        BufferedReader br = new BufferedReader(
                new FileReader(ruta));

        String linea;
        int sumaPrimeraColumna = 0;
        int sumaPesos = 0;
        int sumaPonderada = 0;
        int contador = 0;

        while ((linea = br.readLine()) != null) {

            String[] numeros = linea.trim().split("\\s+");

            int num1 = Integer.parseInt(numeros[0]);
            int num2 = Integer.parseInt(numeros[1]);

            sumaPrimeraColumna += num1;
            sumaPesos += num2;
            sumaPonderada += num1 * num2;

            contador++;
        }

        br.close();

        if (contador > 0) {

            double mediaAritmetica =
                    (double) sumaPrimeraColumna / contador;

            System.out.println("Media aritmética: "
                    + mediaAritmetica);

            if (sumaPesos != 0) {
                double mediaPonderada =
                        (double) sumaPonderada / sumaPesos;

                System.out.println("Media ponderada: "
                        + mediaPonderada);
            } else {
                System.out.println(
                        "No se puede calcular la media ponderada: "
                        + "la suma de los pesos es cero.");
            }

        } else {
            System.out.println("El fichero está vacío.");
        }
    }
}