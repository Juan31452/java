package reto4.grupo61.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import reto4.grupo61.modelo.vo.ProyectoBancoVo;
import reto4.grupo61.util.JDBCUtilities;



public class ProyectoBancoDao 
{
   public List<ProyectoBancoVo> listar(String banco)throws SQLException
   {    
        ArrayList<ProyectoBancoVo> a = new ArrayList<ProyectoBancoVo>();   
        Connection conn = JDBCUtilities.getConnection(); 
        PreparedStatement pstmt = null;  
        ResultSet rs = null;  
        String consulta = "SELECT P.ID_PROYECTO AS ID, P.CONSTRUCTORA, P.CIUDAD,"
                        +" P.CLASIFICACION, T.ESTRATO, L.NOMBRE||' '||L.PRIMER_APELLIDO||"
                        +" ' '||L.SEGUNDO_APELLIDO AS LIDER"
                        +" FROM PROYECTO P"
                        +" JOIN TIPO T ON (P.ID_TIPO = T.ID_TIPO)"
                        +" JOIN LIDER L ON (P.ID_LIDER = L.ID_LIDER)"
                        +" WHERE P.BANCO_VINCULADO = ?"
                        +" ORDER BY FECHA_INICIO DESC, CIUDAD, CONSTRUCTORA";
        try
        {
          pstmt = conn.prepareStatement(consulta);
          pstmt.setString(1,banco);
          rs= pstmt.executeQuery();
          while(rs.next())
           {
              ProyectoBancoVo proyecto = new ProyectoBancoVo();
              proyecto.setId_proyecto(rs.getInt("ID"));
              proyecto.setCiudad(rs.getString("CIUDAD"));
              proyecto.setConstructora(rs.getString("CONSTRUCTORA"));
              proyecto.setClasificacion(rs.getString("CLASIFICACION"));
              proyecto.setEstrato(rs.getInt("ESTRATO"));
              proyecto.setLider(rs.getString("LIDER"));
              a.add(proyecto);
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
