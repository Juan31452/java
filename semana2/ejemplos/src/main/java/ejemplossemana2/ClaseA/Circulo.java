package ejemplossemana2.ClaseA;

//extends declaración o expresión de clases, 
//para crear una clase hija de otra.
public class Circulo extends Figura{
    double radio;

    public Circulo(String color, double radio) {
        //super para referirse a una variable local en un método 
        //y a una variable de la superclase que tiene el mismo nombre.
        super(color);
        this.radio=radio;
    }

    public double calcularArea() {
        return Math.PI*Math.pow(radio, 2);
    }
    
}
