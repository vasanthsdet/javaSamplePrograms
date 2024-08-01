package number_programs;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return org == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int x = sc.nextInt();
        System.out.println(x + " is a " + (isPalindrome(x) ? "" : "not ") + "palindrome" );
    }
}
