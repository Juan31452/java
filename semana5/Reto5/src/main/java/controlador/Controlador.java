
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ComprasDao;
import modelo.ComprasVo;
import modelo.LiderDao;
import modelo.LiderVo;
import modelo.ProyectoDao;
import modelo.ProyectoVo;
import vista.FrmCompras;
import vista.FrmLider;
import vista.FrmProyectos;
import vista.MenuPrincipal;


public class Controlador implements ActionListener {

      MenuPrincipal menup;
      FrmLider flider;
      FrmProyectos fproyectos;
      FrmCompras fcompras;
      LiderDao liderdao = new LiderDao();
      ProyectoDao proyectodao = new ProyectoDao(); 
      ComprasDao comprasdao = new ComprasDao();
      DefaultTableModel modelo = new DefaultTableModel();  
      
   
  

    public Controlador() {
        menup = new MenuPrincipal();
        flider = new FrmLider();
        fproyectos = new FrmProyectos();
        fcompras = new FrmCompras();
        
        
    }
    
     public void iniciar()
    {
        menup.setTitle("Menu Principal");
        menup.getMenuLider().addActionListener(this);
        menup.getMenuProyectos().addActionListener(this);
        menup.getMenuCompras().addActionListener(this);
        menup.getMenuSalir().addActionListener(this);
        flider.BtnConsultar.addActionListener(this);
        fproyectos.BtnConsultar.addActionListener(this);
        fcompras.BtnConsultar.addActionListener(this);
        
        
        menup.setLocationRelativeTo(null);
        menup.setVisible(true);
       
    }        
    
  

  @Override
    public void actionPerformed(ActionEvent e) {

       
       if(e.getSource().equals(menup.getMenuLider()))
       {
           menup.getEscritorio().add(flider);
           flider.setVisible(true);
       }
       
       if(e.getSource().equals(menup.getMenuProyectos()))
       {
           menup.getEscritorio().add(fproyectos);
           fproyectos.setLocation(30, 30);//pocision
           fproyectos.setVisible(true);
       }
       
       if(e.getSource().equals(menup.getMenuCompras()))
       {
           menup.getEscritorio().add(fcompras);
           fcompras.setLocation(60, 60);
           fcompras.setVisible(true);
       }
       
       if(e.getSource().equals(menup.getMenuSalir()))
       {
        
          menup.dispose();
       }    
       
       if(e.getSource()== flider.BtnConsultar    )
       {
           Listar(flider.MiTabla);
       }
       
       if(e.getSource()== fproyectos.BtnConsultar    )
       {
           Listar1(fproyectos.MiTabla);
       }
       
       if(e.getSource()== fcompras.BtnConsultar    )
       {
           Listar2(fcompras.MiTabla);
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
        flider.MiTabla.setModel(modelo);
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
        fproyectos.MiTabla.setModel(modelo);
    }

    public void Listar2(JTable tabla)
    {
      try
      {    
         modelo = (DefaultTableModel)tabla.getModel();
         List<ComprasVo> compras = comprasdao.listar();
         Object[]object = new Object[3];
           for (ComprasVo lista:compras) {
               object[0]=lista.getId_compra();
               object[1]=lista.getConstructora();
               object[2]=lista.getBanco_vinculado();
               
               modelo.addRow(object);
           }
        }catch(SQLException ex){
           System.err.println("Error"+ex);
        }  
        fcompras.MiTabla.setModel(modelo);
    }    

}
