/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperatura;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Temperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Definir valores predeterminados de temperatura
        double tempManana = 25; 
        double tempTarde = 30;  
        double tempNoche = 15;  

        //Solicitar los datos al usuario
        System.out.println("Ingrese el momento del día (manana, tarde, noche):");
        String momentoDia = scanner.nextLine().toLowerCase();


        System.out.println("Ingrese la temperatura actual del tanque de combustible:");
        double temperaturaActual;
        //Manejo de errores para validar la entrada del usuario
        try {
            temperaturaActual = Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Error: Temperatura no válida.");
            return;
        }

        //Evaluacion de la temperatura
        String evaluacion = "";
        switch (momentoDia) {
            case "manana":
                if (temperaturaActual < tempManana) {
                    evaluacion = "Muy Buena";
                } else if (temperaturaActual >= tempManana && temperaturaActual <= tempTarde) {
                    evaluacion = "Normal";
                } else {
                    evaluacion = "Peligrosa";
                }
                break;
            case "tarde":
                if (temperaturaActual < tempTarde) {
                    evaluacion = "Muy Buena";
                } else if (temperaturaActual >= tempTarde && temperaturaActual <= tempNoche) {
                    evaluacion = "Normal";
                } else {
                    evaluacion = "Peligrosa";
                }
                break;
            case "noche":
                if (temperaturaActual < tempNoche) {
                    evaluacion = "Muy Buena";
                } else if (temperaturaActual >= tempNoche && temperaturaActual <= tempManana) {
                    evaluacion = "Normal";
                } else {
                    evaluacion = "Peligrosa";
                }
                break;
        }

        // Resultado de la evaluacion
        System.out.println("La temperatura es " + evaluacion + " para el momento del día " + momentoDia);
        scanner.close();
    }
    
}
