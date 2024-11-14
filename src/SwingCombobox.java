import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCombobox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combo-Box");
        frame.setBounds(100,100,400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String comboboxValue [] = {"India","Pakistan","Nepal","Bhutan","Shri-lanka","Bangladesh"};
        JComboBox comboBox = new JComboBox<>(comboboxValue);
        comboBox.setBounds(30,50,150,30);
        frame.add(comboBox);

        JTextArea area = new JTextArea();
        area.setBounds(210,50,170,30);
        area.setFont(new Font("arial",Font.TRUETYPE_FONT,16));
        frame.add(area);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = "The selected contry is: "+comboBox.getItemAt(comboBox.getSelectedIndex());
                System.out.println(value);
                area.setText("You Selected: "+comboBox.getItemAt(comboBox.getSelectedIndex()));
            }
        });


        frame.setLayout(null);
        frame.setVisible(true);

    }
}
