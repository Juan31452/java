package co.edu.utp.misiontic2022.c2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

    private static String numsuerte(String fecha) {
      try{
           //transforma la cadena en un tipo date
           Date miFecha = new SimpleDateFormat("dd/MM/yyyy-HH:mm").parse(fecha);

           //creo un calendario
           Calendar calendario = Calendar.getInstance();
           //establezco mi fecha
           calendario.setTime(fecha);

            //obtener el año
            int anio = calendario.get(Calendar.YEAR);
            //obtener el mes (0-11 ::: enero es 0 y diciembre es 11)
            int mes = calendario.get(Calendar.MONTH);
            //obtener el dia del mes (1-31)
            int dia = calendario.get(Calendar.DAY_OF_MONTH);
            int suma = anio + mes + dia;
            return String.valueOf(suma);
            } catch (ParseException ex) {

        //manejar excepcion
    }
        //return "Fecha "+fecha;   
    }
}
