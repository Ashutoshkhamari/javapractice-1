/*Write a program that takes a character from the user as input and determines whether the
        character entered is a capital letter, a small case letter, a digit or a special symbol and display
        appropriately.*/
import java.util.Scanner;
public class Check_char
{
    public static void main(String[] args) {
        System.out.println("Enter the Character");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c>=65 && c<=90)
        {
            System.out.println("CAPITAL LETTER");
        }
        else if(c>=97 && c<=122)
        {
            System.out.println("SMALL LETTER");
        }
        else if(c>=48 && c<=57)
        {
            System.out.println("NUMBER");
        }
        else
        {
            System.out.println("SPECIAL CHAR");
        }


    }
}
