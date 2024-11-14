import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDiailog {
    JFrame frame;
    JDialog dialog1;
   // JButton button2;
    private void firstAction()
    {
        JDialog dialog1 = new JDialog(frame,"Dialog-box-1");  //Here i'm giving the refrence to frame so i wanat to add this in the frame
        dialog1.setSize(300,300);
        dialog1.setLocation(500,300);
        dialog1.setVisible(true);
        JLabel lable1 =new JLabel("Thia is the new LAble");
        lable1.setBounds(10,10,200,30);

        JButton button2 = new JButton("c-2");
        button2.setBounds(100,150,100,30);

        dialog1.add(button2);
        dialog1.add(lable1);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {  //here we will handling the second dialog-box buttons event
                secondAction();
            }
        });
    }
    private void secondAction()
    {
        JDialog dialog2 = new JDialog(dialog1,"Dialog-box-2, As the supper-dialog-box");  //Here i'm giving the refrence to dialog1 so i wanat to add this in the dialog1
        dialog2.setBounds(200,300,200,100);
        dialog2.setVisible(true);
        JLabel lable1 =new JLabel("Thia is the new LAble");
        lable1.setBounds(10,10,200,30);
        dialog2.add(lable1);

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Learning about JDesktoPane");
        frame.setBounds(20,10,800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("click-1");
        button.setBounds(200,200,100,30);
        frame.add(button);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              SwingDiailog sw = new SwingDiailog();
              if(e.getActionCommand().equals("click-1")){   //e.getActionCommand().equals("click-1") --->>> setting the actionlistner if this value is occured.
                  sw.firstAction();
              }
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
