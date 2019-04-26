import java.util.Scanner;
public class Rev
{
    public static void main(String[] args)
    {
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String temp=" ";
        for(int i=s.length()-1;i>=0;i--)
        {
            temp+=s.charAt(i);

        }
        System.out.println(temp);


    }
}
