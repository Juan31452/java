
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.LiderDao;
import modelo.LiderVo;
import modelo.ProyectoDao;
import modelo.ProyectoVo;
import vista.Consulta1;
import vista.Consulta2;


public class ControladorLider implements ActionListener {

   
      LiderVo lidervo = new LiderVo();
      LiderDao liderdao = new LiderDao();
      ProyectoDao proyectodao = new ProyectoDao();
      Consulta1 ver = new Consulta1();
      Consulta2 ver1 = new Consulta2();
      DefaultTableModel modelo = new DefaultTableModel();  
       

    public ControladorLider(Consulta1 v) {
        this.ver = v;
        this.ver.BtnConsultar.addActionListener(this);
        
    }
    
    public ControladorLider(Consulta2 v1) {
        this.ver1 = v1;
        this.ver1.BtnConsultar.addActionListener(this);
        
    }
  

  @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== ver.BtnConsultar    )
       {
           Listar(ver.MiTabla);
       }else{
          if(e.getSource()== ver1.BtnConsultar )
          {
            Listar1(ver1.MiTabla);   
          }    
       }  
    }
    
    public void Listar(JTable tabla)
    {
      try
      {    
         modelo = (DefaultTableModel)tabla.getModel();
         List<LiderVo> proyecto = liderdao.listar();
         Object[]object = new Object[4];
           for (LiderVo lista:proyecto) {
               object[0]=lista.getId_lider();
               object[1]=lista.getNombre();
               object[2]=lista.getApellido();
               object[3]=lista.getCiudad();
               modelo.addRow(object);
           }
        }catch(SQLException ex){
           System.err.println("Error"+ex);
        }  
        ver.MiTabla.setModel(modelo);
    }

    public void Listar1(JTable tabla)
    {
      try
      {    
         modelo = (DefaultTableModel)tabla.getModel();
         List<ProyectoVo> proyecto = proyectodao.listar();
         Object[]object = new Object[4];
           for (ProyectoVo lista:proyecto) {
               object[0]=lista.getId_proyecto();
               object[1]=lista.getConstructura();
               object[2]=lista.getNumero_habitaciones();
               object[3]=lista.getCiudad();
               modelo.addRow(object);
           }
        }catch(SQLException ex){
           System.err.println("Error"+ex);
        }  
        ver.MiTabla.setModel(modelo);
    }    
}
