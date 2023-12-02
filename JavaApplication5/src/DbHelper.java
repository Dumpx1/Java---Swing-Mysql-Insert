
import java.sql.*;

public class DbHelper {
    static String userName="root";
        static String password="admin";
        static String DbUrl="jdbc:mysql://localhost:3306/kullanicilar";

    
    public Connection getConnetcion() throws SQLException{
      
        return(Connection) DriverManager.getConnection(DbUrl, userName, password);
        
    }
    public void ShowError(SQLException execption){
        System.out.println("Error : " + execption.getMessage());
        System.out.println("ErrorCode : " + execption.getErrorCode());
    }
    
    
}
