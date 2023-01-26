package buoi5;

import java.util.Scanner;

public class Cau8 {
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.print(gcd(a, b) + " ");
        System.out.print(lcm(a, b));
    }
}
