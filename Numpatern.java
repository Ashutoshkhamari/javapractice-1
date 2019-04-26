/*Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
        6 6 . . . nth iteration.*/
import java.util.Scanner;
public class Numpatern {
    public static void main(String[] args) {


        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i + " ");
            }
        }

    }
}
