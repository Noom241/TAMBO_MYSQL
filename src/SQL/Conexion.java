
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Conexion {
    
    public static Connection getConexion(){
        
        String MYSQLHOST = "containers-us-west-190.railway.app";
        String MYSQLPORT = "5925";
        String MYSQLDATABASE = "railway";
        String MYSQLUSER = "root";
        String MYSQLPASSWORD = "9HgV8Q50l7GZKlAACiAG";

        String conexionUrl = "jdbc:mysql://" + MYSQLHOST + ":" + MYSQLPORT + "/" + MYSQLDATABASE + "?user=" + MYSQLUSER + "&password=" + MYSQLPASSWORD;

               
       
       try{
           Connection con=DriverManager.getConnection(conexionUrl);
           return con;
       }catch(SQLException ex){
           System.out.println(ex.toString());
           return null;
       }
    }

    PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
