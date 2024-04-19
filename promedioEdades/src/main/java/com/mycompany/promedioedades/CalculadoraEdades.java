/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.promedioedades;

/**
 *
 * @author bruno
 */
// definimos una clase CalculadoraEdades 
public class CalculadoraEdades {
    
    //definimos un array para almacenar las edades
    private int[]edades;
    
    //definimos un constructor
    public CalculadoraEdades(int[] edades) {
        this.edades = edades;
    }
    // definimos un metodo que calcula el promedio de los mayores de edad
    public double calcularPromedioMayoresEdad(){
        // definimos las variables necesarias
        int cantidadMayoresEdad = 0;
        double sumaMayoresEdad = 0;
        
        //con un for recorremos el array para determinar los mayores de edad
        for(int edad : edades){
            if(edad>=18){
            cantidadMayoresEdad++;
            sumaMayoresEdad += edad;
            }
        }
        
        if(cantidadMayoresEdad > 0){
            return sumaMayoresEdad / cantidadMayoresEdad;
        }else{
            return 0;
        }
    }
    
    // definimos un metodo que calcula el promedio de los manores de edad
    public double calcularPromedioMenoresEdad(){
        
        // definimos las variables necesarias
        int cantidadMenoresEdad = 0;
        double sumaMenoresEdad = 0;
        
        //con un for recorremos el array para determinar los menores de edad
        for(int edad : edades){
            if(edad < 18){
                cantidadMenoresEdad++;
                sumaMenoresEdad += edad;
            }
        }
        
        if(cantidadMenoresEdad > 0){
            return sumaMenoresEdad / cantidadMenoresEdad;
        }else{
            return 0;
        }
    }
}
