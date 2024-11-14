public class ArrayPractice
{
    public static void main(String[] args)
    {
        //mathod of intilising of array 1st mathod
       int array [] = {27,87,90,263,237,376234,342,34,32,233};
       //2nd mathod
       int array1[];
       array1 = new int[3];
       array1[0] = 100;
       array1[1] = 35;
       array1[2] = 86;
       //3rd mathod string array
        String array2[] = new String[6];
       array2[0]="Lucky";
       array2[1]="Ritika";
       array2[2]="Chandrashekhar";
       array2[3]="YAtish";
       array2[4]="Saurabh";
       array2[5]="Shashank";

       //for-each loop to accessing the arrays value
        System.out.println("This is the for-each loop and printing the 1st array: ");
        for(int element: array)
        {
            System.out.println(element);
        }
        //for loop
        System.out.println("This is the printing the array1: ");
        for (int i=0;i<array1.length;i++)
        {
            System.out.println(array1[i]);
        }
        //for-each loop in string
        System.out.println("This is the printing the array2 which is string array and printing with for-each loop: ");
        for (String element:array2)
        {
            System.out.println(element);
        }

    }
}
