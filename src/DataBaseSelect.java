import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseSelect {
    public static void main(String[] args) {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");

           String username = "root";
           String passwrd = "Lucky@server2002";
           String url = "jdbc:mysql://localhost/lucky";
           Connection connection = DriverManager.getConnection(url,username,passwrd);

           Statement statement = connection.createStatement();

           String query = "Select * From stdata";

           ResultSet resultSet = statement.executeQuery(query);

           while (resultSet.next()==true)
           {
               System.out.println("Roll Number: "+resultSet.getLong(1));
               System.out.println("Name: "+resultSet.getString(2));
               System.out.println("Enrollment Number: "+resultSet.getString(3));
               System.out.println("Addmission year: "+resultSet.getString(4));
               System.out.println("Course: "+resultSet.getString(5));
               System.out.println("Program: "+resultSet.getString(6));
               System.out.println("Semester: "+resultSet.getString(7));
               System.out.println("Contact Number : "+resultSet.getLong(8));
               System.out.println("Year: "+resultSet.getString(9));
               System.out.println("College Name: "+resultSet.getString(10));
               System.out.println();

               try
               {
                   Thread.sleep(500);
               }
               catch (Exception e)
               {
                   e.printStackTrace();
               }
           }

           System.out.println("Selection success");
           JOptionPane.showMessageDialog(null,"all Data fatched!");

           connection.close();
       }catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
