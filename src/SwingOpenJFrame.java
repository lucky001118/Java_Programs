import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//HEre we will learning how we can open a JFrame in the another JFrame
public class SwingOpenJFrame {
    /*Frame frame2,frame;
    public void frameTwo()
    {

    }*/
    public static void main(String[] args) {
        SwingOpenJFrame sw = new SwingOpenJFrame();
        JFrame frame = new JFrame("Learning about how to open the a JFrame in the another JFrame");
        frame.setBounds(20,10,1500,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Learning about How to set the frame in a frame");
        label.setFont(new Font("New Times Roman",Font.BOLD,25));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(label,BorderLayout.CENTER);

        JButton button = new JButton("Click-me");
        button.setFont( new Font("arial",Font.BOLD,27));
        button.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(button,BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Frame frame2 = new JFrame("This is the Frsme no two");
                frame2.setBounds(500,250,900,700);
                frame2.setLocationRelativeTo(null);
                //frame2.setLayout(null);
                frame2.setVisible(true);

                ImageIcon imageIcon1 = new ImageIcon("C:\\Users\\manik\\Downloads\\box8_image.jpg");
                ImageIcon imageIcon2 = new ImageIcon("C:\\Users\\manik\\Downloads\\box6_image.jpg");
                JLabel label1 = new JLabel();
                label1.setSize(imageIcon2.getIconWidth(),imageIcon2.getIconHeight());
                //label1.setText("This is the label");
                label1.setIcon(imageIcon2);
                //frame2.setIconImage(imageIcon.getImage());
                frame2.setIconImage(imageIcon1.getImage());
                frame2.add(label1,BorderLayout.CENTER);
                label1.setHorizontalAlignment(SwingConstants.CENTER);

            }
        });


        frame.setVisible(true);

    }
}
