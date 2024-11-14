import java.util.LinkedList;
public class CollecotionFremworkLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedlist1 = new LinkedList<>();
        LinkedList<String> linkedlist2 = new LinkedList<>();

        linkedlist1.add(726);
       // linkedlist1.set(1,607);
        linkedlist1.add(839);

        linkedlist1.addFirst(736354);
        linkedlist1.addLast(7865784);

        System.out.println(linkedlist1);
        System.out.println(linkedlist1.contains(726));
        System.out.println(linkedlist1.contains(367));

        linkedlist1.add(3,434);
        System.out.println(linkedlist1);

        linkedlist1.set(2,101); //changes element present at 2nd index (33 changed to 10)
        System.out.println(linkedlist1);

        System.out.println(linkedlist1.indexOf(726));
        System.out.println(linkedlist1.lastIndexOf(7865784));

        linkedlist1.offerFirst(876);
        linkedlist1.offerLast(367);
        linkedlist1.offer(87);

        System.out.println(linkedlist1);

        System.out.println(linkedlist1.peek());
        System.out.println(linkedlist1.peekFirst());
        System.out.println(linkedlist1.peekFirst());
        System.out.println();

        System.out.println(linkedlist1.pollFirst());
        System.out.println(linkedlist1.pollLast());
        System.out.println();

        linkedlist1.push(873);
        linkedlist1.push(386);
        linkedlist1.push(39788);
        System.out.println(linkedlist1);
        System.out.println(linkedlist1.peekFirst());
        System.out.println(linkedlist1.peekLast());
        System.out.println(linkedlist1.peek());

    }
}
