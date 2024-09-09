/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosbasicos;

/**
 *
 * @author Velehors
 * Ejercicio 4
 * 
 */
public class Ejercicio_04 {
    public static void main(String[] args){
        int numero = 1;
        int suma;
        int contador = 0;
        
        System.out.println("Los 4 primeros numeros perfectos son: ");
        while(contador < 4) {
            suma = 0;
            for(int i = 1; i < numero; i++){
                if(numero % i == 0) {
                    suma += i;
                }
            }
            if(suma == numero){
                contador++;
                System.out.println(numero);
            }
            numero++;
        }
    }
}

