
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtilities;

public class ComprasDao {
   public List<ComprasVo> listar()throws SQLException
   {    
        ArrayList<ComprasVo> a = new ArrayList<>();   
        Connection conn = JDBCUtilities.getConnection(); 
        Statement stmt = null;   
        ResultSet rs = null;  
        String consulta = "SELECT ID_COMPRA, p.CONSTRUCTORA, p.BANCO_VINCULADO" 
                          +" FROM COMPRA c" 
                          +" INNER JOIN PrOYECTO p ON c.ID_PROYECTO =p.ID_PROYECTO" 
                          +" WHERE p.CIUDAD ='Salento'" 
                          +" AND c.PROVEEDOR ='Homecenter'";
        try
        {
          stmt = conn.createStatement();
          rs= stmt.executeQuery(consulta);
          while(rs.next())
           {
              ComprasVo compras = new ComprasVo();
              compras.setId_compra(rs.getInt("ID_COMPRA"));
              compras.setConstructora(rs.getString("CONSTRUCTORA"));
              compras.setBanco_vinculado(rs.getString("BANCO_VINCULADO"));
              a.add(compras);
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
