import javax.swing.*;
import java.awt.*;

public class SwingMenu {
    public static void main(String[] args) {
        //Creating the frame
        JFrame frame = new JFrame("Menu-bar");
        frame.setBounds(400,150,600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JMenuItem i1,i2,i3,i4,i5,i6,i7;

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
       i1 = new JMenuItem("Copy");
       i2 = new JMenuItem("Past");
       i3 = new JMenuItem("Cut");
       i4= new JMenuItem("Save");
       i5 = new JMenuItem("Save as");
       i6 = new JMenuItem("Open");
       i7 = new JMenuItem("New");
       JMenu submenu = new JMenu("Edit");
       submenu.add(i1);
       submenu.add(i2);
       submenu.add(i3);

       menu.add(submenu);
       menu.add(i4);
       menu.add(i5);
       menu.add(i6);
       menu.add(i7);
       menuBar.add(menu);

       JMenu subsubmenu = new JMenu("Insert");
       JMenuItem ii1,ii2,ii3;
       ii1 = new JMenuItem("Shapes");
       ii2 = new JMenuItem("Images");
       ii3 = new JMenuItem("Table");
       subsubmenu.add(ii1); subsubmenu.add(ii2); subsubmenu.add(ii3);
       menuBar.add(subsubmenu);
       frame.setJMenuBar(menuBar);

       menuBar.setCursor( new Cursor(Cursor.HAND_CURSOR));

       JTextField fild = new JTextField();
      //fild.setSize(540,580);
       frame.add(fild);
       fild.setBounds(5,3,570,560);
       fild.setLayout(null);
       fild.setEnabled(true);
       fild.setEditable(true);
       fild.setDragEnabled(true);


        frame.setLayout(null);
        frame.setVisible(true);
    }
}
