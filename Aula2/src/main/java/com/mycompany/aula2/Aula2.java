package com.mycompany.aula2;
import java.util.Scanner;


public class Aula2 {
    public static void main(String[] args) {

        int a = 0;
        int b = 10;
        if(a>b){
            System.out.println("A é maior que B");
        }else if(a==b){
            System.out.println("A tem mesmo valor de B"); 
        }else{
            System.out.println("A e B não são iguais");
        }
        
        for(int indice=0;indice>5;indice++){
            System.out.println("Proz Educação");
        }
        while(b>a){

            System.out.println("esse é o while da verdade");
            a++;
        }
        
        
        //Impar impar = new Impar();
        //System.out.println("A soma dos impares"+impar.somaImpar());
    }
}
