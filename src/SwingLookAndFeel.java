import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import  javax.swing.plaf.metal.MetalLookAndFeel;

public class SwingLookAndFeel {
    public SwingLookAndFeel()
    {
        JFrame frame = new JFrame("Learning about Look and Feel");
        frame.setBounds(200,300,350,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label1 = new JLabel("User Name: ");
        JLabel label2 = new JLabel("Password: ");
        label1.setBounds(30,50,70,20);
        label2.setBounds(30,100,70,20);
        frame.add(label1);
        frame.add(label2);

        JTextArea user = new JTextArea();
        user.setBounds(120,50,150,30);
        JPasswordField pass = new JPasswordField();
        pass.setBounds(120,100,150,30);
        frame.add(user);
        frame.add(pass);

        JButton clear = new JButton("Clear");
        JButton login = new JButton("Log In");
        clear.setBounds(120,150,70,20);
        login.setBounds(200,150,70,20);
        frame.add(clear);
        frame.add(login);

        String str = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        String str2 = "com.jtattoo.plaf.texture.TextureLookAndFeel";
        try {
            //String NimbusLookAndFeel;
            UIManager.setLookAndFeel(str2);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new SwingLookAndFeel();
    }
}
