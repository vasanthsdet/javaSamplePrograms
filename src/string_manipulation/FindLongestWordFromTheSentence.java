package string_manipulation;

/*
    Find the longest word from the sentence
    I/P: Find the longest word from the sentence
    O/P: sentence
 */
public class FindLongestWordFromTheSentence {
    public static void main(String[] args) {
        String s = "Find the longest word from the sentence";
        System.out.println("Longest Word: " + findLongestWord(s));
    }
    private static String findLongestWord(String s) {
        String longestWord = "";
        for (String word : s.split("\\s")) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
