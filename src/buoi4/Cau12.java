package buoi4;

import java.util.Scanner;

public class Cau12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        System.out.print(Math.abs(a[0] - a[1]) + " ");
        System.out.println(Math.abs(a[n - 1] - a[0]));
        for (int i = 1; i < n - 1; i++) {
            if ((Math.abs(a[i] - a[i - 1])) < (Math.abs(a[i] - a[i + 1]))) {
                System.out.print(Math.abs(a[i] - a[i - 1]) + " ");
            } else {
                System.out.print(Math.abs(a[i] - a[i + 1]) + " ");
            }

            if ((Math.abs(a[i] - a[0])) < (Math.abs(a[i] - a[n - 1]))) {
                System.out.println(Math.abs(a[i] - a[n - 1]));
            } else {
                System.out.println(Math.abs(a[i] - a[0]));
            }
        }
        System.out.print(Math.abs(a[n - 1] - a[n - 2]) + " ");
        System.out.print(Math.abs(a[n - 1] - a[0]));
    }
}
