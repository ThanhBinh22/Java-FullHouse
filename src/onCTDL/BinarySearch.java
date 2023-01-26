package onCTDL;

import java.util.Scanner;

// 1 3 5 7 9 11 34
public class BinarySearch { // Giảm dần
    public static boolean binarySearch(int a[], int n, int x) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x)
                return true;
            else if (a[m] < x)
                r = m - 1;
            else
                l = m + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        if (binarySearch(a, n, x) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
