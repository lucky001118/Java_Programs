import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.color.*;

public class SwingColorChooser {
    public  SwingColorChooser()
    {
        JFrame frame = new JFrame("Learning about JFileChooser");
        frame.setBounds(200,10,600,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("learning about the JColorChooser...");
        //label.setBounds(50,50,300,30);
        label.setFont(new Font("arial",Font.BOLD,30));
        frame.add(label,BorderLayout.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton button = new JButton("Color-Chooser");
        //button.setBounds(100,100,100,30);
        frame.add(button,BorderLayout.SOUTH);
        button.setBackground(Color.green);

        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Choosing the color from Color chooser and filling that color in the variable color which data-type is Color
                Color color = JColorChooser.showDialog(null,"Select Color", Color.BLACK); //opening the color chooser
                button.setBackground(color);
            }
        });

        frame.revalidate();
    }
    public static void main(String[] args) {
        new SwingColorChooser();

    }
}
