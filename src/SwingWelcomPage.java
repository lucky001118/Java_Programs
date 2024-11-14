import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingWelcomPage {
   public SwingWelcomPage()
   {
       JFrame frame = new JFrame("Welcome to my app");
       frame.setBounds(200,10,900,700);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
//       frame.setLayout(null);

       JLabel label1 = new JLabel("Welcome, How are your!");
       label1.setFont(new Font("New Times Roman",Font.ITALIC,30));
       frame.add(label1,BorderLayout.NORTH);
       label1.setHorizontalAlignment(SwingConstants.CENTER);

       JLabel labelFrameMassege = new JLabel();
       labelFrameMassege.setText("The Content will adds Soon");
       //labelFrameMassege.setSize(300,400);
       labelFrameMassege.setFont(new Font("New Times Roman",Font.PLAIN,30));
       frame.add(labelFrameMassege,BorderLayout.CENTER);
       labelFrameMassege.setHorizontalAlignment(SwingConstants.CENTER);



       //-------------***  Try  ***------------------------

       /*JLabel labelName1 = new JLabel("User Name: ");
       JLabel labelPass1 = new JLabel("Password: ");
       labelName1.setBounds(30,105,120,20);
       labelName1.setFont(new Font("arial",Font.BOLD,18));
       labelPass1.setBounds(30,155,120,20);
       labelPass1.setFont(new Font("arial",Font.BOLD,18));
       frame.add(labelName1);
       frame.add(labelPass1);

       JTextArea user1 = new JTextArea(1,1);
       user1.setBounds(165,100,150,30);
       user1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
       //user.setBackground(backgroundWndow2);
       user1.setEditable(true);
       JPasswordField pass1 = new JPasswordField();
       pass1.setBounds(165,150,150,30);
       pass1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
       //pass.setBackground();
       frame.add(user1);
       frame.add(pass1);

       JButton clear1 = new JButton("Clear");
       JButton login1 = new JButton("Log In");
       clear1.setBounds(165,200,70,20);
       login1.setBounds(245,200,70,20);
       frame.add(clear1);
       frame.add(login1);
*/

       //-------------***  Progress-Bar  ***------------------------
       JProgressBar progressBar = new JProgressBar(0,100);
       // progressBar.setBounds(100,100,400,40);
       progressBar.setFont( new Font("arial",Font.CENTER_BASELINE,30));
       progressBar.setOrientation(SwingConstants.HORIZONTAL);   //for this bar will showing us horizontally
       progressBar.setStringPainted(true);         //this will showing the progress percentaage
       progressBar.setBackground(Color.GREEN);
       frame.add(progressBar,BorderLayout.SOUTH);
      // progressBar.setValue(70);

       frame.setVisible(true);

       int i=0;
       while (i<=100) {
           progressBar.setValue(i);
           try {
               Thread.sleep(100);

           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println("The value of i is: " + i);
           if (i==50)
           {
               JOptionPane.showMessageDialog(frame,"It can take load on your system, Keep free space!","Warning!",JOptionPane.WARNING_MESSAGE);
           }
           if (i==90)
           {
               JOptionPane.showMessageDialog(frame,"Process is about to finish please do not close you pc!");
           }
           if(i==100)
           {
               progressBar.setVisible(false);
           }
           i= i+2;

       }

       ImageIcon image = new ImageIcon("C:\\Users\\manik\\Pictures\\login_page_character1.png");
       Color color = new Color(0,255,191,10);
       System.out.println(image.getIconHeight()+" and "+image.getIconWidth());
       frame.setIconImage(image.getImage());

       //-------------***  JWindows Contents  ***------------------------
       JWindow window = new JWindow();
       window.setSize(700,500);
       window.setLocationRelativeTo(null);
       window.setBackground(color);
       window.setVisible(false);

       JPanel panel = new JPanel();
       panel.setSize(window.getSize());
       panel.setBackground(color);
       Color borderColor = new Color(0,127,255);
       panel.setBorder(BorderFactory.createLineBorder(borderColor));
       window.add(panel, BorderLayout.CENTER);

       JLabel lable1 = new JLabel();
       lable1.setSize(image.getIconWidth(),image.getIconHeight());
       lable1.setIcon(image);
       panel.add(lable1,BorderLayout.CENTER);
       lable1.setHorizontalAlignment(SwingConstants.CENTER);

       try {
           Thread.sleep(300);
           window.setVisible(true);
          // Thread.sleep(300);

       } catch (InterruptedException e) {
          throw new RuntimeException(e);
       }
       //frame.setVisible(true);

       //-------------***  JWindows Contents-02  ***------------------------

       Color borderColor2 = new Color(131, 88, 147);
       Color backgroundWndow2 = new Color(0,255,128,80);
       JWindow window2 = new JWindow();
       window2.setSize(400,350);
       window2.setLocationRelativeTo(null);
       window2.setBackground(backgroundWndow2);
       window2.setVisible(false);

       JPanel panel2 = new JPanel();
       panel2.setSize(window2.getSize());
       panel2.setBackground(backgroundWndow2);
       panel2.setBorder(BorderFactory.createLineBorder(borderColor2));
       panel2.setLayout(null);
       window2.add(panel2, BorderLayout.CENTER);

       JLabel labelName = new JLabel("User Name: ");
       JLabel labelPass = new JLabel("Password: ");
       labelName.setBounds(30,105,120,20);
       labelName.setFont(new Font("arial",Font.BOLD,18));
       labelPass.setBounds(30,155,120,20);
       labelPass.setFont(new Font("arial",Font.BOLD,18));
       panel2.add(labelName);
       panel2.add(labelPass);

       JTextArea user = new JTextArea(1,1);
       user.setBounds(165,100,150,30);
       user.setBorder(BorderFactory.createLineBorder(Color.BLACK));
       user.setBackground(backgroundWndow2);
       user.setEditable(true);
       JPasswordField pass = new JPasswordField();
       pass.setBounds(165,150,150,30);
       pass.setBorder(BorderFactory.createLineBorder(Color.BLACK));
       pass.setBackground(backgroundWndow2);
       panel2.add(user);
       panel2.add(pass);

       JButton clear = new JButton("Clear");
       JButton login = new JButton("Log In");
       clear.setBounds(165,200,70,20);
       login.setBounds(245,200,70,20);
       panel2.add(clear);
       panel2.add(login);

       JButton labelForget = new JButton("Forget Password");
       labelForget.setForeground(Color.RED);
       labelForget.setBackground(new Color(0,255,128,0));
       labelForget.setBounds(280,240,100,20);
      labelForget.setBorder(null);
       panel2.add(labelForget);

       JLabel labelMassegeLogin = new JLabel("Login your Account!");
       labelMassegeLogin.setFont(new Font("arial",Font.ITALIC,14));
       labelMassegeLogin.setForeground(Color.WHITE);
       labelMassegeLogin.setBounds(125,50,150,20);
       panel2.add(labelMassegeLogin);

       try {
           Thread.sleep(3000);
           window2.setVisible(true);
           System.out.println("Reached!!!!!!!!");
           // Thread.sleep(300);

       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

       login.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(panel2,"Now it not build perfect.\n     Sorry we can not do login you!","Warning!",JOptionPane.WARNING_MESSAGE);

           }
       });
        /*
       //-------------***  trying to creating another frame ***------------------------

       JFrame frame2 = new JFrame();
       frame2.setBounds(300,200,window.getWidth(),window.getHeight());
       frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame2.setLayout(null);

       JLabel labelName1 = new JLabel("User Name: ");
       JLabel labelPass1 = new JLabel("Password: ");
       labelName1.setBounds(30,105,120,20);
       labelName1.setFont(new Font("arial",Font.BOLD,18));
       labelPass1.setBounds(30,155,120,20);
       labelPass1.setFont(new Font("arial",Font.BOLD,18));
       frame2.add(labelName1);
       frame2.add(labelPass1);

       JTextArea user1 = new JTextArea(1,1);
       user1.setBounds(165,100,150,30);
       user1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
       //user.setBackground(backgroundWndow2);
       user1.setEditable(true);
       JPasswordField pass1 = new JPasswordField();
       pass1.setBounds(165,150,150,30);
       pass1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
       //pass.setBackground();
       frame2.add(user1);
       frame2.add(pass1);

       JButton clear1 = new JButton("Clear");
       JButton login1 = new JButton("Log In");
       clear1.setBounds(165,200,70,20);
       login1.setBounds(245,200,70,20);
       frame2.add(clear1);
       frame2.setBackground(new Color(0,255,128));
       frame2.add(login1);
       frame2.setVisible(true);
       */

   }


    public static void main(String[] args) {
       new SwingWelcomPage();

    }
}
