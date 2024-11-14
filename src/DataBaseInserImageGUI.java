import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataBaseInserImageGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Insertion Images in the database..");
        frame.setBounds(400,200,600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout br = new BorderLayout();
        frame.setLayout(br);
        frame.setLocationRelativeTo(null);

        JLabel label1 = new JLabel("Inserting the Image in the database");
        frame.add(label1,BorderLayout.NORTH);
        label1.setFont( new Font("arial",Font.BOLD,20));
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel = new JPanel();
       // panel.setSize(570,400);
        panel.setLayout(null);
        panel.setBackground(Color.green);
        frame.add(panel,BorderLayout.CENTER);

        JLabel imageid = new JLabel("Enter ID:");
        imageid.setBounds(30,50,60,20);
        panel.add(imageid);

        JTextArea area = new JTextArea();
        area.setSize(80,20);
        area.setLocation(100,50);
        panel.add(area);

        JLabel image = new JLabel("Image:");
        image.setBounds(210,50,40,20);
        panel.add(image);

        JButton buttonSelect = new JButton("Select");
        buttonSelect.setBounds(260,50,80,20);
        panel.add(buttonSelect);

        JTextArea areaPath = new JTextArea();
        areaPath.setSize(350,20);
        areaPath.setLocation(30,90);
        panel.add(areaPath);

        JButton buttonInsert = new JButton("Insert");
        buttonInsert.setBounds(150,130,80,20);
        //buttonInsert.setHorizontalAlignment(SwingConstants.CENTER);
       // buttonInsert.setVerticalAlignment(SwingConstants.CENTER);
        panel.add(buttonInsert);

        buttonSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int selectedoption = fileChooser.showDialog(null,"Open My File");  // ------->> creating the button "open my file" if it clicked then i twill return an integer value

                if(selectedoption==JFileChooser.APPROVE_OPTION)  //this line check if we selected the file then action performed
                {
                    System.out.println("Selected path is : "+fileChooser.getSelectedFile().getAbsolutePath());  //The line fileChooser.getSelectedFile().getAbsolutePath() --->> get the path of the selected file
                    String Path = fileChooser.getSelectedFile().getAbsolutePath();
                    areaPath.setText(Path);

                    JOptionPane.showMessageDialog(null,"Path Selected Success-fully!");
                }
                else
                {
                    System.out.println("user cancelled hte dialog.");
                    JOptionPane.showMessageDialog(null,"Path not Selected Success-fully!");
                }
            }
        });

        buttonInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url ="jdbc:mysql://localhost:3306/javadatabase";
                    //String url ="jdbc:mysql://localhost:3306/javadatabase";
                    String username = "root";
                    String pass = "Lucky@server2002";

                    Connection connection = DriverManager.getConnection(url,username,pass);

                    int Imageno = Integer.parseInt(area.getText());
                    String path = areaPath.getText();
                    //String pathodImage ="C:\\Users\\manik\\Downloads\\login_page_character.png";
                    String q = "Insert into Storelongimage Values (?,?)";

                    PreparedStatement statement = connection.prepareStatement(q);
                    statement.setInt(1,Imageno);
                    statement.setString(2,path);

                    int i = statement.executeUpdate();

                    System.out.println("Success-fully Updated Image, "+i+" Rows affected..");
                    JOptionPane.showMessageDialog(null,"Success-fully Updated Image, "+i+" Rows affected..");

                    connection.close();

                }catch (Exception r)
                {
                    r.printStackTrace();
                }
            }
        });


        frame.setVisible(true);
    }
}
