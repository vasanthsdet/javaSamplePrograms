package number_programs;

import java.util.Scanner;

/*
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
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
