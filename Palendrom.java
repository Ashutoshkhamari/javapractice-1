/*1. Write a program which accepts a number as input and check whether the given number is
palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.
b. Print success and failure messages for all 3 conditions*/

import java.util.Scanner;
public class Palendrom {
    public static void main(String[] args)
    {
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int sum1=0;
        while(n>0)
        {
            int r=n%10;
            sum=(sum*10)+r;
            n=n/10;
            if(r%2==0)
                sum1=sum1+r;
        }
        if (temp==sum)
        {
            System.out.println("YOO... Number is Palendrum");
            if(sum1>=25)
                System.out.println("The sum is greater than 25. Sum is :"+sum1);
            else
                System.out.println("The sum is lower than 25. Sum is :"+sum1);
        }
        else
        {
            System.out.println("Nope.. Number is Not Palendrum");
        }
    }
}
