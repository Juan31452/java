package ejemplossemana2.ClaseA;

import java.util.Scanner;

public class Valida {
    public static void main(String[] args) {
        //Declaración de variables
        String colorDelCuadrado,colorDelCirculo;
        double ladoDelCuadrado, radioDelCirculo;

        //Se instancia a la variable "Scanner"
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el color del cuadrado: ");
        colorDelCuadrado = sc.nextLine();
        System.out.print("Introduzca el lado del cuadrado: ");
        ladoDelCuadrado = sc.nextDouble();
        Cuadrado c1 = new Cuadrado(colorDelCuadrado, ladoDelCuadrado);
        System.out.printf("El área del cuadrado %s es: %f \n", c1.getColor(), c1.calcularArea());

        //Para el circulo
        // Scanner sc1 = new Scanner(System.in);
        // System.out.print("Introduzca el color del circulo: ");
        // colorDelCirculo = sc1.nextLine();

        // System.out.print("Introduzca el radio del circulo: ");
        // radioDelCirculo = sc1.nextDouble();

        // Circulo ci1 = new Circulo(colorDelCirculo, radioDelCirculo);
        // System.out.printf("El área del circulo %s es: %f", ci1.getColor(), ci1.calcularArea());
        // sc.close();
        // sc1.close();

    }
}
