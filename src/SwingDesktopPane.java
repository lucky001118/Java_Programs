import javax.swing.*;

public class SwingDesktopPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Learning about JDesktoPane");
        frame.setBounds(20,10,800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBounds(10,10,780,780);

        JInternalFrame internalFrame = new JInternalFrame("Internalframe-1",true,true,true,true); //Creeating the internal-frame
        internalFrame.setBounds(100,320,300,200);
        internalFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        internalFrame.setVisible(true);

        JInternalFrame internalFrame2 = new JInternalFrame("Internalframe-1",true,true,true,true);  //Creeating the internal-frame
        internalFrame2.setBounds(0,0,250,100);
        internalFrame2.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        internalFrame2.setVisible(true);

        JInternalFrame internalFrame3 = new JInternalFrame("Internalframe-1",true,true,true,true);  //Creeating the internal-frame
        internalFrame3.setBounds(50,30,250,100);
        internalFrame3.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        internalFrame3.setVisible(true);

        JInternalFrame internalFrame4 = new JInternalFrame("Internalframe-1",true,true,true,true);  //Creeating the internal-frame
        internalFrame4.setBounds(100,60,250,100);
        internalFrame4.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        internalFrame4.setVisible(true);

        JInternalFrame internalFrame5 = new JInternalFrame("Internalframe-1",true,true,true,true);  //Creeating the internal-frame
        internalFrame5.setBounds(150,90,250,100);
        internalFrame5.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        internalFrame5.setVisible(true);

        JInternalFrame internalFrame6 = new JInternalFrame("Internalframe-1",true,true,true,true);  //Creeating the internal-frame
        internalFrame6.setBounds(200,120,250,100);
        internalFrame6.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        internalFrame6.setVisible(true);


        desktopPane.add(internalFrame);
        desktopPane.add(internalFrame2);
        desktopPane.add(internalFrame3);
        desktopPane.add(internalFrame4);
        desktopPane.add(internalFrame5);
        desktopPane.add(internalFrame6);
        frame.add(desktopPane);

        frame.setLayout(null );
        frame.setVisible(true);
    }
}
