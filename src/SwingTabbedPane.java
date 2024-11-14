import javax.swing.*;
import java.awt.*;

public class SwingTabbedPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Learning about JPanel and JInternalFrame");
        frame.setBounds(20,10,1500,900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(300,150,440,400);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        JPanel pane2 = new JPanel();
        pane2.setBackground(Color.green);
        JPanel pane3 = new JPanel();
        pane3.setBackground(Color.RED);

        panel.add(new JLabel("This is panel-1"));
        pane2.add(new JLabel("This is panel-2"));
        pane3.add(new JLabel("This is panel-3"));

        tabbedPane.add("first",panel);
        tabbedPane.add("Second",pane2);
        tabbedPane.add("third",pane3);

        frame.add(tabbedPane);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
