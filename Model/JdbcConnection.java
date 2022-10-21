package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnection {

    private static String url = "jdbc:mysql://localhost/sampletrain";
    private static String username = "root";
    private static String password = "Chrisevans@2309";
    private static Connection connection=null;
    private static String urlstring;
    private PreparedStatement preparedstatement = null;
    private ResultSet resultset = null;

    public Connection getConnection() {

        try {
            connection = DriverManager.getConnection(urlstring, username, password);
        } catch (SQLException ex) {
            // log an exception. fro example:
            System.out.println("Failed to create the database connection.");
        }
        return connection;
    }
    public PreparedStatement putData(String sql) throws SQLException{
        preparedstatement=connection.prepareStatement(sql);
        return preparedstatement;

    }
}
