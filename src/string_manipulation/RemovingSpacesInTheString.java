package string_manipulation;

public class RemovingSpacesInTheString {

    public static void main(String[] args) {
        System.out.println("Remove Spaces : " + returnStringWithoutSpaces("Hello World"));
    }

    private static String returnStringWithoutSpaces(String s) {
        if (s.length() == 1) {
            return  s;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        return  sb.toString();
    }
}
