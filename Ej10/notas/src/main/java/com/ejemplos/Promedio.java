package com.ejemplos;

import java.util.Scanner;

public class Promedio {
    //Atributos
    String nombre;
    float nota1,nota2,nota3,notafinal;
    //Constructor 
    public Promedio(String nombre, float nota1, float nota2, float nota3, float notafinal) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notafinal = notafinal;
    }

   
    //metodos
      
    public Promedio() {
    }

    public void leernotas()
    {
       Scanner sc =new Scanner(System.in);
       System.out.println("Ingrese el nombre: ");
       nombre = sc.nextLine();
       System.out.println("Ingrese la nota 1: ");
       nota1 = sc.nextFloat();
       System.out.println("Ingrese la nota 2: ");
       nota2 = sc.nextFloat();
       System.out.println("Ingrese la nota 3: ");
       nota3 = sc.nextFloat();
           
        sc.close();
            
    }

    public void proceso()
    {
       notafinal = (nota1 + nota2 + nota3)/3;

    }
    
    public void mostar_resultado()
    {
        if (notafinal >= 3.0)
        {
            System.out.println("Promedio :"+notafinal+" Aprobado");
        }else
        {
            System.out.println("Promedio :"+notafinal+" Reprobado");
        }
    }

}
