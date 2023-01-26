package buoi4;

import java.util.Scanner;

public class Cau7 {
    public static boolean doiXung(int a[], int n) {
        int L = 0, R = n - 1;
        while (L <= R) {
            if (a[L] != a[R])
                return false;
            L++;
            R--;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (doiXung(a, n) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
