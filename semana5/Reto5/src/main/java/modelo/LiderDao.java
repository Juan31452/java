
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtilities;

public class LiderDao {
  public List<LiderVo> listar()throws SQLException
   {    
        ArrayList<LiderVo> a = new ArrayList<>();   
        Connection conn = JDBCUtilities.getConnection(); 
        Statement stmt = null;   
        ResultSet rs = null;  
        String consulta = "SELECT ID_LIDER,NOMBRE, PRIMER_APELLIDO, CIUDAD_RESIDENCIA"
                          +" FROM Lider l"
                          +" ORDER BY CIUDAD_RESIDENCIA ASC";
        try
        {
          stmt = conn.createStatement();
          rs= stmt.executeQuery(consulta);
          while(rs.next())
           {
              LiderVo lider = new LiderVo();
              lider.setId_lider(rs.getInt("ID_LIDER"));
              lider.setNombre(rs.getString("NOMBRE"));
              lider.setApellido(rs.getString("PRIMER_APELLIDO"));
              lider.setCiudad(rs.getString("CIUDAD_RESIDENCIA"));
              a.add(lider);
           }
        }finally
        {
          if (rs != null){
              rs.close();
          }
          if (stmt != null) {
             stmt.close();
          }
          if (conn != null){
              conn.close();
          } 

        
        } 
        return a;      
   }  
    
}
