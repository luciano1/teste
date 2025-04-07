/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

/**
 *
 * @author Ludyla
 */
public class Pratica {
    public int somaImpar(){
        int soma = 0;
        int a = 1000;
        while (a>0) {            
            if(a%2==1){
                soma = soma + a;
            }
            a--;
        }
        return soma;
    }
}
