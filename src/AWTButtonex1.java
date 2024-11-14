import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTButtonex1
{
    public static void main(String[] args) {
        Frame f1 = new Frame("botton learning");
       // f1.setSize(500,500);
        //the setSize is only setting the size of oject but the setBound is setting size and Loction in screen to display also
        f1.setBounds(400,150,500,500);

         Button b1 = new Button("start");
         b1.setBounds(60,440,60,30);

         Button b2 = new Button("Erase");
         b2.setBounds(400,440,60,30);

         Button b3 = new Button("Color");
         b3.setBounds(220,440,60,30);

         TextArea t1 = new TextArea("this is the text area");
         //t1.setSize(100,100);
         t1.setBounds(40,50,420,300);

         //addding the listener in button 1
         b1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

                 f1.setBackground(Color.red);
                 t1.setText("Clicked button this is adding new one");
                 t1.setBackground(Color.BLUE);

                 System.out.println(b1.getDropTarget());
                 System.out.println(t1.getBounds());
                 System.out.println(b1.getSize());

             }
         });

         //Adding the listener in button 2
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText(null);
            }
        });

        //Adding the Event listener in button 3
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setBackground(Color.CYAN);
                f1.setBackground(Color.PINK);
            }
        });

         f1.add(b1);
         f1.add(t1);
         f1.add(b2);
         f1.add(b3);
         //f1.add(f1.setBackground());
         f1.setLayout(null);
         f1.setVisible(true);

    }
}
