/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edades;

/**
 *
 * @author bruno
 */
public class Edades {

    public static void main(String[] args) {
                int[] edades={26, 45, 17, 13, 20};
        
        //clasificar por maoyr y menor de edad
        double sumaMayores =0;
        double cantidadMayores =0;
        double sumaMenores =0;
        double cantidadMenores =0;
    
    
        double promedioMayores=0;
        double promedioMenores=0;
       
           for(int i=0; i<edades.length; i++){
        
        
               switch(edades[i] >= 18 ?1 :0){
                case 1:
                    sumaMayores += edades[i];
                    cantidadMayores++;
                    break;
                    default:
                    sumaMenores += edades[i];
                    cantidadMenores++;
                 
               
                }
            }
           
           promedioMayores = sumaMayores/cantidadMayores;
           promedioMenores = sumaMenores/cantidadMenores;
           
        System.out.println("el promedio de los mayores es: " + promedioMayores) ; 
        System.out.println("el promedio de los menores es: " + promedioMenores) ;
    }
}

    

