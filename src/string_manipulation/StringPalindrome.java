package string_manipulation;

/*
    String palindrome check
    I/P: radar
    O/P: Is Palindrome: true
 */

public class StringPalindrome {

    public static void main(String[] args) {
        System.out.println("Is Palindrome: " + isPalindrome("radar"));
    }


    private static boolean isPalindrome(String s) {
        //char[] charArray = s.toCharArray(); - correct
        int left = 0;
        int right = s.length() - 1;
        //int right = charArray.length-1; - correct
        while (left < right) {
            //if (charArray[left] != charArray[right]) return false;
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
