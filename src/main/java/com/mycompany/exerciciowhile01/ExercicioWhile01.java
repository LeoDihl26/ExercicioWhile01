package com.mycompany.exerciciowhile01;

import java.util.Scanner;

public class ExercicioWhile01 {

    public static void main(String[] args) {
        
      Scanner teclado = new Scanner(System.in);
      int x = teclado.nextInt();
      while (x <= 10 && x > 0){
          
          x = teclado.nextInt();
      }   
    
      teclado.close();  
      System.out.println("É menor ou maior que 10.");
    }
}
