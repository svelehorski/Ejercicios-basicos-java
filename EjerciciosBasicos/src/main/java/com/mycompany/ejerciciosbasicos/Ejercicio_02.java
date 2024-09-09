/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author Velehors
 * Ejercicio 2
 */

public class Ejercicio_02 {
    public static void main(String[] args){
        Scanner ingrese = new Scanner(System.in);
        double numero;
        boolean bandera = true;
        
        
        while(bandera){
        System.out.print("Ingrese un numero: ");
        numero = ingrese.nextDouble();    
        
        if(numero > 0){
            bandera = false;
            double cuadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);
            
            
            System.out.println("El cuadrado de: " + numero + " es: " + cuadrado);
            System.out.println("El cubo de: " + numero + " es: " + cubo);
        }else{
            System.out.println("Error, reingresa el numero");
        }
        }
        
        
       ingrese.close();
    }
    
}
