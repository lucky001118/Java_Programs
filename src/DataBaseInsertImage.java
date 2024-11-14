import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DataBaseInsertImage {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/javadatabase";
            //String url ="jdbc:mysql://localhost:3306/javadatabase";
            String username = "root";
            String pass = "Lucky@server2002";

            Connection connection = DriverManager.getConnection(url,username,pass);

            int Imageno = 004;
            String pathodImage ="C:\\Users\\manik\\Downloads\\login_page_character.png";
            String q = "Insert into Storelongimage Values (?,?)";

            PreparedStatement statement = connection.prepareStatement(q);
            statement.setInt(1,Imageno);
            statement.setString(2,pathodImage);

           /* Statement statement = connection.createStatement();
            String q = "Insert into Storelongimage Values (002,'C:\\Users\\manik\\Downloads\\login_page_character.png')";*/

            int i = statement.executeUpdate();

            System.out.println("Success-fully Updated Image, "+i+" Rows affected..");
            JOptionPane.showMessageDialog(null,"Success-fully Updated Image, "+i+" Rows affected..");

            connection.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
