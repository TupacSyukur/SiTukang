/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package situkang;
import java.sql.*;

/**
 *
 * @author user
 */
public class DatabaseConnection {
    private static java.sql.Connection conn;
    
    public static Connection getCon() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/situkang";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = DriverManager.getConnection(url, user, password);
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
