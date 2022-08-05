package reto4.grupo61.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import reto4.grupo61.modelo.vo.DeudasPorProyectoVo;
import reto4.grupo61.util.JDBCUtilities;

public class DeudasPorProyectoDao {
    public List<DeudasPorProyectoVo> listar(double limite)throws SQLException
   {    
        ArrayList<DeudasPorProyectoVo> a = new ArrayList<DeudasPorProyectoVo>();   
        Connection conn = JDBCUtilities.getConnection(); 
        PreparedStatement pstmt = null;  
        ResultSet rs = null;  
        String consulta = "SELECT P.ID_PROYECTO AS ID, SUM(C.CANTIDAD * MC.PRECIO_UNIDAD) AS VALOR"
                          +" FROM PROYECTO P"
                          +" JOIN COMPRA C ON (P.ID_PROYECTO = C.ID_PROYECTO)"
                          +" JOIN MATERIALCONSTRUCCION MC ON (C.ID_MATERIALCONSTRUCCION ="
                          +" MC.ID_MATERIALCONSTRUCCION)"
                          +" WHERE C.PAGADO = 'No'"
                          +" GROUP BY P.ID_PROYECTO"
                          +" HAVING SUM(C.CANTIDAD * MC.PRECIO_UNIDAD) > ?"
                          +" ORDER BY VALOR DESC";
        try
        {
          pstmt = conn.prepareStatement(consulta);
          pstmt.setDouble(1,limite);
          rs= pstmt.executeQuery();
          while(rs.next())
           {
              DeudasPorProyectoVo Deudas = new DeudasPorProyectoVo();
              Deudas.setId(rs.getInt("ID"));
              Deudas.setValor(rs.getDouble("VALOR"));
              a.add(Deudas);
           }
        }finally
        {
          if (rs != null){
              rs.close();
          }
          if (pstmt != null) {
             pstmt.close();
          }
          if (conn != null){
              conn.close();
          } 

        
        } 
        return a;      
   }
}
