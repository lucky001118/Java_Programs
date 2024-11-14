import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.io.*;
public class SwingBasicForm {
    public static void main(String[] args) {

        String fname1,lname,add1,add2,fullname,dob;
                long mobile;

        //Creating the frame
        JFrame frame = new JFrame("Fill Details");
        frame.setBounds(400,150,600,600);
        frame.setLayout(null);

        //creating the lable to add the text.
        JLabel lable1 = new JLabel();
        lable1.setBounds(20,20,300,30);
        lable1.setText("Enter your details for processing.");
        lable1.setForeground(Color.pink);
        //setting the font size in the lable1
        Font font = new Font("Arial",Font.BOLD,30);
        lable1.setFont(font);

        //creating lable2 and text finld for taking the first name of customer
        JLabel lable2 = new JLabel("Enter you First Name: ");
        lable2.setBounds(20,80,150,20);
        JTextArea area1 = new JTextArea();
        area1.setBounds(180,80,100,20);
        area1.setBorder(BorderFactory.createBevelBorder(1));

        //creating lable2 and text finld for taking the first name of customer
        JLabel lable3 = new JLabel("Enter your Second Name: ");
        lable3.setBounds(20,110,150,20);
        JTextArea area2 = new JTextArea();
        area2.setBounds(180,110,100,20);
        area2.setBorder(BorderFactory.createBevelBorder(1));

        //creating label4 and text area3 for taking the first name of customer
        JLabel label4 = new JLabel("Enter your Date of Birth: ");
        label4.setBounds(20,140,150,20);
        JTextArea area3 = new JTextArea();
        area3.setBounds(180,140,100,20);
        area3.setBorder(BorderFactory.createBevelBorder(1));

        //creating label5 and text area4 for taking the first name of customer
        JLabel label5 = new JLabel("Enter your Age: ");
        label5.setBounds(20,170,150,20);
        JTextArea area4 = new JTextArea();
        area4.setBounds(180,170,100,20);
        area4.setBorder(BorderFactory.createBevelBorder(1));

        //creating label6 and text area5 for taking the first name of customer
        JLabel label6 = new JLabel("Enter your Local Address: ");
        label6.setBounds(20,200,150,20);
        JTextArea area5 = new JTextArea();
        area5.setBounds(180,200,200,20);
        area5.setBorder(BorderFactory.createBevelBorder(1));

        //creating label7 and text area6 for taking the first name of customer
        JLabel label7 = new JLabel("Enter your Permanent Address: ");
        label7.setBounds(20,230,150,20);
        JTextArea area6 = new JTextArea();
        area6.setBounds(180,230,200,20);
        area6.setBorder(BorderFactory.createBevelBorder(1));

        //creating label8 and text area7 for taking the first name of customer
        JLabel label8 = new JLabel("Enter your Mobile Number: ");
        label8.setBounds(20,260,150,20);
        JTextArea area7 = new JTextArea();
        area7.setBounds(180,260,100,20);
        area7.setBorder(BorderFactory.createBevelBorder(1));

        //creating fild of intrest
        JLabel lable9 = new JLabel("Enter about you or your fields of intrest: ");
        lable9.setBounds(20,290,250,20);
        JTextField fild = new JTextField();
        fild.setBounds(20,320,540,170);
        //fild.setBorder(BorderFactory.createEtchedBorder(1));

        //creating the button
        JButton button = new JButton("Submit");
        button.setBounds(250,510,100,30);

        button.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {

                                         try{

                                         String fname = area1.getText();
                                         String sname = area2.getText();
                                         String dob = area3.getText();
                                         int age = Integer.parseInt(area4.getText());
                                         String add1 = area5.getText();
                                         String add2 = area6.getText();
                                         String mobile = area7.getText();

                                             System.out.println(fname+" "+sname+"\n"+dob+"\n"+age+"\n"+add1+"\n"+add2+"\n"+mobile);

                                             File fileobj = new File("SwingBasicFormRecord.txt");

                                            try{
                                                //gives the file size
                                                System.out.println(fileobj.length());

                                                //asking it is the permission to write in the file
                                                System.out.println(fileobj.canRead());

                                                FileWriter writes = new FileWriter(fileobj,true);
                                                writes.write("Name: "+fname.concat(sname)+"\n");
                                                writes.write("Date of Birth: "+dob+"\n");
                                                writes.write("Age: "+age+"\n");
                                                writes.write("Local Address: "+add1+"\n");
                                                writes.write("Permanent Address: "+add2+"\n");
                                                writes.write("Mobile Number: "+mobile+"\n");
                                                writes.write("\n");
                                                writes.write("-------------------------------------------------------------------------------------------------\n\n");
                                                writes.close();

                                            }catch (IOException i)
                                            {
                                                i.printStackTrace();
                                                System.out.println("Some I/O exception is present");
                                            }

                                         }catch (Exception r)
                                         {
                                             System.out.println("Exception ouccre..");
                                             System.out.println("The Exception lines are: ");
                                             System.out.println("This exception is throwing because of you submit before all details fill.");
                                             r.printStackTrace();
                                         }

                                     }
                                 });

                //frame adds
                frame.add(lable1);

        frame.add(lable2);
        frame.add(area1);

        frame.add(lable3);
        frame.add(area2);

        frame.add(label4);
        frame.add(area3);

        frame.add(label5);
        frame.add(area4);

        frame.add(label6);
        frame.add(area5);

        frame.add(label7);
        frame.add(area6);

        frame.add(label8);
        frame.add(area7);

        frame.add(lable9);
        frame.add(fild);

        frame.add(button);

        //frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
