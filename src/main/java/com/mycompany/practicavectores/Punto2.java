/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicavectores;

import java.util.Random;

/**
 * En un vector de 15 posiciones se almacenan las edades de 15 alumnos. Se desea
 * un programa que sea capaz de determinar cuál es la mayor edad y cuál es la
 * menor edad que se encuentra entre los estudiantes.
 */
public class Punto2 {

    public static void main(String[] args) {

        Mostrar(GestorAlumno());
        
    }

    static Alumno[] GestorAlumno() {

        // Aca implemento la logica del vector.
        Alumno[] vectorA = new Alumno[15];
        int min = 15;
        int max = 20;

        for (int i = 0; i < vectorA.length; i++) {
            //Elijo aleatoriamente la eda
            Random random = new Random();
            int edad = random.nextInt(max + min) + min; 
            
            //Creo el alumno nuevo y le asigno la edad y como nombre las pos del vector...
            Alumno alumno = new Alumno(String.valueOf(i), edad);
            
            vectorA[i] = alumno;
        }
        return vectorA; // Luego lo devulevo ya armado con los valores.
    } 
    
    static void Mostrar(Alumno[] unVector) {
        String texto = "";

        //Implemento la logica para leer y mostrar el vector
        for (Alumno vector : unVector) {
         
            texto = vector.Esmenor()? "el alumno es menor de edad" : "el alumno es mayor de edad" ;
            System.out.println("El alumno "+ vector.getNombre()+" "+texto);
            
        }
    }
    
    
}
