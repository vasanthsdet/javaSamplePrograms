package number_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeriesPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        int range = sc.nextInt();
        ArrayList<Integer> list = printFibonacciNumbers(range);
        System.out.println("\n Prime Numbers in Fibonacci");
        for (int number : list) {
            if (PrimeNumbersPrint.isPrimeNumber(number)) System.out.print( number + " ");
        }
    }

    private static ArrayList<Integer> printFibonacciNumbers(int range) {
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci series up to " + range + " terms:");
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        for (int i = 0; i <= range ; i++) {
            System.out.print(a + " ");
            fibonacciNumbers.add(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
        return fibonacciNumbers;
    }
}
