/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author Velehors
 * Ejercicio 5
 */
import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args){
        Scanner ingrese = new Scanner(System.in);
        int numero;
        boolean bandera = true;
        
        while(bandera){
            System.out.print("Ingrese un número: ");
            numero = ingrese.nextInt();

            if(numero > 1){
                bandera = false;
                
                for(int i = 2; i < numero; i++){
                    int primera = 0;
                    int segunda = 0;
                    
                    for(int j = 1; j < i; j++){
                        primera += j;
                    }                    
                    for(int h = i + 1; segunda < primera; h++){
                        segunda += h;
                    }                   
                    if(primera == segunda){
                        System.out.println("El centro numerico es: " + i);
                    }
                }
                
            } else {
                System.out.println("Ingrese un número mayor que 1.");
            }
        }

        ingrese.close();
    }
}
