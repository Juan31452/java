package reto4.grupo61.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import reto4.grupo61.modelo.vo.ComprasDeLiderVo;
import reto4.grupo61.util.JDBCUtilities;

public class ComprasDeLiderDao {
   public List<ComprasDeLiderVo> listar()throws SQLException
   {    
        ArrayList<ComprasDeLiderVo> a = new ArrayList<ComprasDeLiderVo>();   
        Connection conn = JDBCUtilities.getConnection(); 
        PreparedStatement pstmt = null;  
        ResultSet rs = null;  
        String consulta = "SELECT L.NOMBRE ||' '||L.PRIMER_APELLIDO ||'"
        +"'||L.SEGUNDO_APELLIDO AS LIDER, SUM(C.CANTIDAD * MC.PRECIO_UNIDAD) AS VALOR"
        +" FROM LIDER L"
        +"JOIN PROYECTO P ON (P.ID_LIDER = L.ID_LIDER)"
        +"JOIN COMPRA C ON (P.ID_PROYECTO = C.ID_PROYECTO)"
        +"JOIN MATERIALCONSTRUCCION MC ON (C.ID_MATERIALCONSTRUCCION = MC.ID_MATERIALCONSTRUCCION)"
        +"GROUP BY L.NOMBRE ||' '||L.PRIMER_APELLIDO ||' '||L.SEGUNDO_APELLIDO"
        +"ORDER BY VALOR DESC LIMIT 10";
        
        try
        {
          pstmt = conn.prepareStatement(consulta);
          //pstmt.setDouble(1,limite);
          rs= pstmt.executeQuery();
          while(rs.next())
           {
            ComprasDeLiderVo Compras = new ComprasDeLiderVo();
            Compras.setLider(rs.getString("LIDER"));
            Compras.setValor(rs.getDouble("VALOR"));
              a.add(Compras);
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
