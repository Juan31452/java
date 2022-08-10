
package modelo;


public class LiderVo {
   private Integer id_lider;
   private String nombre;
   private String apellido;
   private String ciudad;

    public LiderVo() {
    }

    public LiderVo(Integer id_lider, String nombre, String apellido, String ciudad) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
    }

    public Integer getId_lider() {
        return id_lider;
    }

    public void setId_lider(Integer id_lider) {
        this.id_lider = id_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
   
    @Override
    public String toString() 
    {
        return String.format("%3d %-25s %-20s %-15s",id_lider,
        nombre,apellido,ciudad);
    }     
       
}
