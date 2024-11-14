import java.util.Scanner;
class Cylinder
{
    private int reduis;
    private int hieght;
    public void setReduis(int r)
    {
        reduis=r;
    }
    public void setHieght(int h)
    {
        hieght=h;
    }
    public int getReduis()
    {
        return reduis;
    }
    public int getHieght()
    {
        return hieght;
    }
//creating constructor for the class Cylinder
    Cylinder()
    {
        reduis=3647;
        hieght=3670;
    }
    //overloding the cunstructor
    Cylinder(int r, int h)
    {
        reduis=r;
        hieght=h;
    }
    Cylinder(int r)
    {
        reduis=r;
        hieght=3455;
    }
    //calculating the surface area of cylinder
    public double surfaceArea()
    {
        double result = 2*Math.PI*reduis*hieght+2*Math.PI*reduis*reduis;
        return result;
    }
    //calculating the valume of cylinder
    public double volume()
    {
        return Math.PI*reduis*reduis*hieght;
    }
}
public class Chapter9Practice
{
    public static void main(String[] args)
    {
        Scanner inpute = new Scanner(System.in);
        Cylinder cy = new Cylinder();

        //creating the constructor overloding
       // Cylinder cy = new Cylinder(49,41);
       // Cylinder cy = new Cylinder(49);

       /*
       //here is setter msthods are present
        System.out.println("Please enter redius and hieght one by one: ");
        int re = inpute.nextInt();
        cy.setReduis(re);
        int hi = inpute.nextInt();
        cy.setHieght(hi);
        */

        System.out.println("The redius is: "+cy.getReduis());
        System.out.println("The height is: "+cy.getHieght());

        //calling surface area function
        System.out.println("The surface area of the cylinder is: "+cy.surfaceArea());
        System.out.println("The volume of cylinder is: "+cy.volume());

        //if we forget to pass the argument of redius and hieght any of one or both then constructor will run this case
    }
}
