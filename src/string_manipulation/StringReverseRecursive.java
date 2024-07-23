package string_manipulation;

/*
    String Reverse Using Recursive
    I/P: Revathi
    O/P: ihtaveR
 */

public class StringReverseRecursive {

    public static void main(String[] args) {
        System.out.println(recursiveReverse("Revathi Vasanth"));
    }

    private static String recursiveReverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        return recursiveReverse(s.substring(1)) + s.charAt(0);

    }
}
