/*Create a program that accepts a word as input and checks for each single character letter in
the word whether it is a consonant or vowel.
Condition:
a. Print an error message if the input is not a letter
b. If the input having more than one letter, print the required output
(Vowel or Consonant) for each letter*/
import java.util.Scanner;
public class Vow_Cons
{
    public static void main(String[] args)
    {
            System.out.println("Enter the String");
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            for (int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
                {
                    System.out.println("Vowel");
                }
                else
                {
                    System.out.println("Consonent");
                }
            }


    }
}
