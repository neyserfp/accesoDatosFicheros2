package com.neyser;

import java.io.File;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //File file1 = new File("carpetaDatos1");
        File file2 = new File("carpetaDatos1/datos1.txt");

        try
        {
            if (file2.createNewFile())
            {
                System.out.println("El fichero ha sido creado");
            } else
            {
                System.out.println("El fichero NO ha sido creado");
            }
        } catch (IOException e)
        {
            System.out.println("Error, no se pudo crear el fichero "+e.getMessage());
            e.printStackTrace();
        }




        System.out.printf("Hello and welcome!");

        /*
         * 1. Creo el objeto propio de Java
         * 2. Llamar al objeto de java para la creación de la carpeta
         * 3. Evaluar si la carpeta ha sido creada (el punto 2 y 3 se ejecuta de forma simultanea)
         * 4.
         * */

    }
}