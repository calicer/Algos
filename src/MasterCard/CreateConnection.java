package MasterCard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Separate class is used fo creating the connection to avoid code duplication
public class CreateConnection {

    public static Connection connectDB(){
        try {
            Connection connection = DriverManager.getConnection("url", "username", "password");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
