import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SwingSpinnerAndSlider {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Learning about JSpinner and JSlider");
        frame.setBounds(20,10,800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        SpinnerModel spinnerModel = new SpinnerNumberModel(1,-10,100,1);
        JSpinner spinner = new JSpinner(spinnerModel);
        spinner.setBounds(100,100,50,30);
        frame.add(spinner);

        JTextArea area = new JTextArea();
        area.setBounds(10,10,200,30);
        area.setFont( new Font("arial",Font.BOLD,17));
        frame.add(area);

        //listning the spinner produced event listner
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println(spinner.getValue());
                area.setText("The value is: "+spinner.getValue());
            }
        });

        //------------------------------------------------------------------------------------------------------------------------

        JSeparator separator = new JSeparator();
        separator.setVisible(true);
        separator.setBounds(0,200,800,5);
        frame.add(separator);

        JSlider slider = new JSlider();
        slider.setBounds(100,220,400,15);
        frame.add(slider);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(2);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        /*JPanel panel=new JPanel();
        panel.add(slider);
        frame.add(panel);
        frame.pack();*/
        frame.add(slider);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                area.setText("Value of the slider is: "+slider.getValue());
            }
        });





        frame.setLayout(null);
        frame.setVisible(true);


    }
}
