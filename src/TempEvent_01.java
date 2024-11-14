import javax.swing.*;
import java.awt.event.ActionListener;

public class TempEvent_01 {
    public static void main(String[] args) {
        JFrame f = new JFrame("This is the temp example ");
        f.setSize(600,450);
        JButton b1 = new JButton("click me");
        b1.setBounds(40,50,35,34);

        JTextArea t1 = new JTextArea();
        t1.setSize(50,40);
        b1.addActionListener(e -> t1.setText(" jadu dekho"));

        f.add(b1);
        f.add(t1);
        f.setVisible(true);
    }
}
