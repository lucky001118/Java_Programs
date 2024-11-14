import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SwingOptionPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,40,500,900);


       JOptionPane.showMessageDialog(frame,"Hello MINI");  //It will show the mini option pane

        JOptionPane.showMessageDialog(frame,"Need to Update!","Warning!",JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(frame,"Are you sure ? It can produce an ERROR!","Error!",JOptionPane.ERROR_MESSAGE);

        JOptionPane.showInputDialog(frame,"Enter Processor name: ");

        int a=JOptionPane.showConfirmDialog(frame,"Are you sure?");
        if(a==JOptionPane.YES_OPTION){
            System.out.println(JOptionPane.INFORMATION_MESSAGE);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
