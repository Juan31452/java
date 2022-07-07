package ejemplossemana2;

import java.util.LinkedList;
/*
 * Permite insercion y borrado
 * de elementos de la lista
 */
import java.util.Queue;

/**Colas: Colas en Java con Queue: En Java podemos encontrar 
 * variadas formas de crear Colas en pocas lineas de código, 
 * un ejemplo es una de sus Interfaces que tiene como nombre 
 * “Queue”
 * Métodos de Queue para manejo de Colas en Java con la cual 
 * podemos crear Colas y que contiene los siguientes métodos 
 * para el uso de las mismas.

Para Insertar:
– add(e)
– offer(e)

Para Extraer:
– remove()
– poll()

Para Consultar el Frente:
– element()
– peek()
 */

public class Colas {
    public static void main(String[] args) {
        /*Creamos la Cola Indicando el tipo de dato*/
        Queue<Integer> cola=new LinkedList<Integer>();
        /*Insertamos datos
         * .offer inserta el elemento especificado en esta cola 
         * si es posible hacerlo, sin pasar por las restricciones de capacidad. 
         * uando se usa una cola con capacidad restringida, se debe usar este elemento.
        */
            cola.offer(3);
            cola.add(14);
            cola.offer(12);
            cola.add(7);
            cola.offer(10); 
        /*Impresion de la Cola llena con los datos*/
        System.out.println("Cola llena: " + cola);
        /*Estructura repetitiva para desencolar
         * .poll Recupera y elimina el encabezado de cola
         * 
         * .peek Recupera, pero no elimina, el encabezado de cola 
         * o devuelve un valor nulo si esta cola está vacía.
        */
        while(cola.poll()!=null){//Desencolamos y el valor se compara con null
            System.out.println(cola.peek());//Muestra el nuevo Frente
        }
        /*Muestra null debido a que la cola ya esta vacia*/
        System.out.println(cola.peek());     
    }
    
}
