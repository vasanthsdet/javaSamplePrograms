package string_manipulation;


/*
    Convert string of the format "a2b3c4" into "aabbbcccc"
 */
public class ExpandString {

    public static void main(String[] args) {
        String s = "a1b3c5";
        System.out.println("Expanded string: " + expandString(s));
    }

    private static String expandString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //Check if the next charcter is number
            if (i+1 < s.length() && Character.isDigit(s.charAt(i+1))) {
                int count = s.charAt(i+1) - '0';
                for (int j = 0; j < count; j++) {
                    sb.append(ch);
                }
                i++; //skip digit charcter
            } else {
                sb.append(ch);
            }

        }
        return sb.toString();
    }
}
