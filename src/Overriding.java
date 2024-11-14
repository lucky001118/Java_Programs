class Programmer
{
    void code()
    {
        System.out.println("This is code under the programmer");
    }
}
class Company extends Programmer
{
    @Override  //this sign will represents the method is overrides in driven class if you change name in anywhere in both then it will not override and it through error
    void code()
    {
        System.out.println("this is the another code but its under the company..");
    }
}
public class Overriding
{
    public static void main(String[] args)
    {
        Programmer pr = new Programmer();
        pr.code(); // it will runs the Programmer class code() methods
        Company cp = new Company();
        cp.code();  //it will indicate and exicutes the Company class code() method
    }
}
