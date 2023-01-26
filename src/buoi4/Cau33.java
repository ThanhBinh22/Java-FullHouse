package buoi4;

import java.util.Scanner;

public class Cau33 {

    public static void insertionSort(long[] a, int n) {
        int buoc = 2;
        for (int i = 1; i < n; i++) {
            long j = a[i];
            int pos = i - 1;
            while (pos >= 0 && j < a[pos]) {
                a[pos + 1] = a[pos];
                pos--;
            }
            a[pos + 1] = j;

            System.out.print("Buoc " + buoc + ":" + " ");
            buoc++;
            for (long x : a) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        System.out.print("Buoc 1: ");
        for (long x : a) {
            System.out.print(x + " ");
        }
        System.out.println("");
        insertionSort(a, n);
    }
}
