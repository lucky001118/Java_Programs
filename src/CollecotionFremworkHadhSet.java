import java.util.HashSet;
public class CollecotionFremworkHadhSet
{
    public static void main(String[] args)
    {
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(345);
        h1.add(3475);
        h1.add(4443);
        h1.add(23);
        h1.add(526267);
        System.out.println(h1);

        System.out.println(h1.contains(23));
        System.out.println(h1.size());
        h1.remove(23);
        System.out.println(h1);

        System.out.println(h1.isEmpty());
        h1.clear();
        System.out.println(h1.isEmpty());

    }
}
