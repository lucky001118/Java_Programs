import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEditorPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Learning about the Editor-Pane");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JEditorPane editorPane = new JEditorPane();
        //applig the simple text int the Editor-Pane

        /*editorPane.setContentType("text/plain");
        editorPane.setText("Women activists in Manipur are deliberately blocking routes and interfering in the operations of security forces, the Indian Army tweeted on Monday evening in what was the first official confirmation of a rising new phenomenon in the violence-hit northeastern state.");
        editorPane.setText("Non-communicable diseases like diabetes are on the rise in India and it is linked to several illnesses where the diagnosis of diabetes invariably raises concerns about long-term health complications involving various body organs and the kidney is one of the most susceptible yet disregarded ones.");
        */

        //appling the html text in the Editor-pane
        editorPane.setContentType("text/html");
        editorPane.setText("<html>"+
     "<head>"+
   " </head>"+
  "<body>"+
     " <h2> Use of line break with pragraph tag</h2>"+
          "<p><br>Papa and mama, and baby and Dot,  \n" +
                "     <br>Willie and me?the whole of the lot\n" +
                "                <br>Of us all went over in Bimberlie's sleigh,  \n" +
                "                <br>To grandmama's house on Christmas day.  \n" +
                "                </p> " +
   "</body>"+
   "</html>)");

        frame.add(editorPane, BorderLayout.CENTER);
        JButton button = new JButton("Click-me");
        frame.add(button,BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(editorPane.getText());
            }
        });



    }
}
