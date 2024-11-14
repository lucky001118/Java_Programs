import javax.swing.*;
import java.awt.*;

public class SwingPalneAndInternalfrme {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Learning about JPanel and JInternalFrame");
        frame.setBounds(400,150,1300,1100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();                 //making the panel /
        panel1.setBounds(100,100,400,300);
        panel1.setLayout(null);
        panel1.setBackground(Color.CYAN);

        JPanel panel2 = new JPanel();          //making the panel /
        panel2.setLayout(null);
        panel2.setSize(350,250);
        panel2.setBackground(Color.green);

        panel1.add(panel2); //adding panel into second panel
        frame.add(panel1);  //adding the panle into the frame

        //-------------------------------------------------------------------------------------------------

        JLabel lable1 = new JLabel("A JscrollPane is used to make scrollable view of a component. When screen size is limited");

        JInternalFrame internalFrame = new JInternalFrame("Internalframe-1",true,true,true,true); //Creeating the internal-frame
        internalFrame.setBounds(100,320,300,200);
        internalFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        internalFrame.setVisible(true);
        internalFrame.add(lable1);
        frame.add(internalFrame);

        JInternalFrame internalFrame2 = new JInternalFrame("Internalframe-1",true,true,true,true);  //Creeating the internal-frame
        internalFrame2.setBounds(0,0,250,100);
        internalFrame2.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        internalFrame2.setVisible(true);
        internalFrame2.add(lable1);
        frame.add(internalFrame2);

        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        //**************************************  CREATING THE EXPERIMENT  ***********************************************************

        /*int x=0,y=0;
        String arr[] = {"dsddd","SDDSddsf","sdsfsgss","sfgssf","SFfsfd","sfger","SSssaffgca","ADSGART","gsrdsgsd","sfgfddfsetg"};


        for(int i=0;i>=1000;)
        {
            JInternalFrame internalFrame3 = new JInternalFrame("Internalframe-1",true,true,true,true);  //Creeating the internal-frame
            internalFrame3.setBounds(x,y,250,100);
            internalFrame3.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            internalFrame3.setVisible(true);
            internalFrame3.add(lable1);
            frame.add(internalFrame3);
            i=i+100;
            x=x+20;
            y=y+20;

            try {
                Thread.sleep(100);
            }catch (Exception e){}
        }
*/

    }
}
