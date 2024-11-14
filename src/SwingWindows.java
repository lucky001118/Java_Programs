import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SwingWindows {
    public static void main(String[] args) {
        SwingOpenJFrame sw = new SwingOpenJFrame();
        JFrame frame = new JFrame("Learning about how to open the a JWindow");
        frame.setBounds(20,10,1500,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Learning about JWindow");
        label.setFont(new Font("New Times Roman",Font.BOLD,25));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(label,BorderLayout.NORTH);

        JButton button = new JButton("Click-me to know about the show picture...");
        button.setFont( new Font("arial",Font.BOLD,27));
        button.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(button,BorderLayout.SOUTH);

        ImageIcon imageIcon1 = new ImageIcon("C:\\Users\\manik\\Downloads\\box7_image.jpg");
        JLabel label1 = new JLabel();
        label1.setSize(imageIcon1.getIconWidth(),imageIcon1.getIconHeight());
        label1.setIcon(imageIcon1);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(label1,BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JWindow window = new JWindow();
                window.setSize(400,300);
                window.setLocationRelativeTo(null);
                window.setVisible(true);

                JEditorPane editorPane = new JEditorPane();
                editorPane.setContentType("text/plain");
                editorPane.setText("An aircraft in straight-and-level unaccelerated flight has four forces acting on it. (In turning, diving, or climbing flight, additional forces come into play.) These forces are lift, an upward-acting force; drag, a retarding force of the resistance to lift and to the friction of the aircraft moving through the air; weight, the downward effect that gravity has on the aircraft; and thrust, the forward-acting force provided by the propulsion system (or, in the case of unpowered aircraft, by using gravity to translate altitude into speed). Drag and weight are elements inherent in any object, including an aircraft. Lift and thrust are artificially created elements devised to enable an aircraft to fly.");
               //editorPane.setText("Thanks");
                editorPane.setFont( new Font("New Times Roman",Font.ITALIC,17));

               Color color = new Color(245, 215, 115, (int) 0.5);
               window.setBackground(color);
               editorPane.setBackground(color);
                window.add(editorPane);

                editorPane.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                       if(e.getClickCount()==2)
                       {
                           window.dispose();    //closing the Jwindow if doubble ouccer
                           System.out.println("clicked");
                       }
                    }
                });   //-------->>>>> mouseClicked(MouseEvent e) is ended

            }
        });            //----------------->> ActionListener(new ActionListener() is ended

        frame.setVisible(true);

    }
}
