import java.io.*;
import java.util.*;
import java.lang.*;
class Ntimes {
    public static void main(String[] args) {
        String a;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        i = s.length() - n;
        a = s.substring(i);
        for (int j = 1; j <= n; j++) {
            s = s.concat(a);
        }
        System.out.println("Output: " + s);
    }
}