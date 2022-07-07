import java.util.Scanner;

/**
 * HolaQuien
 */
public class HolaQuien {

  public static void main(String[] args) {
    var sc = new Scanner(System.in);
    System.out.println("Por favor ingrese su nombre");
    var nombre = sc.nextLine();//cadena-string
    System.out.println("Por favor ingrese su edad");
    var edad = sc.nextInt();// numerico entero
    
    System.out.println("Hola " + nombre + "! su edad es de : "+edad+" años");
    sc.close();
  }  
} 