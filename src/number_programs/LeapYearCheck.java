package number_programs;

import java.util.Scanner;

/**
 * Leap Year Check
 * I/P: {Year}
 * O/P: {Year} is Leap Year
 */
public class LeapYearCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        System.out.println(year + " is " + (isLeapYear(year) ? "a " : "not a ") + "leap year");
    }

    private static boolean isLeapYear(int year) {
        if (year < 0) return false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
