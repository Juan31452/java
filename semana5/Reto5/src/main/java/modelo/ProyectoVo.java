package modelo;

public class ProyectoVo {
    
   private Integer id_proyecto;
   private String constructura;
   private Integer numero_habitaciones;
   private String ciudad;  

    public ProyectoVo() {
        
    }

    public ProyectoVo(Integer id_proyecto, String constructura, Integer numero_habitaciones, String ciudad) {
        this.id_proyecto = id_proyecto;
        this.constructura = constructura;
        this.numero_habitaciones = numero_habitaciones;
        this.ciudad = ciudad;
    }

    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getConstructura() {
        return constructura;
    }

    public void setConstructura(String constructura) {
        this.constructura = constructura;
    }

    public Integer getNumero_habitaciones() {
        return numero_habitaciones;
    }

    public void setNumero_habitaciones(Integer numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
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
        return String.format("%3d %-20s %3d %-15s",id_proyecto,
        constructura,numero_habitaciones,ciudad);
    }     
   
   
}
