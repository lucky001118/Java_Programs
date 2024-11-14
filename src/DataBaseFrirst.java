import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBaseFrirst {
    public static void main(String[] args) {
        try
        {
            //load the jdbc driver
           // Class.forName("com.mysql.jdbc.Driver");

            //Creating the connection
            String url = "jdbc:mysql://localhost:3306/javadatabase";
            String username = "root";
            String password = "Lucky@server2002";

            Connection connection = DriverManager.getConnection(url,username,password);

            String querry = "create table table1(tableID numeric(10) not null , Name varchar(25) , city varchar(20))";

            //creating the statement
            Statement stm = connection.createStatement();
            stm.executeUpdate(querry);

            System.out.println("database has been created");

            connection.close();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
