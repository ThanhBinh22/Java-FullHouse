package test;

import java.util.Scanner;

public class KiemTra {
    // public static long uocLN(long a, long b){
    // if (b == 0) return a;
    // else return uocLN(b, a%b);
    // }
    // public static long boiNN(long a, long b){
    // return (a * b)/uocLN(a, b);
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // long a = sc.nextLong();
    // long b = sc.nextLong();
    // System.out.print(uocLN(a, b));
    // System.out.print(" " + boiNN(a, b));
    // }
    public static boolean binary(int[] a, int n, int x) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) {
                return true;
            } else if (a[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
    a[i] = sc.nextInt();
    }
    int t = sc.nextInt();
    while (t-- > 0) {
    int x = sc.nextInt();
    if (binary(a, n, x) == true) {
    System.out.println("Yes");
    } else {
    System.out.println("NO");
    }
    }

    // // }
    // public static int count[] = new int[1000001];

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] a = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         a[i] = sc.nextInt();
    //         count[a[i]]++;
    //     }
    //     for (int i = 0; i < 1000000; i++) {
    //         if (count[i] != 0) {
    //             System.out.println(i + " " + count[i]);
    //         }
    //     }
    //     System.out.println("");
    //     for (int i = 0; i < n; i++) {
    //         if (count[a[i]] != 0) {
    //             System.out.println(a[i] + " " + count[a[i]]);
    //             count[a[i]] = 0;
    //         }
    //     }
    // }
}
