import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SwingPackageExample {
   // private static Border r;

    public static void main(String[] args) {

        JFrame f = new JFrame(); //creating the frame object
        JButton b= new JButton("click me"); //creating the object of the JButton class

        b.setBounds(130,100,100,40);  //setting the boundries of button
        b.setBackground(Color.green);  //Adding color in the button
      //  b.setBorder(r);

        f.add(b);  //adding the button in the frame

        f.setSize(400,500);  //set the size of freme
        f.setLayout(null);
        f.setVisible(true);
    }
}
