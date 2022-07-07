package ejemplossemana2.ClaseA;
/**Clases abstractas
 * Base para crear jerarquias, todas las clases comparten 
 * una parte de la interfaz
 * Declara la existencia de métodos pero no su implementación,
 * ni sentencias, Clase padre (abstracta) define operaciones 
 * complejas/repetitivas y funciones para que sus hijas (clases)
 * escriban su código.
 * 
 * Clases Abstractas vs Interfases:
 * 
 * CA: se usa para crear una clase abstracta y se puede usar con métodos.	
 * I:  se usa para crear una interfaz, pero no se puede usar con métodos.
 * CA: una clase puede extender solo una clase abstracta.	
 * I:  una clase puede implementar más de una interfaz.
 * CA: las variables no son definitivas por defecto. Puede contener variables no finales.
 * I:  las variables son finales por defecto en una interfaz.
 * CA: una clase abstracta puede proporcionar la implementación de una interfaz.
 * I:  una interfaz no puede proporcionar la implementación de una clase abstracta.
 * CA: puede tener métodos con implementaciones.
 * I:  proporciona una abstracción absoluta y no puede tener implementaciones de métodos.
 * CA: puede tener modificadores de acceso públicos, privados, estáticos y protegidos.
 * I:  los métodos son implícitamente públicos y abstractos en la interfaz de Java.
 * CA: no admite herencias múltiples.
 * I:  es compatible con herencias múltiples.
 * CA: es ideal para la reutilización del código.
 * I:  es ideal para la declaración de tipo.
 */
public abstract class Figura {
    private String color;

    //Constructor: define atributo "color" 
    public Figura(String color){
        //"this" puede hacer las veces de setter(mutación)
        this.color = color;
    }
    
    //Método vacio para ser implementado desde las clases hijas.
    public abstract double calcularArea();

    //getter, para acceder al color
    public String getColor(){
        return color;
    }
}

