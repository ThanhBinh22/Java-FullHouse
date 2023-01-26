package buoi5;

import java.util.Scanner;

public class Cau19 {
    public static boolean check(int a[], int n) {
        if (n == 1) {
            if (a[n] % 2 == 0)
                return true;
            else
                return false;
        } else {
            if (a[n] % 2 == 0)
                return check(a, --n);
            else
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (check(a, n-1) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
