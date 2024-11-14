import javax.lang.model.element.Name;
import java.util.Scanner;
public class LabEmployee
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        String Name[];
        Name = new String[6];
        String Department[];
        Department = new String[6];
        int age[];
        age = new int[6];
        int salery[];
        salery = new int[6];
        int j;
        for(j=1;j<=5;j++)
        {
            System.out.println("Enter employee detail for: "+j+" employee");
            System.out.println("Enter your name: ");
            Name[j]=input.next();
            System.out.println("Enter you Department: ");
            Department[j] = input.next();
            System.out.println("Enter your age: ");
            age[j] = input.nextInt();
            System.out.println("Enter your salery: ");
            salery[j] = input.nextInt();

        }

        for (j=1;j<=5;j++)
        {
            System.out.println("");
            System.out.println("employee No. "+j);
            System.out.println("Employee name is: "+Name[j]);
            System.out.println("Employee department is: "+Department[j]);
            System.out.println("age of employee is: "+age[j]);
            System.out.println("Salery of empolyee is: "+salery[j]);
            System.out.println(" ");

        }

    }

}
