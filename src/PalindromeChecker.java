import java.util.Scanner;
public class PalindromeChecker
{
    public static void main(String[] args) {

        Scanner inpute = new Scanner(System.in);
        String word;
        System.out.print("Enter the word to check palindrome: ");
        word = inpute.next();  //TAKING THE INPUT WORDS, AND TAKE IT IN VARIABLE word
        int sizeOfWord = word.length();   //Calculating the length of present characters in the word in word variable
        char reverseWordArray[];   //making the array for storing the reverse words
        reverseWordArray = new char[sizeOfWord]; //the word one by one character can not store in the String so we store it in character array

        //reversing the word using the for loop statement
        int i=0,j=0;
        for (i=sizeOfWord-1;i>=0;i--)
        {
            reverseWordArray[j]=word.charAt(i);  //storing the reverse word into character array
            j=j+1;  //incrementing the reverseWordArray's index value it start's with 0 and close with the size-1
        }

        //To converting the actual word from String object to character array
        char wordArray[];
        wordArray = new char[sizeOfWord];
        wordArray=word.toCharArray();  //convert the Word which is string into character array

        //compering the reverce word with actual word
        boolean notPalindrome = false;
        for (i=0;i<sizeOfWord;i++)  //This for loop for every index compering between wordArray and reverseWordArray
        {
            if (wordArray[i]==reverseWordArray[i])
            {
                continue;
            }
            else
            {
                System.out.println("The word is not palindrome.");
                notPalindrome = true; //this is for indicate if the word is not palindrome then notPalindrome is true
                break;
            }
        }
        if (notPalindrome==false)  //condition if notPalindrome false the print the palindrome massage
        {
            System.out.println("The word is the palindrome.");
        }

    }
}
