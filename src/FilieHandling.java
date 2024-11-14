import java.io.*;
import java.util.Scanner;

public class FilieHandling {
    public static void main(String[] args) {

        Scanner inpute = new Scanner(System.in);

        File fileobj = new File("myfile2.txt");

        //gives the file size
        System.out.println(fileobj.length());

        //asking it is the permission to write in the file
        System.out.println(fileobj.canRead());

       try{
           //i want to open this file in appends mode so i will pass the true value on FileWriter class normally its not passed
           FileWriter filewrite = new FileWriter("myfile2.txt",true);

          // BufferedWriter bw = new BufferedWriter(filewrite);
          // PrintWriter pw = new PrintWriter(bw);

          // filewrite.write("\n This is the file writer class and writes the para in the txt file nex line.Thanks");

        //pw.println("Lucky");
           //pw.print(8389);
          // bw.append("sjakjds");

           filewrite.close();
          // bw.close();
           //pw.close();

       }catch (IOException e)
       {
           e.printStackTrace();
       }

        try {
            Scanner sc = new Scanner(fileobj);

            //reads the one word from the file.txt
            String line = sc.next();

            //read complite whole single line from the file.txt
            String line2 = sc.nextLine();

            System.out.println("the single word  is: "+line);
            System.out.println("The single line is: "+line2);

            //read whole para from the file.txt
            System.out.print("The whole para is: ");
            while (sc.hasNextLine())
            {
                String line3 = sc.nextLine();
                System.out.println(line3);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}