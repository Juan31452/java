
package Logica;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Clientes implements Serializable {
    @Id
    private Integer IdCliente;
    @Column
    private String Nombre;
    @Column
    private String Telefono;

    public Clientes() {
        
    }

    public Clientes(Integer IdCliente, String Nombre, String Telefono) {
        this.IdCliente = IdCliente;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public Integer getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Integer IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
  
    
}
