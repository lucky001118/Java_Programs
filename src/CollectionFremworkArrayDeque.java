import java.util.ArrayDeque;
public class CollectionFremworkArrayDeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> dequu1 = new ArrayDeque<>();
        dequu1.add(89);
        dequu1.add(80);
        dequu1.add(893);
        dequu1.add(39);
        dequu1.add(859);
        dequu1.add(45);
        dequu1.add(83);
        dequu1.add(345);
        dequu1.add(445);
        dequu1.add(893);
        dequu1.add(8455);
        System.out.println(dequu1);

        dequu1.offerFirst(37487);  //inserting at the first position of queue
        dequu1.offerLast(87364);  //inserting value at the last position of the queue
        dequu1.offer(78);   //inserting the element at the end of the deque

        System.out.println(dequu1);

        dequu1.push(7286388);  //push the value in queue at the rear
        System.out.println("After push: "+dequu1);
        dequu1.pop();  //pop the element at head position
        System.out.println("After pop: "+dequu1);

        dequu1.removeFirst();     //removes element at the first position
        dequu1.removeLast();   //removes element at the last position
        System.out.println(dequu1);

        System.out.println(dequu1.peek());  //tells the value of the  head of the queue represented by this deque
        System.out.println(dequu1.iterator());  //Returns an iterator over the elements in this deque.


    }
}
