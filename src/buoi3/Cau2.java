package buoi3;

import java.util.Scanner;

public class Cau2 {
    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(int n) {
        while (n != 0) {
            if (prime(n % 10) == true) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static boolean sum(int n) {
        int tong = 0;
        while (n != 0) {
            tong += n % 10;
            n /= 10;
        }
        if (prime(tong) == true) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            int count = 0;
            if (prime(i) == true && check(i) == true && sum(i) == true) {
                count++;
                System.out.println(count);
            }
        }

    }
}
