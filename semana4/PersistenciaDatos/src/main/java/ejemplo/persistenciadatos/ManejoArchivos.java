
package ejemplo.persistenciadatos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo) {
      File archivo = new File(nombreArchivo);
        try 
        {
          PrintWriter salida = new PrintWriter(archivo);
          salida.close();
          System.out.println("Se creo Archivo");
        } catch (FileNotFoundException ex) 
        {
             ex.printStackTrace(System.out);
        }    
    }
    
    public static void escribirArchivo(String nombreArchivo, String contenido) {
      File archivo = new File(nombreArchivo);
        try 
        {
          PrintWriter salida = new PrintWriter(archivo);
          salida.println(contenido);
          salida.close();
          System.out.println("Se escribio el Archivo");
        } catch (FileNotFoundException ex) 
        {
             ex.printStackTrace(System.out);
        }    
    }
  
}
