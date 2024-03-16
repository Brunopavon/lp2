/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.edades;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // crear un objeto scanner para poder ingresar datos
        Scanner scanner = new Scanner ( System.in);
        
        // Solicitar al usuario que ingrese por consola
        
        
        System.out.println("ingrese su nombre :" );
        String nombre = scanner.nextLine();
        
        System.out.println("ingrese su Apellido : " );
        String apellido = scanner.nextLine();
        
        
        System.out.println("su nombre es: " +nombre+ " su apellido es: " +apellido);
        
        // declaracion de la lista de edades 
        int[] edades = new int[5];
        
        for(int i=0; i < 5; i++){
            System.out.println("Ingrese la edad: ");
            edades[i] = scanner.nextInt();
            scanner.close();
                    
        }
        
    }    
}
