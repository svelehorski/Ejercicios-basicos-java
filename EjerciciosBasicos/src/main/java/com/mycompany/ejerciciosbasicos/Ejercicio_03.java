/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author Velehors
 * Ejercicio 3
 */
public class Ejercicio_03 {
    public static void main(String[] args){
       Scanner ingrese = new Scanner(System.in);
       int numero;
      
        System.out.print("Ingrese un numero: ");
        numero = ingrese.nextInt();
        
        System.out.print("Los numeros primos hasta el indicado son: ");
        for(int i = 2; i <= numero; i++){
            int contador = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    contador++;
                }
            }
            if(contador == 2){
                System.out.print(i + ", ");
            }
       }
       
        ingrese.close();
    }
}
