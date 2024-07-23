package string_manipulation;

import java.util.HashSet;
import java.util.Set;

/*
    Remove Vowels from given String
    I/P: Revathi
    O/P: Rvth
 */
public class VowelsRemove {
    public static void main(String[] args) {
        System.out.println("String with out vowels: " + vowelsRemove("Vasanth"));
    }

    private static String vowelsRemove(String s) {
        Set<Character> vowelSet = returnVowelsSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!vowelSet.contains(c)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    private static Set<Character> returnVowelsSet() {
        Set<Character> vowelsSet = new HashSet<>();
        vowelsSet.add('a');
        vowelsSet.add('e');
        vowelsSet.add('i');
        vowelsSet.add('o');
        vowelsSet.add('u');
        vowelsSet.add('A');
        vowelsSet.add('E');
        vowelsSet.add('I');
        vowelsSet.add('O');
        vowelsSet.add('U');


        return vowelsSet;
    }
}
