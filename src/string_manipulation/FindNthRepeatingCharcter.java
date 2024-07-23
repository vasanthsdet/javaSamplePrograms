package string_manipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Find Nth Repeating Charcter from given String
    I/P: swissy, 2nd
    O/P: i
 */
public class FindNthRepeatingCharcter {

    public static void main(String[] args) {
        System.out.println(findNthRepeatingCharcter("swisggytt", 3));
    }


    private static char findNthRepeatingCharcter(String s, int n) {
        //frequency map
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        //Repeating List
        List<Character> repeatingList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (frequencyMap.get(c) > 1 && !repeatingList.contains(c)) {
                repeatingList.add(c);
            }
        }

        if (n >= 1 && n <= repeatingList.size()) {
            return repeatingList.get(n-1);
        }
        return '\0';
    }
}
