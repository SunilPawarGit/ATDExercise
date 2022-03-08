
package jdbcwithmysql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sunil
 */
public class dbClass {
    public static Connection con;
     public static Connection connect() throws Exception{
         
         try{
             String driver="com.mysql.cj.jdbc.Driver";
             String url="jdbc:mysql://localhost:3306/practiceDB";
             String username="root";
             String password="sunil@123";
             Class.forName(driver);
              con=DriverManager.getConnection(url,username,password);
             
             System.out.println("Database Connected Successfully..");
             
             return con;
         }catch(Exception e){
            System.out.println(e);

         }
        return null; 
     }
}
