package reto4.grupo61.controlador;

import java.sql.SQLException;
import java.util.List;

import reto4.grupo61.modelo.dao.ComprasDeLiderDao;
import reto4.grupo61.modelo.dao.DeudasPorProyectoDao;
import reto4.grupo61.modelo.dao.ProyectoBancoDao;
import reto4.grupo61.modelo.vo.ComprasDeLiderVo;
import reto4.grupo61.modelo.vo.DeudasPorProyectoVo;
import reto4.grupo61.modelo.vo.ProyectoBancoVo;


public class ReportesController {
   private ComprasDeLiderDao compraslider;
   private DeudasPorProyectoDao deudasproyecto;
   private ProyectoBancoDao proyectobanco;
   
   public ReportesController()
   {
      this.compraslider = new ComprasDeLiderDao();
      this.deudasproyecto = new DeudasPorProyectoDao();
      this.proyectobanco = new ProyectoBancoDao();
      

   }

   //metodos para entregar informacion
   //listar Proyectos
   public List<ProyectoBancoVo> ListarProyectos(String banco)throws SQLException
   {
      return proyectobanco.listar(banco);
   }
   
   //Listar Deudas
   public List<DeudasPorProyectoVo> ListarDeudas(Double limite)throws SQLException
   {
      return deudasproyecto.listar(limite);
   }

   //Listar Lideres
   public List<ComprasDeLiderVo> Listarlider()throws SQLException
   {
      return compraslider.listar();
   }
 
   

}