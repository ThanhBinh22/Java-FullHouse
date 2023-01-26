package buoi5;

import java.util.Scanner;

public class Cau20 {
    public static boolean doiXung(int[] a, int n, int left, int right) {
        while (left <= right) {
            if (a[left] != a[right]) {
                return false;
            } else {
                return doiXung(a, n, left + 1, right - 1);
            }
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
        if (doiXung(a, n, 0, n - 1) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
