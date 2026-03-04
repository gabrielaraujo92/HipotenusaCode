/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hipotenusa5;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Hipotenusa {
Scanner sc = new Scanner(System.in);
    Double base;
    Double altura;
    Double calculo;
    void Altura (){
            System.out.println("Digite a altura");
            altura = sc.nextDouble();
    }
    void base (){
            System.out.println("informe a base");
            base = sc.nextDouble();
    }
    
    void calculo (){ 
        calculo = (altura * altura) + (base * base); 
        System.out.println("Esse é o seu resultado" + calculo);
    }
        
    }
