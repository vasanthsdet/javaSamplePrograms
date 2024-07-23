package string_manipulation;

public class StringRotationCheck {

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 =  "ewaterbottl";
        System.out.println("Is Rotation: " + isRotationCheck(s1, s2));
    }

    private static boolean isRotationCheck(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String concatenated = s1 + s1;
        return containsSubString(concatenated, s2);

    }

    private static boolean containsSubString(String concatenated, String s2) {
        for (int i = 0; i < concatenated.length() - s2.length(); i++) {
            int j;
            for (j = 0; j < s2.length(); j++) {
                if (concatenated.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            if (j == s2.length()) {
                return true;
            }
        }
        return false;
    }
}
