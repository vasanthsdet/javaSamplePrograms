package number_programs;

import java.util.Scanner;

public class PrimeNumbersPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PrimeNumber Range: ");
        int range = sc.nextInt();
        for (int i = 0; i <= range; i++) {
            if (isPrimeNumber(i)) System.out.print(i + " ");
        }
    }


    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n ; i++) {
            if (n % i == 0) return  false;
        }
        return true;
    }
}
