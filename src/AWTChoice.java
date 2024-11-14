import java.awt.*;
public class AWTChoice {
    static void choice()
    {
        Frame f1 = new Frame("Learning the AWT");
        f1.setBounds(200,200,500,500);

        Choice choice = new Choice();
        choice.add("Choice1");
        choice.add("Choice2");
        choice.add("Choice3");
        choice.add("Choice4");
        choice.add("Choice5");
        choice.add("Choice6");
        choice.add("Choice7");
        choice.add("Choice8");
        choice.add("Choice9");
        choice.add("Choice10");
        choice.add("Choice11");

        choice.setBounds(100,100,100,40);
        choice.setSize(40,40);

        System.out.println(choice.getSize());

       /*
        //List implementing
        List l1 = new List(5);

        // setting the position of list component
        l1.setBounds(100, 100, 75, 75);

        // adding list items into the list
        l1.add("Item 1");
        l1.add("Item 2");
        l1.add("Item 3");
        l1.add("Item 4");
        l1.add("Item 5");



        */
        f1.add(choice);
       // f1.add(l1);
        f1.setVisible(true);
    }
    public static void main(String[] args) {


        choice();
    }
}
