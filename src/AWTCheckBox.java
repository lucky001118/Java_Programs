import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AWTCheckBox
{
    public static void main(String[] args) {
        Frame f1 = new Frame("Learning the AWT");
        f1.setBounds(400,150,500,500);

        Checkbox c1 = new Checkbox("java");
        Checkbox c2 = new Checkbox("JavaScript");

        c1.setBounds(100,100,50,20);
        c2.setBounds(200,200,50,20);

        TextField tf = new TextField();
        tf.setBounds(300,300,100,30);

        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if ( c1.getState() == true)
                {
                    tf.setText("The FebrIOT LnguGE is Java");

                    if(c2.getState()==true){c2.setState(false);}

                }
            }
        });

        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if ( c2.getState() == true)
                {
                    tf.setText("The FebrIOT LnguGE is JavaScript");
                    if(c1.getState()==true){c1.setState(false);}
                }
            }
        });

        f1.add(c1);
        f1.add(c2);
        f1.add(tf);

        System.out.println(f1.getLayout());
        f1.setVisible(true);

    }
}
