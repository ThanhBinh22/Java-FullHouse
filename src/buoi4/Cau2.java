package buoi4;

import java.util.Scanner;

public class Cau2 {
    public static boolean fibo(long n) {
        if (n == 0 || n == 1)
            return true;
        long f0 = 0, f1 = 1;
        for (int i = 3; i <= 93; i++) {
            long fn = f0 + f1;
            if (fn == n)
                return true;
            f0 = f1;
            f1 = fn;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (fibo(a[i]) == true) {
                System.out.print(a[i] + " ");
                count = 1;
            }
        }
        if (count == 0)
            System.out.print("NONE");
    }
}
