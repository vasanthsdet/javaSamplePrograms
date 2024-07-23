package string_manipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Find Nth Non-Repeating Charcter from given String
    I/P: swissy, 2nd
    O/P: y
 */

public class FindNthNonRepeatingCharcter {

    public static void main(String[] args) {
        System.out.println(findNthNonRepeatingCharcter("swissiy", 2));
    }

    private static char findNthNonRepeatingCharcter(String s, int n) {
        //Frequency Map
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        //Repeating Chars
        ArrayList<Character> nonRepeatingCharList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                nonRepeatingCharList.add(c);
            }
        }
        //Find Nth Repeating Charcter
        if (n > 0 && n <= nonRepeatingCharList.size()) {
            return nonRepeatingCharList.get(n-1);
        }

        return '\0';

    }


}
