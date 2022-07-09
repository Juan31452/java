package ejemplos1;

public class Productos extends Tabla {
  //private String Nombre;

    public Productos(int id,String nombre,int cantidad,double valoru) 
    {
       super(id,nombre,cantidad,valoru); 
        
    }

    public String mensaje()
    {
        return "Productos : ";
    }

}
