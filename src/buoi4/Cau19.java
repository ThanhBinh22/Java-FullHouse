package buoi4;

import java.util.HashSet;
import java.util.Scanner;

public class Cau19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Long> set1 = new HashSet<>();
        HashSet<Long> set2 = new HashSet<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            set1.add(a[i]);
        }
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
            set2.add(b[j]);
        }
        HashSet<Long> hop = new HashSet<>();
        hop.addAll(set1);
        hop.addAll(set2);
        for (long x : hop) {
            System.out.print(x + " ");
        }
        System.out.println("");

        HashSet<Long> giao = new HashSet<>();
        giao.addAll(set1);
        giao.retainAll(set2);
        for (long x : giao) {
            System.out.print(x + " ");
        }
    }
}
