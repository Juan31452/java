
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtilities;

public class ProyectoDao {
  public List<ProyectoVo> listar()throws SQLException
   {    
        ArrayList<ProyectoVo> a = new ArrayList<>();   
        Connection conn = JDBCUtilities.getConnection(); 
        Statement stmt = null;   
        ResultSet rs = null;  
        String consulta = "SELECT ID_PROYECTO, CONSTRUCTORA, NUMERO_HABITACIONES, CIUDAD" 
                          +" FROM PROYECTO p" 
                          +" WHERE CIUDAD IN('Santa Marta', 'Cartagena', 'Barranquilla')" 
                          +" AND CLASIFICACION ='Casa Campestre'";
        try
        {
          stmt = conn.createStatement();
          rs= stmt.executeQuery(consulta);
          while(rs.next())
           {
              ProyectoVo proyecto = new ProyectoVo();
              proyecto.setId_proyecto(rs.getInt("ID_PROYECTO"));
              proyecto.setConstructura(rs.getString("CONSTRUCTORA"));
              proyecto.setNumero_habitaciones(rs.getInt("NUMERO_HABITACIONES"));
              proyecto.setCiudad(rs.getString("CIUDAD"));
              a.add(proyecto);
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
