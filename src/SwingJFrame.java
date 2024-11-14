import javax.swing.JFrame;
import java.awt.*;

public class SwingJFrame extends JFrame
{
   public SwingJFrame()
   {
       //By the extending the JFrame Class and creating constracture
       setSize(400,500);
       setBackground(Color.DARK_GRAY);
       //setBackground(Color.cyan);
       setTitle("This is my first JFrame");
       setVisible(true);
   }

    public static void main(String[] args) {
         SwingJFrame swf =new SwingJFrame();

         //By the object
        swf.setSize(700,400);
       // swf.setBackground(Color.DARK_GRAY);
        swf.setBackground(Color.cyan);
        swf.setTitle("This is my first JFrame");
        swf.setVisible(true);

    }
}
