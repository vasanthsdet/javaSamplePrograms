package string_manipulation;

import java.util.HashMap;
import java.util.Map;

/*
    Anagram Check
    I/P: S1: Listen, S2: Silent
    O/P: Are Anagrams: true
 */

public class StringAnagramsCheck {

    public static void main(String[] args) {
        System.out.println("Are Anagrams: " + areAnagrams("Listen1", "Silent1"));
    }
    private static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return  false;
        //Count frequency of each charcter in s1
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toLowerCase().toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //Subtract frequency based on s2
        for (char c: s2.toLowerCase().toCharArray()) {
            if(!map.containsKey(c)) return false;
            map.put(c, map.get(c) -1);
            if (map.get(c) < 0) return  false;
        }
        return true;
    }
}
