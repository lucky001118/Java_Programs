import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class SwingPasswordFild {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password field");
        frame.setBounds(100,100,300,300);
        JPasswordField pass = new JPasswordField();  //It create the password field
        pass.setBounds(10,10,150,30);
        pass.setFont( new Font("arial",Font.BOLD,20));
        System.out.println(pass.getPassword());

        JPasswordField pass2 = new JPasswordField();
        pass2.setBounds(10,50,150,30);
        pass2.setEchoChar('*');  //This line of code change password normal partton to the *
        pass2.setFont( new Font("Arial",Font.BOLD,20));


        JButton button = new JButton("See");
        button.setBounds(165,50,30,30);

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);  //to cursor point
        button.setCursor(cursor);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              // pass2.setEchoChar((char)0);  //T?his line means the password partton will showing
                String getpass2 = Arrays.toString(pass2.getPassword());
                System.out.println();
                System.out.println(pass2.getPassword());
            }
        });



        frame.add(pass);
        frame.add(pass2);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
