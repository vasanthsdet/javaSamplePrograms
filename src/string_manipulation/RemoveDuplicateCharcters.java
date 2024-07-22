package string_manipulation;

import java.util.HashSet;
import java.util.Set;

/*
    Remove duplicate characters from the string
    I/P: aaaabbbbcccdddd
    O/P: abcd
 */
public class RemoveDuplicateCharcters {
    public static void main(String[] args) {
        System.out.println("String without duplicates: " + removeDuplicateChars("aaabbbccddd"));
    }

    private static String removeDuplicateChars(String s) {
        Set<Character> seenSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!seenSet.contains(c)) {
                seenSet.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
