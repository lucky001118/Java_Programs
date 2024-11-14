import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SwingPoppopmenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Poppop-Menu");
        frame.setBounds(400,150,600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPopupMenu popupMenu = new JPopupMenu("Popupmenu");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        popupMenu.add(cut); popupMenu.add(copy); popupMenu.add(paste);
        frame.add(popupMenu);


        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              popupMenu.show(frame,e.getX(),e.getY());
                System.out.println(popupMenu.getComponentIndex(popupMenu.getComponent()));
                System.out.println(popupMenu.getInvoker());

                cut.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Cutting the text..");
                    }
                });

                copy.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Doing the Past");
                    }
                });

                copy.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Coping the text.");
                    }

                });
            }
        });



        frame.setLayout(null);
        frame.setVisible(true);
    }
}
