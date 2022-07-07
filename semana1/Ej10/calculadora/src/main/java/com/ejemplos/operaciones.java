package com.ejemplos;

import java.util.Scanner;

public class operaciones {
      //Atributos
      int num1;
      int num2;
      int total;
      int suma,resta,multi,division;
     
      //metodos
      
         public void leernumeros(){
             Scanner sc =new Scanner(System.in);
             System.out.println("Ingrese el primer numero: ");
             num1 = sc.nextInt();
             System.out.println("Ingrese el segundo numero: ");
             num2 = sc.nextInt();
             sc.close();
             
         }
     
         public void misuma() {
           suma = num1 + num2;
             
         }
     
         public void miresta() {
            resta = num1 - num2;
               
           }
     
           public void mimulti() {
            multi = num1 * num2;
               
           }
     
           public void midivision() {
            division = num1 / num2;
           }
     
           public void mostar_resultado() {
             System.out.println("La suma es:"+suma);
             System.out.println("La resta es:"+resta);
             System.out.println("La multiplicacion es:"+multi);
             System.out.println("La division es:"+division);    
               
           }   
    
}
