package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    public static Connection getConnection() {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/sms";
        String username = "root";
        String password = "Aparna@20";

        Connection con = null;

        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            con = DriverManager.getConnection(url, username, password);

            System.out.println("Connected to the database successfully!");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }

        return con;   // VERY IMPORTANT
    }
}
