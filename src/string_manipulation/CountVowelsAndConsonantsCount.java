package string_manipulation;

import java.util.HashSet;
import java.util.Set;

public class CountVowelsAndConsonantsCount {

    public static void main(String[] args) {
        countVowelsAndConsonantsCount("Hello World");
    }
    private static void countVowelsAndConsonantsCount(String s) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        Set<Character> vowelsSet = new HashSet<>();
        for(char c: "aeiouAEIOU".toCharArray()) {
            vowelsSet.add(c);
        }
        for (char c: s.toCharArray()) {
            if (vowelsSet.contains(c)) {
                vowelsCount++;
            } else {
                if (c != ' ') consonantsCount++;
            }
        }
        System.out.println("Vowels Count: " + vowelsCount);
        System.out.println("Consonants Count: " + consonantsCount);
    }
}
