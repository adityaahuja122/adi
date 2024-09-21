
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MySQLConnect {
    private static Connection connection = null;
    
    public static Connection getConnection() {
        if(connection == null) {
            String connectionString = "jdbc:mysql://localhost:3306/login";
            try{
                connection = DriverManager.getConnection(connectionString, "root", "abcd1234");
            } catch(SQLException ex){
               String msg = "Could not connect to db: " + ex.getMessage();
               JOptionPane.showMessageDialog(null,msg, "Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        return connection;
    }
}
