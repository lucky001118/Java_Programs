public class MathodsInJava
{
    //mathod with static keyword..
    static int sumNum(int a, int b)
    {
        int c;
        return c=a+b;
    }

    //Mathod without static keyword
    int sumThree(int x,int y, int z)
    {
        int re;
        return re=x+y+z;
    }
    public static void main(String[] args)
    {
        //it will printing the member without making the object of related class,Becouse the mathod has static keyword....
        System.out.print("The sum of two variable is: ");
        int result = sumNum(56,94);
        System.out.println(result);


        //Now if we have to access sumThree mathod then we have to make object that class and then we access that..
        MathodsInJava object = new MathodsInJava();  //making object of that MathodsIJava class..
        int result2;
       result2= object.sumThree(75,97788,765);   //accessing sumThree mathod with ocject of class.
        System.out.println(result2);
    }
}
