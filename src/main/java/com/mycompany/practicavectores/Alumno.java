/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicavectores;

/**
 *
 * @author Tincho
 */
public class Alumno {
    String nombre;
    int edad; 

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public boolean Esmenor(){
        return edad < 18;
    }
    
    //Creo esta clase para el punto 2
    
}
