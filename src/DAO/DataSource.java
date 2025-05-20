/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    private Connection connection;

    
    
    public static Connection connect() throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/quản lý kho";
        String user = "root";
        String password = "";
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối CSDL thành công!");
        } 
         catch (SQLException e) {
            System.out.println("Lỗi kết nối CSDL.");
        } 
        return conn;
    }
}
