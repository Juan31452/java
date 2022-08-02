package reto4.grupo61.modelo.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;


@Entity
@Table(name = "Proyetos")
public class ProyectoBancoVo implements Serializable{

    @Id
    private Integer id_proyecto;
     @Column
    private String constructora;
    private String ciudad;
      private String clasificacion;
       

    public ProyectoBancoVo() {
   
    }

    public ProyectoBancoVo(Integer id_proyecto, String constructora, String ciudad, String clasificacion) {
        this.id_proyecto = id_proyecto;
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.clasificacion = clasificacion;
    }
     
    

    public Integer getId_proyecto() {
        return id_proyecto;
    }

    /**
     * @param id_proyecto the id_proyecto to set
     */
    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    /**
     * @return String return the constructora
     */
    public String getConstructora() {
        return constructora;
    }

    /**
     * @param constructora the constructora to set
     */
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    /**
     * @return String return the ciudad
     */
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


}
