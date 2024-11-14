import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class FileHandlingTellMeJoke
{
    public static void main(String[] args)
    {
        File myfile1 = new File("myfile1.txt");
        File myfile2 = new File("myfile2.txt");
        File myfile3 = new File("myfile3.txt");

        System.out.println("Welcome to joke teller program in file handling in java...");

        //DO NOT OPEAN THIS COMMENT ELSE THE PROGRAM CAN GIVES US AN ERROR...

        try{
            myfile2.createNewFile();
            myfile3.createNewFile();
            myfile1.createNewFile();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


        Scanner inpute = new Scanner(System.in);
        System.out.println("We have three jokes \n 1) Bivi based joke \n 2) joke on friends \n 3) joke on Doctors");
        System.out.print("Enter what you want to listen: ");
        int se = inpute.nextInt();

        switch (se)
        {
            case 1:
                //scanning the first file myfile1.txt
                try {
                    Scanner sc = new Scanner(myfile1);
                    while (sc.hasNextLine()) {
                        String Line = sc.nextLine();
                        System.out.println(Line);
                    }

                }catch(FileNotFoundException e)
                {
                    e.printStackTrace();
                }

                break;

            case 2:
                //scannig tne first file myfile2.txt
                try {
                    Scanner sc = new Scanner(myfile2);
                    while (sc.hasNextLine()) {
                        String Line = sc.nextLine();
                        System.out.println(Line);
                    }

                }catch(FileNotFoundException e)
                {
                    e.printStackTrace();
                }

                break;

            case 3:
                //scanning the 3rd file myfile3.txt
                try {
                    Scanner sc = new Scanner(myfile3);
                    while (sc.hasNextLine()) {
                        String Line = sc.nextLine();
                        System.out.println(Line);
                    }

                }catch(FileNotFoundException e)
                {
                    e.printStackTrace();
                }

                break;
        }

    }
}