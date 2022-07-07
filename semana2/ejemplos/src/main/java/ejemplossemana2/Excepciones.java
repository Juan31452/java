package ejemplossemana2;

import java.util.Scanner;

/*
 * "try – catch – finally", se ejecuta primero el bloque "try", 
 * si se produce una excepción se ejecuta el bloque "catch" y 
 * por último el bloque "finally". 
 */
public class Excepciones {
    
    public static void main (String [] args)     {
        double di, ds;
        double d=0.0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese dividendo : ");
        di = sc.nextDouble();
        System.out.print("Ingrese divisor : ");
        ds = sc.nextDouble();
        sc.close();
        System.out.println("validando la división");
        try {
            d=di/ds;
        }
        // catch (ArithmeticException ex) {
        //     System.out.println("Instrucciones a ejecutar cuando se produce un error"+ex.getMessage());
        // }
        finally {
            System.out.println("Instrucciones a ejecutar finalmente tanto si se producen errores como si no, División: "+ d);

        }

    }
}
