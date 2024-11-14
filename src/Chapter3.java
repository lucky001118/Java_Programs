import java.util.Locale;

public class Chapter3
{
    public static void main(String[] args)
    {
        String  str= "Lucky";
        System.out.println(str);

        int a = str.length();
        System.out.println("Prints the lenght of atr: "+a);

        String newstr = str.toLowerCase(Locale.ROOT);
        System.out.println("toLowerCase(): "+ newstr);

        System.out.println("toUpperCase(): "+str.toUpperCase());

        String str1 = "     Lucky_manikpuri       ";
        System.out.println("trim(): "+str1.trim());

        String str2 = "Lucky_Manikpuri";
        System.out.println("Substring(): "+str2.substring(3));
        System.out.println("subString(start,end): "+str2.substring(4,7));

        System.out.println("replace(): "+str2.replace("u","oo"));

        System.out.println("StartsWith(): "+str2.startsWith("Luc"));
        System.out.println("endsWith(): "+str2.endsWith("uri"));

        System.out.println("charAt(): "+str2.charAt(4));

        System.out.println("indexOf(): "+str2.indexOf("_"));
        System.out.println("indexOf(string,int): "+str2.indexOf("M",1));

        System.out.println("LastIndexOf(): "+str2.lastIndexOf("u"));
        System.out.println("LastIndexOf(char,int): "+str2.lastIndexOf("u",5));
        System.out.println("LastIndexOf(char,int): "+str2.lastIndexOf("u",13));

        System.out.println("equals(string): "+str.equals("Lucky"));
        System.out.println("equals(string): "+str.equals("lucky"));

        System.out.println("equalsIgnore(): "+str.equalsIgnoreCase("lucky"));


    }

}
