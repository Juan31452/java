
package modelo;

/**
 *
 * @author juank
 */
public class ProyectoBancoVo {
    private Integer id_proyecto;
    private String constructora;
    private String ciudad;
    private String clasificacion;
    private Integer estrato;
    private String lider;
       

    public ProyectoBancoVo() {
   
    }

    public ProyectoBancoVo(Integer id_proyecto, String constructora, String ciudad, String clasificacion, Integer estrato, String lider )
    {
        this.id_proyecto = id_proyecto;
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.clasificacion = clasificacion;
        this.estrato = estrato;
        this.lider = lider;
    }
     
    

    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return String return the clasificacion
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    @Override
    public String toString() 
    {
        return String.format("%3d %-25s %-20s %-15s %7d %-30s",id_proyecto,
        constructora,ciudad,clasificacion,estrato,lider);
    }     
}
