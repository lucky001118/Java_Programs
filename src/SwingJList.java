import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SwingJList {
    public SwingJList()
    {
        JFrame frame = new JFrame("Learning about JTree ");
        frame.setBounds(200,10,600,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        String item [] = {"item-1","item-2","item-3","item-4","item-5","item-6","item-7","item-8","item-9","item-10"};
        JList list = new JList(item);
        list.setVisibleRowCount(5);

        JLabel label = new JLabel("lable");
        label.setSize(300,50);

        JPanel panel1 = new JPanel();
        frame.add(panel1);
        panel1.add(new JScrollPane(list));
        panel1.add(label);

        frame.revalidate();
        frame.setVisible(true);

        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount()==2)
                {
                    int index = list.getSelectedIndex();
                    String selectedItem = list.getSelectedValue().toString();
                    label.setText("The selected item is: "+selectedItem+" and index is: "+index);

                    System.out.println("The selected item is: "+selectedItem+" and corressponding index is: "+index);
                }
            }
        });
    }
    public static void main(String[] args) {
        new SwingJList();
    }
}
