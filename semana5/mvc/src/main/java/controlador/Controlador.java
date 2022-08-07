
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ProyectoBancoDao;
import modelo.ProyectoBancoVo;
import vista.VerConsultas;

/**
 *
 * @author juank
 */
public class Controlador implements ActionListener{

  ProyectoBancoVo proyectovo = new ProyectoBancoVo();
  ProyectoBancoDao proyectodao = new ProyectoBancoDao();
  VerConsultas ver = new VerConsultas();
  DefaultTableModel modelo = new DefaultTableModel();

    public Controlador(VerConsultas v) {
        this.ver = v;
        this.ver.btnConsulta.addActionListener(this);
        
    }
  

  @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== ver.btnConsulta)
       {
           Listar(ver.MiTabla);
       }  
        
    }
    
    public void Listar(JTable tabla)
    {
      try
      {    
         modelo = (DefaultTableModel)tabla.getModel();
         List<ProyectoBancoVo>proyecto = proyectodao.listar("Conavi");
         Object[]object = new Object[6];
           for (ProyectoBancoVo lista:proyecto) {
               object[0]=lista.getId_proyecto();
               object[1]=lista.getConstructora();
               object[2]=lista.getCiudad();
               object[3]=lista.getClasificacion();
               object[4]=lista.getEstrato();
               object[5]=lista.getLider();
               modelo.addRow(object);
           }
        }catch(SQLException ex){
           System.err.println("Error"+ex);
        }  
        ver.MiTabla.setModel(modelo);
    }   
    
}      
    

