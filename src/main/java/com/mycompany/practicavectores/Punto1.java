package com.mycompany.practicavectores;

import java.util.Random;

/**
 * Se necesita de un vector que sea capaz de almacenar 10 números enteros entre
 * 1 y 100. Realizar un programa que permita la carga por teclado de los 10
 * números solicitados.
 */
public class Punto1 {

    public static void main(String[] args) {

        System.out.println("Al vector le ingreso 10 valores entre 1 y 100 de forma random.");
        System.out.println("Luego los muestro");
        
        Mostrar(GestorVector());

    }

    static int[] GestorVector() {

        // Aca implemento la logica del vector.
        int[] vector10 = new int[10];
        int min = 1;
        int max = 100;

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int value = random.nextInt(max + min) + min;
            vector10[i] = value;
        }
        return vector10; // Luego lo devulevo ya armado con los valores.
    }

    static void Mostrar(int[] unVector) {
        
        //Implemento la logica para leer y mostrar el vector
        
        for (int i = 0; i < unVector.length; i++) {
            System.out.println(unVector[i]);
        }
    }

}
