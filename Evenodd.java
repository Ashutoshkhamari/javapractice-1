/*2. Write a program which accepts an integer number as input from the user and perform the
following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30*/
import java.util.Scanner;
public class Evenodd
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Integer");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n%2==0)&&(n>=20)&&(n<=30))
        {
            System.out.println("Jerry");
        }
        else if((n%2!=0)&&(n>=20)&&(n<=30))
        {
            System.out.println("Tom");
        }

    }
}
