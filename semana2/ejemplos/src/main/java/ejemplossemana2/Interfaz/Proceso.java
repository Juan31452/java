package ejemplossemana2.Interfaz;
/**Interfases
 * Define métodos sin cuerpo
 * Implementados por subclases
 * 
 * "public" o "default" interface
 *  public: para todos los paquetes
 *  default: No se coloca y solo es vista desde otros 
 *  miembros del mismo paquete
 * 
 * variables declaradas en una interfaz no son variables 
 * de instancia. En cambio, son implícitamente public, final,
 * y static, y deben inicializarse. 
 * Por lo tanto, son esencialmente constantes.
 */
public interface Proceso {
    //Define métodos sin cuerpo
    int getSiguiente(); 
    //Retorna el siguiente número de la serie
    void reiniciar(); 
    //Reinicia
    void setComenzar(int x); 
    //Establece un valor inicial
    
} 