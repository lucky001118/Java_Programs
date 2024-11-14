import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJToolBar {
    JToolBar toolBar = new JToolBar();
    JButton button1= new JButton("button1");
    JButton button2= new JButton("button2");
    JTextArea area = new JTextArea();
    JComboBox comboBox = new JComboBox( new String []{"item1","item2","item3","item-4","item-5"});

    public  SwingJToolBar()
    {
        JFrame frame = new JFrame("Learning about JTree ");
        frame.setBounds(200,10,600,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        area.setFont(new Font("arial",Font.BOLD,15));

        toolBar.add(comboBox);
        toolBar.add(area);
        toolBar.add(button1);
        toolBar.add(button2);

        frame.add(toolBar, BorderLayout.NORTH);

        frame.setVisible(true);
        frame.revalidate();

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(comboBox.getSelectedItem());
                int index = comboBox.getSelectedIndex();
                String selectedItem = comboBox.getSelectedItem().toString();

                System.out.println("The selected item is: "+selectedItem+" and corressponding index is: "+index);

                area.setText("The selected item is: "+selectedItem+" and index is: "+index);

            }
        });
    }

    public static void main(String[] args) {
        new SwingJToolBar();
    }
}
