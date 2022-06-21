public class Ej03 {
    
    public static void main(String[] args) throws Exception {
       var nombre= "Cesar Diaz";
       var resultado = saludo(nombre);
       System.out.println(resultado);
    }
    
    public static String saludo(String nombre)
    {
        return "Hola: "+ nombre + "!";
    }
}
