import java.sql.*;

public class DataBaseInsert {
    public static void main(String[] args) throws ClassNotFoundException {

        try {
        //load the Driver of jdbc
        Class.forName("com.mysql.cj.jdbc.Driver");

        String username = "root";
        String passwrd = "Lucky@server2002";
        String url = "jdbc:mysql://localhost/javadatabase";

            Connection connection = DriverManager.getConnection(url,username,passwrd);

           /* //for insert the command is follows like this ---->>>>>>
            Statement stm = connection.createStatement();
            String query = " insert into table1 (tableID,Name,city) values (4545568,'Manikpuri','Anjora')";
            stm.executeUpdate(query);*/

            //WE can also write this
            //it will knows as the preparedStatement
            //The PreparedStatement interface is a subinterface of Statement. It is used to execute parameterized query.
            String queery = " insert into table1 (tableID,Name,city) values (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(queery);
            statement.setInt(1,321);   // 1 takes for first question-mark place
            statement.setString(2,"Vaibhav");  // 2 takes the second question-mark place
            statement.setString(3,"Durg");      // 3 takes third question-mark place
            statement.executeUpdate();

            System.out.println("success-full");

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
