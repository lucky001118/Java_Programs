import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AWTCheckBoxGroup
{
    public static void main(String[] args) {
        Frame f1 = new Frame("Learning the AWT");
        f1.setBounds(400,150,500,500);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("C++",cbg,false);
        Checkbox cb2 = new Checkbox("C",cbg,false);

        TextField tf = new TextField();
        tf.setBounds(100,300,200,30);

        cb1.setBounds(100,100,50,30);
        cb2.setBounds(100,150,50,30);

       Label l1 = new Label("Which Language you want to learn?: ");
       l1.setBounds(60,80,150,30);


        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(cb1.getState()==true)
                    tf.setText("I want to learn C++");
            }
        });

        cb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
             if(cb2.getState()==true)
                   tf.setText("I want to learn C");
            }
        });

        f1.add(cb1);
        f1.add(cb2);
        f1.add(tf);
       f1.add(l1);

        f1.setVisible(true);

    }
}
