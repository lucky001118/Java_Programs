import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SwingProgressBar {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Progressbar");
        frame.setBounds(400,150,600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JProgressBar progressBar = new JProgressBar(0,100);
        progressBar.setBounds(100,100,400,40);
        progressBar.setFont( new Font("arial",Font.CENTER_BASELINE,30));
        progressBar.setOrientation(SwingConstants.HORIZONTAL);   //for this bar will showing us horizontally
        progressBar.setStringPainted(true);         //this will showing the progress percentaage
        frame.add(progressBar);

        frame.setLayout(null);
        frame.setVisible(true);  //If we add the frame.setVisible(true); in the last then Thread.spleed will sleep it and showing it after finishing the loop

        int i=0;
        while (i<=100)
        {
            progressBar.setValue(i);
            System.out.println("The value of i is: "+i);

            if(i>=40 && i<=60)
            {
                progressBar.setString("Processing...");    //This will setting string in the progressbar
                progressBar.setBorder(BorderFactory.createRaisedBevelBorder());
                progressBar.setBackground(Color.PINK);
                try {
                    Thread.sleep(1000);

                }catch (Exception e){
                    //System.out.println(e);
                }
            }
            else if(i>=61 && i<80)
            {
                progressBar.setString("Some Error detected..");         //This will setting string in the progressbar
                progressBar.setBackground(Color.RED);
                try {
                    Thread.sleep(1100);

                }catch (Exception e){
                    //System.out.println(e);
                }
            }
            else if (i>=81 && i<=100)
            {
                progressBar.setString("About to finishing..");       //This will setting string in the progressbar
                progressBar.setBackground(Color.green);

                if(i==100)
                {
                    progressBar.setValue(i);
                    progressBar.setString(null);
                }

                try {
                    Thread.sleep(1100);

                }catch (Exception e){
                    //System.out.println(e);
                }
            }

            try {
                Thread.sleep(100);

            }catch (Exception e){
                //System.out.println(e);
            }

            i=i+2;
        }



    }
}
