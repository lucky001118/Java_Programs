import java.io.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

class YatishPrcatical {/*implements ActionListener */
        static JTextField tf1;
        static JFrame f = new JFrame();

        YatishPrcatical() {
            f.setTitle("Bollywood game");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(1000, 1000);
            f.setLayout(new FlowLayout());

            JLabel l2 = new JLabel("Game Start's You have to enter correct letters for the missing place to win this Game\n");
            l2.setBackground(Color.WHITE);
            l2.setOpaque(true);
            l2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            l2.setFont(new Font("Arial", Font.BOLD, 20));
            l2.setHorizontalAlignment(SwingConstants.CENTER);
            f.add(l2);
            JLabel l3 = new JLabel(" ");
            l3.setPreferredSize(new Dimension(1920, 10));
            f.add(l3);
            f.setVisible(true);
        }

        static String s1;

        public static void main(String args[]) {
            new YatishPrcatical();
            JLabel l4 = new JLabel("Enter a Correct Character :");
            l4.setFont(new Font("Arial", Font.BOLD, 25));
            f.add(l4);
            tf1 = new JTextField();
            tf1.setPreferredSize(new Dimension(100, 45));
            tf1.setFont(new Font("Arial", Font.BOLD, 25));
            tf1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JButton b1 = new JButton("ENTER");
            f.add(tf1);
            b1.setPreferredSize(new Dimension(100, 45));

            JLabel l9 = new JLabel();
                       //Define and create label here
            /*
            See here here was  actual problem,
            you define object of Label at the end of program and also you only forwarding  the variable s1
            it is right but in case of Event managing it can not be provided.
            you have to handle all the event in the event function or method

             */


            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    s1 = tf1.getText();
                   l9.setText(s1);   //here action will performing you putted this at the time of object creation
                                    //which is right but in event handaling it says that perform all event which can handle in their scope only.
                    System.out.println(s1);
                }
            });


            System.out.println(s1);
            f.add(b1);

            l9.setPreferredSize(new Dimension(100, 40));
            l9.setBounds(400,400,100,40);
            l9.setFont(new Font("Arial", Font.BOLD, 25));

            f.add(l9);
            f.setVisible(true);
        }
}
