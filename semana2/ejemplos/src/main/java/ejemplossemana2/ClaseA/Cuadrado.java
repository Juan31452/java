package ejemplossemana2.ClaseA;

//extends declaración o expresión de clases, 
//para crear una clase hija de otra.
public class Cuadrado extends Figura{
    double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado=lado;
    }
    public double calcularArea() {
        return lado*lado;
        
    }
    
}
