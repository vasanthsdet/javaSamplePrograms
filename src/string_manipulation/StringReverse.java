package string_manipulation;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(reverseString("Revathi Vasanth"));
    }

    private static String reverseString(String name) {
        char[] charArray = name.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
