import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        int grados,fahre;
        System.out.println("Digite un Temperatura :");
        grados = sc.nextInt();
        fahre = 32 +(9*grados/5);
        System.out.println("Medida en Fahrenheit :"+ fahre);
        
        sc.close();

    } 
}
