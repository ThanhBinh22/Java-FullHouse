package buoi4;

import java.util.Arrays;
import java.util.Scanner;

public class Cau30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                x = x * 10 + a[i];
            } else {
                y = y * 10 + a[i];
            }
        }
        System.out.println(x + y);
    }

}