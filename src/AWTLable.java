import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTLable {
    public static void main(String[] args)
    {

        Frame f1 = new Frame("Learning the AWT");
        f1.setBounds(400,150,500,500);

        Label l1,l2;

        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();

         l1 = new Label("FirstName: ");
         l2 = new Label("LastName: ");

         Button b1 = new Button("Marge");

         l1.setBounds(50,50,60,30);
         l2.setBounds(50,110,60,30);

         tf1.setBounds( 200,50,100,30);
         tf2.setBounds(200,110,100,30);
         tf3.setBounds(150,430,200,30);

         b1.setBounds(220,350,60,30);

         b1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String firstN=tf1.getText();
                 String secondN=tf2.getText();
                 String full =firstN.concat(secondN);
                 tf3.setText(full);

             }
         });
         b1.setBackground(Color.PINK);

         f1.add(l1);
         f1.add(l2);

         f1.add(tf1);
         f1.add(tf2);
         f1.add(tf3);

         f1.add(b1);

         f1.setVisible(true);



    }
}
