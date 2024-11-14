import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class SwingFileChooser {
    public  SwingFileChooser()
    {
        JFrame frame = new JFrame("Learning about JFileChooser");
        frame.setBounds(200,10,600,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button1 = new JButton("Open");
        JButton button2 = new JButton("Open-2");
        button1.setBounds(50,30,100,30);
        button2.setBounds(180,30,100,30);
        frame.add(button1);
        frame.add(button2);

        JLabel label1 = new JLabel("Open dialog and Save dialog");
        label1.setBounds(10,70,400,20);
        frame.add(label1);

        JButton button3 = new JButton("Open-File");
        JButton button4 = new JButton("Save-File");
        button3.setBounds(50,100,100,30);
        button4.setBounds(180,100,100,30);
        frame.add(button3);
        frame.add(button4);

        JLabel label2 = new JLabel("Open FileChooser to select directory only");
        label2.setBounds(10,140,400,20);
        frame.add(label2);
        JButton button5 = new JButton("Folder-only");
        button5.setBounds(50,170,100,30);
        frame.add(button5);

        JLabel label3 = new JLabel("To allows multipule file sections");
        label3.setBounds(10,200,400,20);
        frame.add(label3);
        JButton button6 = new JButton("Multiple-file");
        button6.setBounds(50,230,100,30);
        frame.add(button6);

        JLabel label4 = new JLabel("To apply filtering on files");
        label4.setBounds(10,260,400,20);
        frame.add(label4);
        JButton button7 = new JButton("Filtering");
        button7.setBounds(50,290,100,30);
        frame.add(button7);

        //This will help us to opne JFileChooser option simple only for selection of file
        JFileChooser fileChooser = new JFileChooser();  //creating the object of ----->>> FileChooser class

        //if we want to open the JFileChooser with any fixed location  then later we can change the location of folders/directories
        JFileChooser fileChooser2 = new JFileChooser("C:\\Users\\manik\\Desktop\\C++ & c");

        frame.setVisible(true);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int selectedoption = fileChooser.showDialog(null,"Open My File");  // ------->> creating the button "open my file" if it clicked then i twill return an integer value

                if(selectedoption==JFileChooser.APPROVE_OPTION)  //this line check if we selected the file then action performed
                {
                    System.out.println("Selected path is : "+fileChooser.getSelectedFile().getAbsolutePath());  //The line fileChooser.getSelectedFile().getAbsolutePath() --->> get the path of the selected file
                }
                else
                {
                    System.out.println("user cancelled hte dialog.");
                }
            }
        });

        //Listner for the fixed directory open JFileChoser.
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedoption = fileChooser2.showDialog(null,"Open My File");  // ------->> creating the button "open my file" if it clicked then i twill return an integer value

                if(selectedoption==JFileChooser.APPROVE_OPTION)  //this line check if we selected the file then action performed
                {
                    System.out.println("Selected path is : "+fileChooser2.getSelectedFile().getAbsolutePath());  //The line fileChooser2.getSelectedFile().getAbsolutePath() --->> get the path of the selected file
                }
                else
                {
                    System.out.println("user cancelled hte dialog.");
                }
            }
        });
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        //Listner for the Open file dialog box  ---------------->>> It will used to open any file in the any specified location in the specified directories.
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int selectedoption = fileChooser.showOpenDialog(null);  // ------->> creating opnen dialog for open the file

                if(selectedoption==JFileChooser.APPROVE_OPTION)  //this line check if we selected the file then action performed
                {
                    System.out.println("Selected path is : "+fileChooser.getSelectedFile().getAbsolutePath());  //The line fileChooser.getSelectedFile().getAbsolutePath() --->> get the path of the selected file
                }
                else
                {
                    System.out.println("user cancelled hte dialog.");
                }
            }
        });

        //Listner for the save file dialog box  ---------------->>> It will used to save any file in the any specified location in the specified directories.
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedoption = fileChooser2.showSaveDialog(null);  // ------->> creating the button for saving the file

                if(selectedoption==JFileChooser.APPROVE_OPTION)  //this line check if we selected the file then action performed
                {
                    System.out.println("Selected path is : "+fileChooser2.getSelectedFile().getAbsolutePath());  //The line fileChooser2.getSelectedFile().getAbsolutePath() --->> get the path of the selected file
                }
                else
                {
                    System.out.println("user cancelled hte dialog.");
                }
            }
        });

        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //to choose only folder
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);  //This line will restrict it to choose only the directories or folders only it will hides all files

                int selectedoption = fileChooser.showOpenDialog(null);  // ------->> creating opnen dialog for open the file

                if(selectedoption==JFileChooser.APPROVE_OPTION)  //this line check if we selected the file then action performed
                {
                    System.out.println("Selected path is : "+fileChooser.getSelectedFile().getAbsolutePath());  //The line fileChooser.getSelectedFile().getAbsolutePath() --->> get the path of the selected file
                }
                else
                {
                    System.out.println("user cancelled hte dialog.");
                }
            }
        });
        //----------------------------------------------------------------------------------------------------------------------------------------------------------
        //Chose multipule file in one open
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.setMultiSelectionEnabled(true);

               if(e.getActionCommand().equalsIgnoreCase("Multiple-file"))
               {
                   int selectedoption = fileChooser.showOpenDialog(null); // ------->> creating open dialog

                   if(selectedoption==JFileChooser.APPROVE_OPTION)  //this line check if we selected the file then action performed
                   {
                       File [] files = fileChooser.getSelectedFiles();
                       for (int i=0;i<files.length;i++)
                       {
                           File file=files[i];
                           System.out.println("Selected path is : "+file.getAbsolutePath());  //The line fileChooser.getSelectedFile().getAbsolutePath() --->> get the path of the selected file
                       }
                   }
                   else
                   {
                       System.out.println("user cancelled hte dialog.");
                   }
               }

            }
        });
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Applying the filttering the files
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.setMultiSelectionEnabled(true);
                fileChooser.setAcceptAllFileFilterUsed(false);
                FileNameExtensionFilter filter1 = new FileNameExtensionFilter("only Text files (.txt)","txt");
                FileNameExtensionFilter filter2 = new FileNameExtensionFilter("only HTML files (.html)","html");
                FileNameExtensionFilter filter3 = new FileNameExtensionFilter("only CSS files (.css)","css");
                FileNameExtensionFilter filter4 = new FileNameExtensionFilter("only Java files (.java)","java");
                fileChooser.addChoosableFileFilter(filter1);
                fileChooser.addChoosableFileFilter(filter2);
                fileChooser.addChoosableFileFilter(filter3);
                fileChooser.addChoosableFileFilter(filter4);

                int selectedoption = fileChooser.showDialog(null,"Open My File");  // ------->> creating the button "open my file" if it clicked then i twill return an integer value

                if(selectedoption==JFileChooser.APPROVE_OPTION)  //this line check if we selected the file then action performed
                {
                    System.out.println("Selected path is : "+fileChooser.getSelectedFile().getAbsolutePath());  //The line fileChooser.getSelectedFile().getAbsolutePath() --->> get the path of the selected file
                }
                else
                {
                    System.out.println("user cancelled hte dialog.");
                }
            }
        });


    }
    public static void main(String[] args) {
        new SwingFileChooser();

    }
}
