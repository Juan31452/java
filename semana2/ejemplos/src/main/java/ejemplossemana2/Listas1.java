package ejemplossemana2;

 /*
  * Listas coleccion de objetos ordenados por 
  posicion como los arreglos
  existen varios metodos para poder operarlas
  ArrayList guarda una lista de elementos de 
  tamaño dinámico

  */
import java.util.ArrayList;
/*
 * ArrayList como si fuera una matriz, su capacidad es el tamaño de la matriz 
 * utilizada para almacenar los elementos de la lista. A medida que se 
 * agregan elementos a una ArrayList, su capacidad crece automáticamente
 */
import java.util.Scanner;

public class Listas1 {
   
    public static void main(String[] args) {
        
        ArrayList <Integer> listaEnteros = new ArrayList<>();
        //var listaEnteros = new ArrayList<Integer>();
        listaEnteros.add(4);
        listaEnteros.add(5);
        listaEnteros.add(7);
        listaEnteros.add(0, 6); // Posición 0 elemento 6

        System.out.println("Elementos de Lista :"+ listaEnteros);

        System.out.println("El tamaño de la lista es de :"+ listaEnteros.size()+"\n"); // 4);

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el número a buscar? ");
        int buscar = sc.nextInt();
        // Java 5 aparece el concepto de bucle forEach y permite simplificar la 
        //forma en la que trabajamos con los Iteradores.
        // tipo elemento que se va a mover y en que 
        //for (int i=0;i<=listaEnteros.size(); i++)
        for (int i=0;i<=listaEnteros.size();){
            //contains metodo para buscar (Elemento), devuelve un booleano
            if (listaEnteros.contains(buscar) == true){
                System.out.println("Si esta");
                break;
            }else{
                System.out.println("No esta");
                break;
            }
        }

        System.out.println("Introduce un número y te devuelvo su posición: ");
        int buscar2 = sc.nextInt();
        //for (int m=0;m<=listaEnteros.size();m++)
        for (int m=0;m<=listaEnteros.size();){
            if (listaEnteros.contains(buscar2) == true){
                System.out.println("Esta en la posición: "+listaEnteros.indexOf(buscar2));
                break;
            }else{
                System.out.println("No esta");
                break;
            }
        }
        sc.close();
    }
}
