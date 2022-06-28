package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc =new Scanner(System.in);
        String fecha,resultado;
        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        fecha = sc.nextLine();
        resultado = numsuerte(fecha);
        System.out.println(resultado);
        sc.close();
    }

    private static String numsuerte(String fecha) 
    {
        
         String cadena,cadena1,cadena2;
         Integer dato,dato1,dato2,dato3,dato4,dato5,dato6,total,total1;
         cadena = fecha; 
         //cadena1 = fecha; 
         //cadena2 = fecha; 
         
         int longitud = cadena.length();
         dato = Integer.parseInt(cadena.substring(0,2));
         dato1 = Integer.parseInt(cadena.substring(4,5));
         dato2 = Integer.parseInt(cadena.substring(6,10));
         total = dato + dato1 + dato2;
         cadena1 = String.valueOf(total);
         dato3 = Integer.parseInt(cadena1.substring(0,1));
         dato4 = Integer.parseInt(cadena1.substring(1,2));
         dato5 = Integer.parseInt(cadena1.substring(2,3));
         dato6 = Integer.parseInt(cadena1.substring(3,4));
         total1 = dato3 + dato4 + dato5 + dato6;
         cadena2 = String.valueOf(total1); 
         
   
             
       return "Número de la suerte "+ cadena2;   
    }

   
}
