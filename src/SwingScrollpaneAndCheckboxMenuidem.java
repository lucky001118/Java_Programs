import javax.swing.*;
import java.awt.*;

public class SwingScrollpaneAndCheckboxMenuidem {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Learning about JScrollPane and JCheckboxMenuItem");
        frame.setBounds(400,150,600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem menuItem1 = new JMenuItem("Copy");
        JMenuItem menuItem2 = new JMenuItem("Past");
        JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("Word Rapping");  //making the checkbox menu-item
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(checkBoxMenuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        JTextArea textArea = new JTextArea(10,15);
        textArea.setBounds(10,0,400,400);
        textArea.setDragEnabled(true);
       textArea.setEnabled(true);
       textArea.setEditable(true);frame.add(textArea);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.getContentPane().add(scrollPane);
        // frame.setLayout(null);
        frame.setVisible(true);
    }
}
