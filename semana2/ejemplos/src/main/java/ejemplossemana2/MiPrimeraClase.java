package ejemplossemana2;

import java.util.Scanner;

/*Clases en Java
 * <modificador> class <Nombre clase>{
 *  <Atributos>
 *  <Constructores>
 *  <Métodos>
 * }
 * 
 * public: todos tienen acceso
 * final: Unica clase sin subclases
 * 
 * Constructor por defecto, como?... tiene el mismo nombre de la clase
 * 
 */

 //CamelCase. Mismo nombre que el archivo.java mayuscula
 // inicial y cada palabra.
public class MiPrimeraClase {
     /*Atributos: de primero, 1 por linea.
    *  Modif-Acceso: public, private, protected, final, static (var de clase), <sm>
    */
   //Constructor por defecto
   private MiPrimeraClase(String nombre) {
}
//Métodos
/* <modificador> <retorno> <nombre>(<tipoDato parametros>)
 * {
 *      <sentencias>
 * }
*/

public String metodoString(int n) {// minuscula inicial y mayuscula cada palabra.
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número para sumarle a cinco: ");
    int numero = sc.nextInt();
    sc.close();
    return "Método metodoString. El resultado es: " + (n + numero);
}

public String metodoEntero(){
    int suma = 5+5;
    return "Método metodoEntero El resultado es: " + suma;
}

public int metodoEnteroDos(){
    int sumaDos = 5+4;
    return sumaDos;
}

int MetodoEnteroTres(){
    int sumaDos = 20-25;
    return sumaDos;
}


   public static void main(String[] args) {
    System.out.println("Hello World!");

    //Instanciar la clase "MiPrimeraClase" para llamar a sus métodos
    MiPrimeraClase ejemplos = new MiPrimeraClase("Constructor\n");
    
    System.out.println(ejemplos.metodoString(5));
    System.out.println(ejemplos.metodoEntero());
    
    System.out.println("Método, metodoEnteroDos, El resultado es: " + ejemplos.metodoEnteroDos());
    System.out.println("Método, metodoEnteroTres, El resultado es: " + ejemplos.MetodoEnteroTres());
}
    
}
