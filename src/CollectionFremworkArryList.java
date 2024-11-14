import java.util.ArrayList;
public class CollectionFremworkArryList
{
    public static void main(String[] args)
    {
        //Creating the object of ArryList initial capacity is 10
        ArrayList<Integer> array1 = new ArrayList<>();
        //another object of arrayList that has constructor argument it sets the capacity cusiomized
        ArrayList<Integer> array2=new ArrayList<>(15);
        int i=0;

        //making the array with the String
        ArrayList<String> arraystr = new ArrayList<>();
       int marks [];
       marks = new int[60];
       array1.add(62);
       array1.add(276738);
       //adding value with in index
        array1.add(2,78);

        System.out.println(array1.get(0));
        System.out.println(array1.get(1));
        System.out.println(array1.get(2));
        System.out.println("The all value of Array is: "+array1);
      //  System.out.println(array1.get(4));


        //using String Array
        arraystr.add("This is the first value");
        arraystr.add("this is the second value");
        System.out.println(arraystr.get(0));

       /* try {
            System.out.println(arraystr.get(7));

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("This can giv Exception");
        }

        */
        System.out.println(arraystr.get(1));
        System.out.println("The all value of Array is: "+arraystr);

        //int arr[] ={ 2,23,23,21,37,373,37,8,36,83,37,36,376,3,376,37};
        array2.addAll(array1);
        array2.add(66);
        array2.add(66);
        array2.add(66);
        array2.add(66);
        array2.add(66);
        array2.add(66);
        array2.add(66);
        array2.add(66);
        array2.add(66);
        array2.add(66);

        System.out.println();

        for (i=0;i<10;i++)
        {
            System.out.println(array2.get(i));

        }
        System.out.println("The all Array of array2 is: "+array2);
        //chacking the value's index in the array
        int index = array2.lastIndexOf(66);
        System.out.println(index);
        int index1=array2.indexOf(78);  //gives the index number of giving value
        System.out.println(index1);
        array2.remove(7);  //remove the 7th index value
        array2.remove(0);
        array2.remove(1);
        System.out.println(array2);
        System.out.println(array2.subList(2,7));  //givig subArray

        boolean re;
        re=array2.contains(66);   //checking the given value is on the array or not is present the returns the true or not then false
        if(re==true)
        {
            System.out.println("The array.contains is in the array");
        }
        else {
            System.out.println("Not coantenig");
        }
        array2.clear();  //clears all array's element
        System.out.println("All Array's elements are clear the array is: "+array2);
        array2.clone();


    }
}
