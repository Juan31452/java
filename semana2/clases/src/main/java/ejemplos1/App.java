package ejemplos1;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int id=0, cantidad=0 ; 
        String nombre;
        double valoru=0;

        //Se instancia a la variable "Scanner"
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el Id: ");
        id = sc.nextInt();
        
        System.out.print("Introduzca el Nombre: ");
        nombre = sc.next();
        
        System.out.print("Introduzca la cantidad: ");
        cantidad = sc.nextInt();

        System.out.print("Introduzca Valor Unitario: ");
        valoru = sc.nextDouble();
        
        Productos p1 = new Productos(id,nombre,cantidad,valoru);
        System.out.println(p1.mensaje());
        System.out.println("Id : "+p1.getId());
        System.out.println("Nombre : "+p1.getNombre());
        System.out.println("Cantidad : "+p1.getCantidad());
        System.out.println("Valor:Unitario : "+p1.getValor_Unitario());
        
        sc.close();
      }
}
