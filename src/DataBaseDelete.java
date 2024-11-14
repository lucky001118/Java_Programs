import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBaseDelete {
    public static void main(String[] args) {
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");  //loading the mysql driver

                String username = "root";
                String passwrd = "Lucky@server2002";
                String url = "jdbc:mysql://localhost/javadatabase";
                Connection connection = DriverManager.getConnection(url,username,passwrd);  //ready connection

                Statement statement = connection.createStatement();     //creating the  statement for execution
                String query = "delete from table1 where Name = 'Vaibhav'";  //This query will delete your record from the target database and target table
                int i = statement.executeUpdate(query);   //Executing the query

                System.out.println("Deleted success-fully... \n "+ i +" line affected ");

                connection.close();     // closing the stablished connection
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
    }
}
