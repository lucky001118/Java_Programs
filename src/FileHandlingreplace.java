import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingreplace
{
    public static void main(String[] args) {
        File myfile = new File("repacefile.txt");

        /*
        //this for creating the replacefile.txt
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        */

        try {
            Scanner sc = new Scanner(myfile);
            String word = sc.nextLine();
            System.out.println(word);

            String newword = word.replace("is","Was");
            System.out.println(newword);

            FileWriter writes = new FileWriter(myfile);
            writes.write(newword);
            writes.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException i)
        {
            i.printStackTrace();
        }




    }
}
