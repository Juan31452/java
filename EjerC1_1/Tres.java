import java.util.Scanner;
public class Tres {
    public static void main(String[] args) {
        int numero,l;
        System.out.println("Introduce un número entero:");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        System.out.println("Número introducido: " + numero);
        System.out.println("Doble de " + numero + " es :"+ 2*numero);
        System.out.println("Triple de " + numero + " es: "+ 3*numero);  
        System.out.println("Introduce tu edad:");
        l= sc.nextInt();
        System.out.println("Tu edad es: " + l);
        System.out.println("Doble de " + l + " años es :"+ 2*l);
        System.out.println("Triple de " + l + " años es: "+ 3*l); 
        sc.close();                            
       
    }
}
