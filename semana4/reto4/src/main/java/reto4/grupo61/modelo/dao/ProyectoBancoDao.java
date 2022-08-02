package reto4.grupo61.modelo.dao;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProyectoBancoDao {
    private final EntityManagerFactory emf;
    
    public ProyectoBancoDao() {
        emf = Persistence.createEntityManagerFactory("ProyectosConstruccion-pu");
    }
    
    public List<proyecto> findAll()
    {
        List<proyecto> ProyectosConstruccion = null;
        var em = emf.createEntityManager();        
        return null;
        
    }        
   
}
