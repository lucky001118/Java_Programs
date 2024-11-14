import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SwingCheckboxRadio {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox and Radio button");
        frame.setBounds(100,100,550,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JCheckBox check1 = new JCheckBox("Reading book");
        check1.setBounds(50,50,200,20);
        check1.setEnabled(false);  //this will setting the checkbox disenabled

        JCheckBox check2 = new JCheckBox("Writting the book");
        check2.setBounds(50,80,200,20);
        check2.setSelected(true);  //This will make sure that the checkbox has checked allready

        check2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(check2.getText());
            }
        });

        JCheckBox check3= new JCheckBox("Both");
        check3.setBounds(50,110,200,20);
        check3.setCursor( new Cursor(Cursor.HAND_CURSOR)); //making thee cursor ponted

        check3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String value = check3.getText();
                System.out.println(value);
                System.out.println(check3.getSelectedIcon());
                if (check3.isSelected()==true)
                {
                    System.out.println("Got selected 'both' ");
                    check2.setSelected(false);
                }
                else
                {
                    check2.setSelected(true);
                    System.out.println("Not selected 'both' ");
                }
            }
        });



        frame.add(check1);
        frame.add(check2);
        frame.add(check3);



        //--------------------------------------------------------------------------------------------------------------------

        JRadioButton radio = new JRadioButton("Male");
        radio. setBounds(50,140,100,30);
        frame.add(radio);

        JRadioButton radio0 = new JRadioButton("Male2");
        radio0.setBounds(50,180,100,30);
        frame.add(radio0);

        ButtonGroup buttonGroup = new ButtonGroup();   //making option choose able only one can selected of two
        buttonGroup.add(radio);
        buttonGroup.add(radio0);
        radio.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (radio.isSelected()==true)
                {
                    System.out.println("Radio Male is selected.\n Female is unselected");
                }
                else
                {
                    System.out.println("radio male is not selected..");
                }
            }
        });

        //radio1.setSelected(true);  //preselected
        JRadioButton radio1 = new JRadioButton("Male2");
        radio1.setBounds(50,220,100,30);
        radio1.setSelected(true);  //preselected
        radio1.setEnabled(false);  //it will not provided us to edit it
        frame.add(radio1);





        frame.setLayout(null);
        frame.setVisible(true);
    }
}
