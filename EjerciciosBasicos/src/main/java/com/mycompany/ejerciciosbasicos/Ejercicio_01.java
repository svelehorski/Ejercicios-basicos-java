/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosbasicos;
import java.util.Scanner;

/**
 *
 * @author Velehors
 * Ejercicio 1
 */

public class Ejercicio_01 {

    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        int numero;
        int max = 0;
        int min = 0;
        int sum = 0;
        
        
       for(int i=0; i < 6; i++){
         System.out.print("Ingrese el numero " + i + ":");
         numero = ingrese.nextInt();
         
         if(i == 0){
             max = numero;
             min = numero;
         }
         
         if(numero > max){
             max = numero;
         }else if(numero < min){
             min = numero;
            }
         
        sum += numero; 
       }
       
       double promedio = (double) sum / 5;
       
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
        System.out.println("Promedio: " + promedio);
        
        ingrese.close();
       
    }
}
