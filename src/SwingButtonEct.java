import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class SwingButtonEct {
    public static void main(String[] args) {
        JFrame frame = new JFrame("This is the practical frame");


        JButton button = new JButton("Click me");
        button.setBounds(300,80,100,20);
        button.setBorder(BorderFactory.createCompoundBorder());

        JLabel label = new JLabel("This is the button1: ");
        label.setBounds(10,80,150,20);

        Font font = new Font("Arial",Font.PLAIN,30);
        label.setForeground(Color.MAGENTA);
        label.setFont(font);

        JTextArea area = new JTextArea();
        area.setBounds(170,80,120,20);
        area.setBorder(BorderFactory.createLineBorder(Color.blue));
        area.setAlignmentX(10);
        area.setAlignmentY(20);

        button.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText("Setting text after clicking..");
                label.setBackground(Color.CYAN);

            }
        });
        System.out.println(button.getBounds());
        System.out.println(button.getBorder());

        frame.add(button);
        frame.add(label);
        frame.add(area);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600,200,500,550);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
