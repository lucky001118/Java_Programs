import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class AWTScrollBAr {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(500,100,600,600);

        TextField fild = new TextField("First");
        fild.setBounds(180,200,100,30);

        Label l = new Label("This is the lsble: ");
        l.setBounds(50,200,100,30);

        TextField area = new TextField("null");
        area.setBounds(400,400,50,20);


        Scrollbar sc = new Scrollbar();
        sc.setBounds(550,50,10,500);

        sc.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                area.setText("The: "+sc.getValue());
            }
        });


       // sc.setSize(20,500);


        f.add(l);

       // f.add(fild);
        f.add(area);
        f.add(sc);

        f.setVisible(true);
        f.setLayout(null);
    }
}
