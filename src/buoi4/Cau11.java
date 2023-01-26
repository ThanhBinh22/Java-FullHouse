package buoi4;

import java.util.Scanner;

public class Cau11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (a[0] == 50 || a[0] == 100) {
            System.out.println("NO");
            return;
        }
        int ok = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] + a[i + 1] == 50 || a[i] + a[i + 1] == 75 || a[i] + a[i + 1] == 150 || a[i] + a[i + 1] == 125) {
                ok = 1;
            } else {
                ok = 0;
            }

        }
        if (ok == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
