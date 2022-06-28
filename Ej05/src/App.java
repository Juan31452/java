import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        var sc = new Scanner(System.in);
        int numero,cuadrado,cubo;
        System.out.println("Digite un mumero :");
        numero = sc.nextInt();
        cuadrado = numero*2;
        cubo = numero*3;

        System.out.println(numero+ " el doble es: "+ cuadrado);
        System.out.println(numero+ " el triple es: "+ cubo);
        
        sc.close();

    } 
}
