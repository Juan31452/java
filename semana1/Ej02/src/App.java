import java.util.Scanner;
public class App
{
        private static Scanner sc;

        public static void main(String[] args)throws Exception 
        {
         sc = new Scanner(System.in);
         System.out.println("Por favor ingrese su nombre");
         var nombre = sc.nextLine();
         System.out.println("Hola " + nombre + "!");
        }
}
