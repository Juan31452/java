package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        /*Scanner sc =new Scanner(System.in);
        String fecha,resultado;
        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        fecha = sc.nextLine().trim();
        resultado = numsuerte(fecha);
        System.out.println(resultado);
        sc.close();*/

        Scanner sc =new Scanner(System.in);
        double precio, cant, iva;
        System.out.println("Ingrese el precio de la unidad del producto: ");
        precio = sc.nextDouble();
        System.out.println("Cantidad de productos vendidos: ");
        cant = sc.nextDouble();
        System.out.println("Valor del IVA en porcentaje: ");
        iva = sc.nextDouble();
        sc.close();
        venta(precio,cant, iva);
    }

    private static String numsuerte(String fecha) 
    {
        
         String cadena,cadena1,cadena2=null;
         Integer dato,dato1,dato2,dato3,dato4,dato5,dato6,total,total1;
         int sumatoria = 0;
         cadena = fecha; 
         
         
         dato = Integer.parseInt(cadena.substring(0,2));
         dato1 = Integer.parseInt(cadena.substring(3,5));
         dato2 = Integer.parseInt(cadena.substring(6,10));
         total = dato + dato1 + dato2;
         cadena1 = String.valueOf(total);
         int longitud = cadena1.length();
        /*   dato3 = Integer.parseInt(cadena1.substring(0,1));
             dato4 = Integer.parseInt(cadena1.substring(1,2));
             dato5 = Integer.parseInt(cadena1.substring(2,3));
             dato6 = Integer.parseInt(cadena1.substring(3,4));*/
             
       for(int i = 0;i < longitud; i++ ){
        //obtengo el número de la posición i+1
        sumatoria+= Character.getNumericValue(cadena1.charAt(i));
       }             
       cadena2 = String.valueOf(sumatoria);
       return "Número de la suerte "+ cadena2;   

    }
    
    public static void venta(double p,double c,double i) {
        double pSinIva,tIva;
        pSinIva = p * c;
        tIva = (pSinIva * i) / 100;
        System.out.println("Precio de venta -> " + (pSinIva + tIva));         
    }
   
}
