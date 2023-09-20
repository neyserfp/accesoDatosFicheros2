package com.neyser;

import java.io.File;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Clase    objeto  constructor
        File file1 = new File("./carpetaDatos");
        File file2 = new File("./carpetaDatos/carpetaDatos2");

        if (file2.mkdirs())
        {
            System.out.println("El directorio ha sido creado");
        } else
        {
            System.out.println("El directorio no ha sido creado");
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