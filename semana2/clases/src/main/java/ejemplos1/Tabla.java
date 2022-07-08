package ejemplos1;

public abstract class Tabla {
    private String Nombre;
    private int Id;
    private int Cantidad;
    private double Valor_Unitario;

    //Constructor: define atributo "id,nombre,cantidad,valor unitario" 
    public Tabla(int id,String nombre,int cantidad,double valoru){
        //"this" puede hacer las veces de setter(mutación)
        this.Id = id;
        this.Nombre = nombre;
        this.Cantidad = cantidad;
        this.Valor_Unitario = valoru;
    }
    
    //Método vacio para ser implementado desde las clases hijas.
    public abstract String mensaje();

    //getter, para acceder al Id
    public int getId(){
        return Id;
}
    //getter, para acceder al nombre
    public String getNombre(){
        return Nombre;
    }

    //getter, para acceder a Cantidad
    public int getCantidad(){
        return Cantidad;
    }

    //getter, para acceder a valor unitario 
    public double getValor_Unitario(){
        return Valor_Unitario;
    }
}
