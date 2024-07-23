package string_manipulation;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
    Most repeating charcter from the given string
    I/P: swiggy
    O/P: g
 */
public class MostFrequentCharcter {

    public static void main(String[] args) {
        String s = "Swiggy";
        System.out.println("Most Frequent Character: " + mostFrequentCharacter(s));
    }

    private static char mostFrequentCharacter(String s) {
        char mostFreqChar = ' ';
        int maxCount = 0;;
        Map<Character, Integer> mostFrequentSet = new HashMap<>();
        for (char c : s.toCharArray()) {
            mostFrequentSet.put(c, mostFrequentSet.getOrDefault(c, 0) +1);
        }
        for (Map.Entry<Character, Integer> e: mostFrequentSet.entrySet()) {
            if (e.getValue() > maxCount) {
                mostFreqChar = e.getKey();
                maxCount = e.getValue();
            }
        }
        return mostFreqChar;
    }
}
