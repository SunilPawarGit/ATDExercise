package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sunil
 */
public class Mydb {
        public static Connection con = null;
    public static Connection connect() throws
            ClassNotFoundException{
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=StudentData_DB;user=root;password=sunil@123";
        try{
            con = DriverManager.getConnection(connectionURL);
            
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return con;
    }
}
