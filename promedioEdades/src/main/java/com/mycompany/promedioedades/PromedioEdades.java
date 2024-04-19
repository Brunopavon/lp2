/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedioedades;

/**
 *
 * @author bruno
 */

import java.util.Scanner;

public class PromedioEdades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //pedir al ususario que ingrese la canridad de personas y guardar en cantidadPersonas
        System.out.print("Ingrese la cantidad de personas: ");
        int cantidadPersonas = sc.nextInt();
        
        //declaramos un array para almacenar las edad ingresadas por el usuario
        int[] edades = new int[cantidadPersonas];
        
        //declaramos un bucle for para pedirle al usuario las edades
        for(int i=0; i<cantidadPersonas; i++){
            System.out.print("Ingrese la edad de la persona: " + (i + 1) + ": ");
            edades[i] = sc.nextInt();
        }
        // Instanciamos la clase CalculadoraEdades
        CalculadoraEdades calculadoraEdades = new CalculadoraEdades(edades);
        
        //definimos dos variables para los promedios de las edades y llamamos a la clase y
        //a los metodos de nuestra clase para los calculos correspondientes
        double promedioMayoresEdad = calculadoraEdades.calcularPromedioMayoresEdad();
        double promedioMenoresEdad = calculadoraEdades.calcularPromedioMenoresEdad();
        
        //imprimimos los resultados
        System.out.println("\n El promedio de la edades mayores es: " + promedioMayoresEdad);
        System.out.println("El promedio de la edades menores es: " + promedioMenoresEdad);
        sc.close();
    }
}
