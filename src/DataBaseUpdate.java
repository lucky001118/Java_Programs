import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBaseUpdate {
    public static void main(String[] args) {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");  //loading the mysql driver

           String username = "root";
           String passwrd = "Lucky@server2002";
           String url = "jdbc:mysql://localhost/javadatabase";
           Connection connection = DriverManager.getConnection(url,username,passwrd);  //ready connection

           Statement statement = connection.createStatement();     //creating the  statement for execution
           String query = "Update table1 set tableID = 451562 where tableID = 321";  //This query will update your database
           statement.executeUpdate(query);   //Executing the query

           System.out.println("Update success-fully... ");

           connection.close();     // closing the stablished connection
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
