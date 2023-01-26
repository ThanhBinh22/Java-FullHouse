package buoi4;

import java.util.Arrays;
import java.util.Scanner;

public class Cau31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long res = 0;
        for (int i = 0; i < n; i++) {
            res += (1l * a[i] * i);
            res %= 1000000007;
        }
        System.out.println(res);
    }
}
