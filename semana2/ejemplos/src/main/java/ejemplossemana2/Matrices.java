package ejemplossemana2;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        final int FILAS = 5, COLUMNAS = 4;
        Scanner sc = new Scanner(System.in);
        int i, j;

        int[][] M= new int[FILAS][COLUMNAS]; //Se crea una matriz de 5 filas y 4 columnas

        //Pedir por teclado los valores de la matriz
        System.out.println("Lectura de elementos de la matriz: ");
        for (i = 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                System.out.print("M[" + i + "][" + j + "]= ");
                M[i][j] = sc.nextInt();
            }
        }

        //Mostrar por pantalla los valores de la matriz
        System.out.println("valores introducidos:");
        for (i = 0; i < M.length; i++) { 
            for (j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        } 
    }  
}
