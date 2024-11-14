import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingToggleButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Learning about the Toggle");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        Color getdefaultColor = frame.getBackground();



        JToggleButton toggleButton = new JToggleButton("OFF");  //because in the initial toggle button is off state
        frame.add(toggleButton,BorderLayout.CENTER);

        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(toggleButton.isSelected()) {
                    frame.setBackground(Color.green);
                    toggleButton.setText("ON");
                }
                else
                {
                    frame.setBackground(getdefaultColor);
                    toggleButton.setText("OFF");
                }

            }
        });

    }
}
