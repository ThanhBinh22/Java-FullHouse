package buoi3;

import java.util.Scanner;

public class Cau15 {
    // public static boolean perfectNum(long n) {
    // long result = 0;
    // for (int i = 1; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // result += n / i;
    // result += i;
    // }
    // }
    // long tong = result - n;
    // if (tong == n)
    // return true;

    // return false;
    // }

    // O(1) : euclid euler
    public static boolean snt(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean hoanHao(long n) {
        for (int p = 2; p <= 32; p++) {
            if (snt(p) == true && snt((long) (Math.pow(2, p) - 1)) == true) {
                long hh = (long) (Math.pow(2, p) - 1) * (long) (Math.pow(2, p - 1));
                if (hh == n)
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (hoanHao(n) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

