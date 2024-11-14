import java.awt.*;

public class AWTMenus {
    public static void main(String[] args) {
        Frame frame = new Frame("here we learn with the manubar");

        MenuBar menubar = new MenuBar();
        Menu menu = new Menu("The Menu");
        MenuItem item1 = new MenuItem("Item1");
        MenuItem item2 = new MenuItem("Item2");
        MenuItem item3 = new MenuItem("Item3");
        Menu item4 = new Menu("Item4");
        MenuItem item41 = new MenuItem("Item4,1");
        MenuItem item42 = new MenuItem("Item4,2");
        MenuItem item5 = new MenuItem("Item5");

        menubar.add(menu);
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);

        item4.add(item41);
        item4.add(item42);

        menu.add(item5);

        frame.setMenuBar(menubar);

        frame.setSize(400,600);
        frame.setVisible(true);
    }
}
