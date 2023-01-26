package buoi5;

import java.util.Scanner;

public class Cau17 {
    public static long tinhChan(long n) {
        if (n == 0) {
            return 0;
        } else if ((n % 10) % 2 == 0) {
            return n % 10 + tinhChan(n / 10);
        } else {
            return tinhChan(n / 10);
        }
    }

    public static long tinhLe(long n) {
        if (n == 0) {
            return 0;
        } else if ((n % 10) % 2 != 0) {
            return n % 10 + tinhLe(n / 10);
        } else {
            return tinhLe(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(tinhChan(n));
        System.out.println(tinhLe(n));
    }
}
