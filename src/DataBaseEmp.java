import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class DataBaseEmp {
    public static void InsertData( int empID, String name,String dep,int age,int selery,String dob)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url ="jdbc:mysql://localhost:3306/javadatabase";
            //String url ="jdbc:mysql://localhost:3306/javadatabase";
            String username="root";
            String pass="Lucky@server2002";
            Connection connection = DriverManager.getConnection(url, username, pass);

            String query = "Insert into employee Values (?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1,empID);
            statement.setString(2,name);
            statement.setString(3,dob);
            statement.setInt(4,age);
            statement.setString(5,dep);
            statement.setInt(6,selery);

            int exc = statement.executeUpdate();
            System.out.println(exc);
           //JOptionPane.showMessageDialog(null,"Insertion Success-fully Done!");
            connection.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static  void SelectData()
    {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");

           String url ="jdbc:mysql://localhost:3306/javadatabase";
           //String url ="jdbc:mysql://localhost:3306/javadatabase";
           String username="root";
           String pass="Lucky@server2002";
           Connection connection = DriverManager.getConnection(url, username, pass);

           String query = "Select * From employee";

           Statement statement = connection.createStatement();

           ResultSet resultSet = statement.executeQuery(query);

           while (resultSet.next()==true)
           {
               System.out.println("Employee ID: "+resultSet.getInt(1));
               System.out.println("Employee Name: "+resultSet.getString(2));
               System.out.println("Date of Birth: "+resultSet.getString(3));
               System.out.println("Age: "+resultSet.getInt(4));
               System.out.println("Employee Department: "+resultSet.getString(5));
               System.out.println("Salary: "+resultSet.getInt(6));
               System.out.println("---------------------------------------------------------------------");
               System.out.println();
           }
           System.out.println("All Data Fateched Success-fully!");
           connection.close();

       }catch (Exception e)
       {
           e.printStackTrace();
       }
    }

    public static void SelectSpecific(int employeeID)
    {
try
{
    Class.forName("com.mysql.cj.jdbc.Driver");

    String url ="jdbc:mysql://localhost:3306/javadatabase";

    String username="root";
    String pass="Lucky@server2002";
    Connection connection = DriverManager.getConnection(url, username, pass);

    String query = "Select * from employee Where EmployeeID = ?";

    PreparedStatement statement = connection.prepareStatement(query);
    statement.setInt(1,employeeID);

    ResultSet resultSet = statement.executeQuery();

    //This csn also works....

   /*
   Class.forName("com.mysql.cj.jdbc.Driver");

    String url ="jdbc:mysql://localhost:3306/javadatabase";

    String username="root";
    String pass="Lucky@server2002";
    Connection connection = DriverManager.getConnection(url, username, pass);

    String query = "select * from employee where EmployeeID = "+employeeID;

    Statement statement = connection.createStatement();

    ResultSet resultSet = statement.executeQuery(query);
*/
    while (resultSet.next()==true) {
        System.out.println("Employee ID: " + resultSet.getInt(1));
        System.out.println("Employee Name: " + resultSet.getString(2));
        System.out.println("Date of Birth: " + resultSet.getString(3));
        System.out.println("Age: " + resultSet.getInt(4));
        System.out.println("Employee Department: " + resultSet.getString(5));
        System.out.println("Salary: " + resultSet.getInt(6));
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }
    System.out.println("All Data Fateched Success-fully!");
    connection.close();
}
catch (Exception e)
{
    e.printStackTrace();
}
    }

    public static  void DeleteSpecific(int employeeID)
    {

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  //loading the mysql driver

            String username = "root";
            String passwrd = "Lucky@server2002";
            String url = "jdbc:mysql://localhost/javadatabase";
            Connection connection = DriverManager.getConnection(url,username,passwrd);  //ready connection

            String query = "delete from employee where EmployeeID = ?";  //This query will delete your record from the target database and target table
            PreparedStatement statement = connection.prepareStatement(query);     //creating the  statement for execution

            statement.setInt(1,employeeID);

            int i = statement.executeUpdate();   //Executing the query

            System.out.println("Deleted success-fully... \n "+ i +" line affected ");

            statement.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void MenuCard()
    {
        Scanner inpute = new Scanner(System.in);   //creating the scanner class object

        System.out.println("What do you want to do: \n 1) Insert Employee Details in database. \n 2) Select all Data from database to see. \n 3) Select specific data from database. \n 4) Delete specific Record in Database. ");
        int choose = inpute.nextInt();

        switch (choose)
        {
            case 1:
                System.out.println("***** Enter the details of followings *****");

                System.out.print("Enter the ID of the employee: ");
                int id = inpute.nextInt();
                System.out.print("Enter the Name of the Employee: ");
                String name = inpute.next();
                System.out.print("Enter your Date of Birth in (yyyy-mm-dd) format: ");
                String dob = inpute.next();
                System.out.print("Enter your age: ");
                int age = inpute.nextInt();
                System.out.print("Enter your Department: ");
                String depart = inpute.next();
                System.out.print("Enter your salary: ");
                int salary= inpute.nextInt();
                InsertData(id,name,depart,age,salary,dob);
                break;
            case 2:
                SelectData();
                break;
            case 3:
                System.out.println("soon come.....");
                System.out.println("Enter the EmployeeID which you want to get detail: ");
                int employeeID = inpute.nextInt();
                SelectSpecific(employeeID);
                break;
            case 4:
                System.out.println("This feature will add soon.");
                System.out.println("Enter the EmployeeID which you want to get detail: ");
                int Empid = inpute.nextInt();
                DeleteSpecific(Empid);
                break;

        }

    }
    public  DataBaseEmp()
    {
        MenuCard();
    }
    public static void main(String[] args) {
        DataBaseEmp dbe = new DataBaseEmp();

    }
}
