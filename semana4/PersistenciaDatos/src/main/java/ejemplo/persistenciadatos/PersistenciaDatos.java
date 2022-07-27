package ejemplo.persistenciadatos;

import java.io.IOException;
import java.util.*;
import static persistenciadatos.ManejoArchivos.*;

public class PersistenciaDatos {

    public static void main(String[] args) throws IOException {
        //Listas
        //List lista1 = new ArrayList();
        //lista1.add(1);
        //lista1.add("Juan");
        //lista1.add(30);
        //lista1.add(1.67);
        //lista1.add(true);
        
        //Imprimir 
        //lista1.forEach(dato-> {
        //    System.out.println(dato);
       // });
        //eliminar
        //lista1.remove(0);
        //System.out.println(lista1);
        //modificar
        //lista1.set(0, "Juan Carlos");
        //System.out.println(lista1);
        
        //Conjuntos
//        HashSet dias = new HashSet();
//        dias.add("Lunes");
//        dias.add("Martes");
//        dias.add("Miercoles");
//        dias.add("Jueves");
//        dias.add("Viernes");
//        
//        for(Object dia :dias)
//        {   //No se respeta el orden y no hay datos repitidos
//           System.out.println(dia);
//        }   
//           //eliminar
//           dias.remove("Lunes");
//           System.out.println(dias);
        //mapas
        // Crear archivo
        //ManejoArchivos.crearArchivo("Ejemplo.txt");
        //Escribir en el archivo
        //ManejoArchivos.escribirArchivo("Ejemplo1.txt","Se escribio desde java" );
        //ManejoArchivos.escribirArchivo("Ejemplo1.txt","Se escribio otra vez");
        //ManejoArchivos.leerArchivo("Ejemplo1.txt");
        ManejoArchivos.eliminarArchivo("Ejemplo.txt");
    }   
                
}

