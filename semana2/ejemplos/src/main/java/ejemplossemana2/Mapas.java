// Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!
package ejemplossemana2;

import java.util.HashMap;
/*
 * HashMap contiene un conjunto de objetos, Lo hace administrando
 *  internamente una matriz y almacenando el objeto 
 */
import java.util.Map.Entry;

public class Mapas {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
  
        m.put(924, "Amalia Núñez");
        m.put(921, "Cindy Nero");
        m.put(700, "César Vázquez");
        m.put(219, "Víctor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito ");
    
        System.out.println("Todas las entradas del diccionario extraídas con entrySet:");
        System.out.println(m.entrySet());
    
        System.out.println("\nEntradas del diccionario extraídas una a una:");
        //Entry coleccion de datos entero nombre
        for (Entry<Integer, String> pareja: m.entrySet()) {
          System.out.println(pareja);
        }     
    }
     
}
