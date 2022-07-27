
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
    
    public static void escribirArchivo(String nombreArchivo, String contenido) throws IOException {
      File archivo = new File(nombreArchivo);
        try 
        {
          PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
          salida.println(contenido);
          salida.close();
          System.out.println("Se escribio el Archivo");
        } catch (FileNotFoundException ex) 
        {
             ex.printStackTrace(System.out);
        }catch(IOException ex){
             ex.printStackTrace(System.out);
        }    
    }
    
    public static void leerArchivo(String nombreArchivo) throws IOException {
      File archivo = new File(nombreArchivo);
        try 
        {
          BufferedReader entrada = new BufferedReader(new FileReader(archivo));
          String lectura = entrada.readLine();
            while (lectura!=null)
            {    
              System.out.println(lectura);   
              lectura = entrada.readLine();
            }
           entrada.close();
          
        } catch (FileNotFoundException ex) 
        {
             ex.printStackTrace(System.out);
        }catch(IOException ex){
             ex.printStackTrace(System.out);
        }    
    }
  
    public static void eliminarArchivo(String nombreArchivo) throws IOException {
      File archivo = new File(nombreArchivo);
        System.err.println(archivo.exists());
        boolean valida;
        valida = archivo.exists();
        if (valida!=true)
        {
            System.out.println("Archivo no existe");
        }else{    
            archivo.delete();
            System.out.println("Archivo eliminado");  
        }    
        }
            
    }
  
}
