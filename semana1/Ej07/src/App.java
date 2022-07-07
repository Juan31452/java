import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        int numero;
        String resultado;
        System.out.print("Digite un Numero : ");
        numero = sc.nextInt();

        resultado = (numero % 2 == 0)?"par":"impar";
       
        System.out.println("El numero "+numero+" es "+ resultado);
        
        sc.close();

    } 
}

