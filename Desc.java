/*Write a program which accepts a number as input from user and perform the following:
a. sort the number in non-increasing order
b. after sorting sum all the even numbers, the sum should be greater than 15 .
c. if sum is more than 15,then print output as true or false*/
import java.util.Scanner;
public class Desc
{

    public static void main(String[] args)
    {
        System.out.println("Enter the limti:-");
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (arr[i]<arr[j])
                {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            if(arr[i]%2==0)
            {
                sum+=arr[i];
            }
        }
        System.out.println(" ");
        if (sum>=15)
        {
            System.out.println(sum+"True");

        }
        else
        {
            System.out.println(sum+"False");
        }


    }
}
