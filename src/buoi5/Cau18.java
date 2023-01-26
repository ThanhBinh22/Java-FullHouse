package buoi5;

import java.util.Scanner;

public class Cau18 {
    // public static long check(long n) {
    // if (n == 0) {
    // return 0;
    // } else if ((n % 10) % 2 == 0) {
    // return n % 10 + check(n / 10);
    // } else {
    // return 1;
    // }
    // }
    public static boolean check(long n) {
        if (n < 10) {
            if (n % 2 == 0)
                return true;
            else
                return false;
        } else {
            if (n % 10 % 2 == 0)
                return check(n / 10);
            else
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        // if (check(n) % 2 == 0){
        // System.out.println("YES");
        // } else {
        // System.out.println("NO");
        // }
        if (check(n) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
