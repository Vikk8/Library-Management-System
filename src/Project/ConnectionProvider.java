/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection getCon() {
        Connection con = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Replace with your actual database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/library";
            String username = "root";
            String password = "vikki";

            // Create a database connection
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            // Print the exception details to diagnose the issue
            e.printStackTrace();
        }
        return con;
    }
}

