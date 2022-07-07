package ejemplossemana2;
/*
 * coleccione de objetos de la misma
 * clase sin ningun orden
 * cada elemento solo puede aparecer 
 * una vez, al contrario de las listas.
 */
import java.util.List;
/* permite almacenar datos en memoria de forma similar a los Arrays, 
con la ventaja de que el numero de elementos que almacena, lo hace 
de forma dinámica, es decir, que no es necesario declarar 
su tamaño como pasa con los Arrays*/

import java.util.Set;
/*
 * modela la abstracción de conjuntos matemáticos.
 */
import java.util.Arrays;

import java.util.Collection;
/*
 * colección representa un grupo de objetos, conocidos como sus elementos. 
 * se usa típicamente para pasar colecciones y manipularlas.
 */
import java.util.HashSet;
/*
 * HashSet contiene un conjunto de objetos, pero de una manera 
 * determinar fácil y rápidamente si un objeto ya está en el conjunto o no.
 * Lo hace administrando internamente una matriz y almacenando el objeto 
 * utilizando un índice que se calcula a partir del código hash del objeto
 */


public class Conjuntos {
    
    private String colores[] = {"rojo", "blanco", "azul", "verde", "gris", "naranja", "carne", "blanco", "cyan", "gris", " naranja "};
    
    public Conjuntos() {
        List<String> lista = Arrays.asList(colores);
        System.out.printf("ArrayList: %s \n", lista);
        imprimirSinDuplicados(lista);
    }

    private void imprimirSinDuplicados(Collection<String> coleccion) {
        Set<String> conjunto = new HashSet<String>(coleccion);
        System.out.println("\nLos valores sin duplicados son: ");
        
        for (String string : conjunto) {
            System.out.println(string);
        }
    }

    public static void main(String args[]) {
        new Conjuntos();
    }
}
