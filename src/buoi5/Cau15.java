package buoi5;

import java.util.Scanner;

public class Cau15 {
    public static int maxNum(long n) {
        if (n < 10) {
            return (int) n;
        } else if (n % 10 > maxNum(n / 10)) {
            return (int) (n % 10);
        } else {
            return maxNum(n / 10);
        }
    }

    public static int minNum(long n) {
        if (n < 10) {
            return (int) n;
        } else if (n % 10 < minNum(n / 10)) {
            return (int)n % 10;
        } else {
            return minNum(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(maxNum(n) + " ");
        System.out.print(minNum(n));
    }
}
