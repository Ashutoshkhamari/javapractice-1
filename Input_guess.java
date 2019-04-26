import java.io.*;
import java.util.*;
class Input_guess {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lower limit is 1. Guess the Upper Limit: ");
        n = sc.nextInt();
        while (n != 50) {
            if (n > 50)
                System.out.println("Go for a smaller number ");
            else
                System.out.println("Go for a larger number");
            n = sc.nextInt();
        }
        System.out.println("Yes, You guesses it right !!");
    }
}