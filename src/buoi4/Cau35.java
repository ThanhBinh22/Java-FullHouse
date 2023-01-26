package buoi4;

import java.util.Scanner;

public class Cau35 {
    // public static int differenceNum(int a[], int n) {
    // int res = 1;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < i; j++) {
    // if (a[i] == a[j]) {
    // break;
    // }
    // if (i == j) {
    // res++;
    // }
    // }

    // }
    // return res;
    // }
    public static int dem(int a[], int n) {
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (i == j) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(dem(a, n));
    }
}
