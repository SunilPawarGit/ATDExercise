package jdbcwithmysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdbcwithmysql.dbClass.connect;
import static jdbcwithmysql.dbClass.con;

/**
 * Exercise 1 : Write a program to create a table accountant with columns
 * id,name. emailId and password.
 */
public class JdbcWithMysql {

    static Statement st;
    static ResultSet rs;

    /*
    Exercise 1 : Write a program to create a table accountant with columns id,name. emailId and password.
    */
    public static void createtbl() throws SQLException {
        try {
            connect();

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Table Query For Creating : \n");
            String sql = sc.nextLine();
            st = con.createStatement();

            if (st.execute(sql)) {
                System.out.println("Table Created Successfully.");
            } else {
                System.out.println("Table Not Created.");
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        con.close();
    }
    /*
    Exercise 2: Write a program to insert 2 records in accountant table .
    */
    public static void insert() {
        try {
            connect();
            System.out.println("Enter INSERT Query :");
            Scanner sc = new Scanner(System.in);
            String sql = sc.nextLine();
            st = con.createStatement();

            if (st.executeUpdate(sql) != 0) {
                System.out.println("Data Inserted Successfully.");
            } else {
                System.out.println("Data Not Inserted.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(JdbcWithMysql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    /*
    Exercise 3: Write a program to get the list of accountants from accountant table.
    */
    public static void getAll() {
        try {
            connect();
            String sql = "SELECT * from accountant";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(" " + rs.getString("id") + "\t" + rs.getString("name") + "\t" + rs.getString("emailid") + "\t" + rs.getString("password"));
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    /*
    Exercise 4 : Write a program to delete a accountant whose id = 405 from accountant table.
    */
    public static void delete() {
        try {
            connect();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ID Which you want to delete : ");
            int id = sc.nextInt();
            String sql = "DELETE from accountant where id=" + id;
            st = con.createStatement();
            if (st.executeUpdate(sql) != 0) {
                System.out.println(" " + rs.getString("id")
                        + " " + rs.getString("name")
                        + " " + rs.getString("emailid") + " "
                        + rs.getString("password"));
            } else {
                System.out.println("Emty Table.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Options :\n"
                + "1. Create Table With Different Tbl name.\n"
                + "2. Insert Record.\n"
                + "3. Select All.\n"
                + "4. Delete Accountant by id.\n"
                + "5. EXIT.\n");

        outer:

        while ((n = sc.nextInt()) > 0) {
            if (n == 1) {
                createtbl();
                System.out.println("Select Options :\n"
                        + "1. Create Table With Different Tbl name.\n"
                        + "2. Insert Record.\n"
                        + "3. Select All.\n"
                        + "4. Delete Accountant by id.\n"
                        + "5. EXIT.\n");
                continue outer;
            } else if (n == 2) {
                insert();
                System.out.println("Select Options :\n"
                        + "1. Create Table With Different Tbl name.\n"
                        + "2. Insert Record.\n"
                        + "3. Select All.\n"
                        + "4. Delete Accountant by id.\n"
                        + "5. EXIT.\n");
                continue outer;
            } else if (n == 3) {
                getAll();
                System.out.println("Select Options :\n"
                        + "1. Create Table With Different Tbl name.\n"
                        + "2. Insert Record.\n"
                        + "3. Select All.\n"
                        + "4. Delete Accountant by id.\n"
                        + "5. EXIT.\n");
                continue outer;
            } else if (n == 4) {
                delete();
                System.out.println("Select Options :\n"
                        + "1. Create Table With Different Tbl name.\n"
                        + "2. Insert Record.\n"
                        + "3. Select All.\n"
                        + "4. Delete Accountant by id.\n"
                        + "5. EXIT.\n");
                continue outer;
            } else if (n == 5) {
                System.out.println(" Thank you.");
                break outer;
            } else {
                System.out.println("Please Choose Valid Option.\n");
                System.out.println("Select Options :\n"
                        + "1. Create Table With Different Tbl name.\n"
                        + "2. Insert Record.\n"
                        + "3. Select All.\n"
                        + "4. Delete Accountant by id.\n"
                        + "5. EXIT.\n");
                continue outer;
            }
        }

    }

}
