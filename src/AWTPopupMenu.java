import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;

public class AWTPopupMenu {
    public static void main(String[] args) {

        Frame fe = new Frame("The popup menus");

        PopupMenu popupMenu = new PopupMenu("Edit");
        MenuItem cut = new MenuItem("Cut");
        cut.setActionCommand("cut");
        MenuItem copy = new MenuItem("Copy");
        copy.setActionCommand("Copy");
        MenuItem past = new MenuItem("Past");
        past.setActionCommand("Past");

        fe.addMouseListener(new MouseListener() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    popupMenu.show(fe , e.getX(), e.getY());

                                }

                                //Not need yet

                                @Override
                                public void mousePressed(MouseEvent e) {

                                }

                                @Override
                                public void mouseReleased(MouseEvent e) {

                                }

                                @Override
                                public void mouseEntered(MouseEvent e) {

                                }

                                @Override
                                public void mouseExited(MouseEvent e) {

                                }

                            });

        fe.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);
                popupMenu.show(fe , e.getX(), e.getY());
            }
        });

                popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(past);

        fe.setSize(200,300);
        fe.setBounds(600,440,200,200);
        fe.add(popupMenu);

        fe.setVisible(true);

    }
}
