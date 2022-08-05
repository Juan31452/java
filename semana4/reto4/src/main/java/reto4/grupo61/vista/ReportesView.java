package reto4.grupo61.vista;

import java.util.List;

import reto4.grupo61.controlador.ReportesController;
import reto4.grupo61.modelo.vo.ComprasDeLiderVo;
import reto4.grupo61.modelo.vo.DeudasPorProyectoVo;
import reto4.grupo61.modelo.vo.ProyectoBancoVo;

public class ReportesView {
  private static ReportesController controlador;            
    public ReportesView()
    {
       controlador = new ReportesController();
    }

    private String repitaCaracter(Character caracter, Integer veces) 
    {
        String respuesta = "";
        for (int i = 0; i < veces; i++) {
        respuesta += caracter;
        }
        return respuesta;
    }

    public void proyectosFinanciadosPorBanco(String banco) 
    {
      System.out.println(repitaCaracter('=', 36) + " LISTADO DE PROYECTOS POR BANCO "
      + repitaCaracter('=', 37));
      if (banco != null && !banco.isBlank()) 
      {
         System.out.println(String.format("%3s %-25s %-20s %-15s %-7s %-30s",
         "ID", "CONSTRUCTORA", "CIUDAD", "CLASIFICACION", "ESTRATO", "LIDER"));
         System.out.println(repitaCaracter('-', 105));
         // TODO Imprimir en pantalla la información del proyecto
         try
         {
            List<ProyectoBancoVo> proyecto= controlador.ListarProyectos(banco);
            for(ProyectoBancoVo proyect:proyecto)
            {
              System.out.println(proyect);
            }
          }catch(Exception ex){
            System.err.println("Error:"+ex);
          }

       }
    }
    
    public void totalAdeudadoPorProyectosSuperioresALimite(Double limiteInferior) {
      System.out.println(repitaCaracter('=', 1) + " TOTAL DEUDAS POR PROYECTO "
      + repitaCaracter('=', 1));
      if (limiteInferior != null) 
       {
         System.out.println(String.format("%3s %15s", "ID", "VALOR "));
         System.out.println(repitaCaracter('-', 29));
         // TODO Imprimir en pantalla la información del total adeudado
         try
         {
            List<DeudasPorProyectoVo> proyecto= controlador.ListarDeudas(limiteInferior);
            for(DeudasPorProyectoVo proyect:proyecto)
            {
              System.out.println(proyect);
            }
          }catch(Exception ex){
            System.err.println("Error:"+ex);
          }

        }
    }
    public void lideresQueMasGastan() 
    {
        System.out.println(repitaCaracter('=', 6) + " 10 LIDERES MAS COMPRADORES "
        + repitaCaracter('=', 7));
        System.out.println(String.format("%-25s %15s", "LIDER", "VALOR "));
        System.out.println(repitaCaracter('-', 41));
        // TODO Imprimir en pantalla la información de los líderes
        try
         {
            List<ComprasDeLiderVo> proyecto= controlador.Listarlider();
            for(ComprasDeLiderVo proyect:proyecto)
            {
              System.out.println(proyect);
            }
          }catch(Exception ex){
            System.err.println("Error:"+ex);
          }

    } 
}
